package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.UserResponse;
import java.util.concurrent.CompletableFuture;
import org.springframework.web.reactive.function.client.WebClient;

public class RestUserService extends AbstractRestService implements UserService {

  public RestUserService(final WebClient webClient) {
    super(webClient);
  }

  @Override
  public CompletableFuture<UserResponse> getUser(final String token, final String userId) {
    return callService(token, userId, "").thenApply(RestUserService::parseResponse);
  }

  // VisibleForTesting
  static UserResponse parseResponse(final String responseText) {
    return parseResponse(responseText, UserResponse.class);
  }
}
