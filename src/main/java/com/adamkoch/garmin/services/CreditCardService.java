package com.adamkoch.garmin.services;

import com.adamkoch.garmin.model.CreditCard;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CreditCardService {

  // I don't like that all 3 parameters are Strings. I might introduce a parameter object.
  CompletableFuture<List<CreditCard>> getCreditCards(String token, String userId, String creditCardState);
}
