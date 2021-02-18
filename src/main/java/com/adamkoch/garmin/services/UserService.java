package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.User;
import com.adamkoch.garmin.model.UserResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import reactor.core.publisher.Mono;

public interface UserService {

  CompletableFuture<UserResponse> getUser(final String token, final String userId);
}
