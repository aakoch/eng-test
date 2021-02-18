package com.adamkoch.garmin.controller;

import static org.apache.logging.log4j.LogManager.*;
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
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

//  GET https://api.qa.fitpay.ninja/users/:userId
//  GET https://api.qa.fitpay.ninja/users/:userId/devices
//  GET https://api.qa.fitpay.ninja/users/:userId/creditCards

  public Controller() {
    LOGGER.info("Starting controller");
  }

  @GetMapping("/compositeUsers/{userId}")
  public User composite(
      @PathVariable String userId,
      @RequestParam(value = "creditCardState", required = false) String creditCardState,
      @RequestParam(value = "deviceState", required = false) String deviceState,
      @RequestParam(value = "test", required = false) boolean testing) throws Throwable {

    LOGGER
        .info("entering controller: userId={}, creditCardState={}, deviceState={}, testing={}", userId, creditCardState,
              deviceState, testing);

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

    try {
      allOf.join();

      UserResponse userResponse = userFuture.get();
      user.setId(userResponse.getUserId());

      List<CreditCard> creditCards = creditCardsFuture.get();
      user.setCreditCards(creditCards);

      List<Device> devices = devicesFuture.get();
      user.setDevices(devices);

      user.add(linkTo(methodOn(Controller.class).composite(userId, creditCardState, deviceState, testing)).withSelfRel());

    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    catch (ExecutionException e) {
      throw e.getCause();
    }

    return user;
  }

  private boolean isDeviceStateValid(final String deviceState) {
    return deviceState != null && !deviceState.isBlank() && deviceStatePattern.matcher(deviceState).matches();
  }

  private boolean isCreditCardStateValid(final String creditCardState) {
    return creditCardState != null && !creditCardState.isBlank() && creditCardStatePattern.matcher(creditCardState).matches();
  }

//  private List<CreditCard> createTestCreditCards() {
//    return null;
//  }
//
//  private List<Device> createTestDevices() {
//    return null;
//  }

//  @ExceptionHandler(Exception.class)
//  @GetMapping("/error")
//  public String error(Exception e) {
//    e.printStackTrace();
//    return "Error: " + e.getMessage();
//  }

//  @GetMapping("/error")
//  public String error() {
//    return "Error";
//  }

//  private User createTestUser() {
//    User user = new User();
//    user.setId("132fc356-a6ab-4abe-867d-86c493a607cc");
//    return user;
//  }

}