package com.adamkoch.garmin.model;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class CreditCardTest {

  @Test
  void test() throws IOException {
    final String s = Files.readString(Path.of("/Users/aakoch/projects/garmin/src/test/resources/creditCards.json"));


    ObjectMapper mapper = new ObjectMapper();
    final CreditCardsResponse creditCardResponse = mapper.readValue(s, CreditCardsResponse.class);
    System.out.println("creditCardResponse = " + creditCardResponse);
  }

}