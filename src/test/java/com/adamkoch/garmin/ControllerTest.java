package com.adamkoch.garmin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import com.adamkoch.garmin.controller.Controller;
import com.adamkoch.garmin.model.User;
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

  @Test
  public void contextLoads() throws Exception {
    assertThat(controller, is(notNullValue()));
  }

  @Test
  void composite() {

//
//    WebClient webClient = WebClient.builder()
//                                   .baseUrl("http://localhost:8080/compositeUsers/")
//                                   .defaultUriVariables(Map.of("test", Boolean.TRUE))
//                                   .defaultHeaders(header -> header.setBearerAuth(token))
//                                   .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
//                                   .build();
//
//
//    WebClient webClient = WebClient.builder()
//                                   .baseUrl("https://localhost:8080/users/")
//                                   .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
////                                   .defaultHeaders(header -> header.setBearerAuth(token))
//                                   .build();
//
//    final String userId = "132fc356-a6ab-4abe-867d-86c493a607cc";
//    final Mono<User> responseMono = webClient.get().uri(userId)
//                                                 .retrieve()
//                                                 .bodyToMono(User.class);
//
//
//    User expectedUser = new User();
//    expectedUser.setId(userId);
//    assertThat(responseMono.block(), equalTo(expectedUser));
  }

  @Test
  void error() {
  }
}