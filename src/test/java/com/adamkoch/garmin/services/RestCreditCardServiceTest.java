package com.adamkoch.garmin.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class RestCreditCardServiceTest {

  @Test
  void parse() throws IOException {

    String responseText = Files.readString(Path.of("src/test/resources/creditCards.json"));
    RestCreditCardService.parseResponse(responseText);
  }

}