package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.Device;
import com.adamkoch.garmin.model.UserResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.web.reactive.function.client.WebClient;

public class RestDeviceService extends AbstractRestService implements DeviceService {

  public RestDeviceService(final WebClient webClient) {
    super(webClient);
  }

  @Override
  public CompletableFuture<List<Device>> getDevices(final String token, final String userId,
      final String deviceState) {
    return callService(token, userId, "/devices").thenApply(RestDeviceService::parseResponse);
  }

  // VisibleForTesting
  static List<Device> parseResponse(final String responseText) {
    return parseResponse(responseText, UserResponse.class).getDevices();
  }
}
