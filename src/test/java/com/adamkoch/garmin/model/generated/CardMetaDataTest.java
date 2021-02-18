package com.adamkoch.garmin.model.generated;

import static org.junit.jupiter.api.Assertions.*;

import com.adamkoch.garmin.model.CreditCardsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class CardMetaDataTest {

  @Test
  void test() throws IOException {
    final String s = Files.readString(Path.of("/Users/aakoch/projects/garmin/src/test/resources/creditCardMetaData.json"));


    ObjectMapper mapper = new ObjectMapper();
    final CardMetaData cardMetaData = mapper.readValue(s, CardMetaData.class);
    System.out.println("CardMetaData = " + cardMetaData);
  }

}