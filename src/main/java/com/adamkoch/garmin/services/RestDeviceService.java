package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.Device;
import com.adamkoch.garmin.model.UserResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.springframework.web.reactive.function.client.WebClient;

public class RestDeviceService extends AbstractRestService implements DeviceService {

  public RestDeviceService(final WebClient webClient) {
    super(webClient);
  }

  @Override
  public CompletableFuture<List<Device>> getDevices(final String token, final String userId,
      final String deviceState) {
    return callService(token, userId, "/devices").thenApply(RestDeviceService::parseResponse).thenApply(devices -> {
      return devices.stream().filter(device -> device.getState().equals(deviceState)).collect(Collectors.toList());
    });
  }

  // VisibleForTesting
  static List<Device> parseResponse(final String responseText) {
    return parseResponse(responseText, UserResponse.class).getDevices();
  }
}
