package com.adamkoch.garmin.controller;

import static org.apache.logging.log4j.LogManager.getLogger;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.adamkoch.garmin.model.CreditCard;
import com.adamkoch.garmin.model.Device;
import com.adamkoch.garmin.model.User;
import com.adamkoch.garmin.model.UserResponse;
import com.adamkoch.garmin.services.CreditCardService;
import com.adamkoch.garmin.services.DeviceService;
import com.adamkoch.garmin.services.TokenService;
import com.adamkoch.garmin.services.UserService;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private static final Logger LOGGER = getLogger(Controller.class);

  @Autowired
  private UserService userService;

  @Autowired
  private CreditCardService creditCardService;

  @Autowired
  private DeviceService deviceService;

  @Autowired
  private TokenService tokenService;

  private Pattern creditCardStatePattern = Pattern.compile("[a-zA-Z_]{1,20}");

  private Pattern deviceStatePattern = Pattern.compile("[a-zA-Z_]{1,20}");

  public Controller() {
    LOGGER.info("Starting controller");
  }

  @GetMapping(path = "/compositeUsers/{userId}", produces = "application/json")
  public User composite(
      @PathVariable String userId,
      @RequestParam(value = "creditCardState", required = false) String creditCardState,
      @RequestParam(value = "deviceState", required = false) String deviceState) {

    try {
      LOGGER
          .info("entering controller: userId={}, creditCardState={}, deviceState={}", userId,
                creditCardState,
                deviceState);

      if (creditCardState != null && !isCreditCardStateValid(creditCardState)) {
        throw new IllegalArgumentException("creditCardState is not valid");
      }

      if (deviceState != null && !isDeviceStateValid(deviceState)) {
        throw new IllegalArgumentException("deviceState is not valid");
      }

      String token = tokenService.getToken();

      final CompletableFuture<UserResponse> userFuture = userService.getUser(token, userId);

      final CompletableFuture<List<CreditCard>> creditCardsFuture = creditCardService
          .getCreditCards(token, userId, creditCardState);

      final CompletableFuture<List<Device>> devicesFuture = deviceService
          .getDevices(token, userId, deviceState);

      final CompletableFuture<Void> allOf = CompletableFuture
          .allOf(userFuture, creditCardsFuture, devicesFuture);

      User user = new User();

      allOf.join();

      UserResponse userResponse = userFuture.get();
      user.setId(userResponse.getUserId());

      List<CreditCard> creditCards = creditCardsFuture.get();
      user.setCreditCards(creditCards);

      List<Device> devices = devicesFuture.get();
      user.setDevices(devices);

      user.add(
          linkTo(methodOn(Controller.class).composite(userId, creditCardState, deviceState)).withSelfRel());

      return user;
    }
    catch (IllegalArgumentException e) {
      throw e;
    }
    catch (Exception e) {
      throw new InternalException();
    }

  }

  @ExceptionHandler(IllegalArgumentException.class)
  String handleIllegalArgumentException(IllegalArgumentException e) {
    return e.getMessage();
  }

  @ExceptionHandler(InternalException.class)
  String handleInternalException(Exception e) {
    return "I'm sorry, but an internal error has happened. Please contact support.";
  }

  private boolean isCreditCardStateValid(final String creditCardState) {
    return creditCardState != null && !creditCardState.isBlank() && creditCardStatePattern.matcher(creditCardState)
                                                                                          .matches();
  }

  private boolean isDeviceStateValid(final String deviceState) {
    return deviceState != null && !deviceState.isBlank() && deviceStatePattern.matcher(deviceState).matches();
  }

  private class InternalException extends RuntimeException {

  }

}