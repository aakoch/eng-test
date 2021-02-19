package com.adamkoch.garmin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.adamkoch.garmin.controller.Controller;
import com.adamkoch.garmin.model.User;
import com.adamkoch.garmin.services.TokenService;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootTest
class ControllerTest {

  @Autowired
  private Controller controller;

  @Autowired
  private TokenService tokenService;

  @Test
  public void contextLoads() {
    assertThat(controller, is(notNullValue()));
  }

  @Test
  void composite() {
    WebClient webClient = WebClient.builder()
                                   .baseUrl("http://localhost:8080/compositeUsers/")
                                   .defaultHeaders(header -> header.setBearerAuth(tokenService.getToken()))
                                   .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                                   .build();

    final String userId = "132fc356-a6ab-4abe-867d-86c493a607cc";
    final Mono<User> responseMono = webClient.get().uri(userId)
                                                 .retrieve()
                                                 .bodyToMono(User.class);
    final User user = responseMono.block();
    assertNotNull(user);
    assertEquals(userId, user.getId());
    assertNotNull(user.getCreditCards());
    assertNotNull(user.getDevices());
  }

}