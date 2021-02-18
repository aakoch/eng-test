package com.adamkoch.garmin.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.adamkoch.garmin.model.User;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

class RestUserServiceTest {

  private static TokenService tokenService;
  private static String token;

  @BeforeAll
  static void getToken() {
    tokenService = new RestTokenService();
    token = tokenService.getToken();
  }

//  @Test
//  void test() throws ExecutionException, InterruptedException {
//    WebClient webClient = WebClient.builder()
//                                   .baseUrl("http://localhost:8080/compositeUsers/")
//                                   .defaultUriVariables(Map.of("test", Boolean.TRUE))
//                                   .defaultHeaders(header -> header.setBearerAuth(token))
//                                   .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
//                                   .build();
//
//    RestUserService service = new RestUserService(webClient);
//    User actualUser = service.getUser(token, "132fc356-a6ab-4abe-867d-86c493a607cc").get();
//    User expectedUser = createExpectedUser();
//    assertEquals(expectedUser, actualUser);
//  }
//
//  private User createExpectedUser() {
//    User user = new User("132fc356-a6ab-4abe-867d-86c493a607cc");
//    return user;
//  }

  @Test
  void parse() {
    String responseText = "{\"_links\":{\"self\":{\"href\":\"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc\"},\"eventStream.dynamic\":{\"href\":\"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/eventStream?{&events*}{&redirect}\",\"templated\":true},\"creditCards\":{\"href\":\"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/creditCards\"},\"devices\":{\"href\":\"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices\"},\"paymentDevices\":{\"href\":\"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices?capabilities=SE_CONTACTLESS_PAYMENT\"},\"webapp.wallet\":{\"href\":\"https://webapp.qa.fitpay.ninja/wallet?config={config}\",\"templated\":true},\"webapp.addCard\":{\"href\":\"https://webapp.qa.fitpay.ninja/wallet/add-card?config={config}\",\"templated\":true}},\"id\":\"132fc356-a6ab-4abe-867d-86c493a607cc\",\"createdTs\":\"2021-02-17T17:59:18.840Z\",\"createdTsEpoch\":1613584758840,\"lastModifiedTs\":\"2021-02-17T17:59:18.840Z\",\"lastModifiedTsEpoch\":1613584758840,\"encryptedData\":{\"encryptedDataSkipped\":\"encryptedData has been skipped, no fp-key-id specified\"},\"userId\":\"132fc356-a6ab-4abe-867d-86c493a607cc\"}";
    RestUserService.parseResponse(responseText);
  }

}