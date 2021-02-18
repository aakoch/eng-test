package com.adamkoch.garmin.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.reactive.function.client.WebClient;

public class AbstractRestService {

  private static final Logger LOGGER = LogManager.getLogger(AbstractRestService.class);

  protected final WebClient webClient;

  public AbstractRestService(final WebClient webClient) {
    this.webClient = webClient;
  }

  protected CompletableFuture<String> callService(final String token, final String userId, final String appendix) {
    return CompletableFuture.supplyAsync(() -> webClient.get()
                                                      .uri(userId + appendix)
                                                      .headers(headers -> headers.setBearerAuth(token))
                                                      .retrieve()
                                                      .bodyToMono(String.class)
                                                      .doOnError(Throwable::printStackTrace)
                                                      .block());

  }

  // VisibleForTesting
  protected static <T> T parseResponse(String responseText, Class<T> clazz) {

    if (LOGGER.isDebugEnabled())
      LOGGER.debug("clazz = " + clazz + ", responseText=" + responseText);

    ObjectMapper mapper = new ObjectMapper();
    T response;

    try {
      response = mapper.readValue(responseText, clazz);
    }
    catch (JsonProcessingException e) {
      LOGGER.error("Could not parse response: " + responseText + ". " + e.getMessage(), e);
      throw new ServiceException("Could not parse response");
    }

    return response;
  }
}
