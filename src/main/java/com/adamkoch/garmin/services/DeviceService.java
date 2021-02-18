package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.Device;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface DeviceService {

  // I don't like that all 3 parameters are Strings. I might introduce a parameter object.
  CompletableFuture<List<Device>> getDevices(String token, String userId, String deviceState);

}
