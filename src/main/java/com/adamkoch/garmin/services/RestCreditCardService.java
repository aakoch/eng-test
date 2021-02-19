package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.CreditCard;
import com.adamkoch.garmin.model.CreditCardsResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.springframework.web.reactive.function.client.WebClient;

public class RestCreditCardService extends AbstractRestService implements CreditCardService {

  public RestCreditCardService(final WebClient webClient) {
    super(webClient);
  }

  @Override
  public CompletableFuture<List<CreditCard>> getCreditCards(final String token, final String userId,
      final String creditCardState) {
    return callService(token, userId, "/creditCards").thenApply(RestCreditCardService::parseResponse).thenApply(devices -> {
      return devices.stream().filter(creditCard -> creditCard.getState().equals(creditCardState)).collect(Collectors.toList());
    });
  }

  // VisibleForTesting
  static List<CreditCard> parseResponse(final String responseText) {
    return parseResponse(responseText, CreditCardsResponse.class).getResults();
  }
}
