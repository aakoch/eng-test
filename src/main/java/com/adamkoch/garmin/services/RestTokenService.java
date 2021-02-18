package com.adamkoch.garmin.services;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestClientException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

public class RestTokenService implements TokenService {

  public static void main(String[] args) {
    System.out.println(new RestTokenService().getToken());
  }

  @Override
  @Nullable
  public String getToken() {
    String token = null;
    try {
      SslContext sslContext = SslContextBuilder
          .forClient()
          .trustManager(InsecureTrustManagerFactory.INSTANCE)
          .build();
      HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));

      WebClient webClient = WebClient.builder()
                                     .clientConnector(new ReactorClientHttpConnector(httpClient))
                                     .baseUrl("https://auth.qa.fitpay.ninja/oauth/token?grant_type=client_credentials")
                                     .defaultHeaders(header -> header.setBasicAuth("***REMOVED***", "***REMOVED***"))
                                     .build();

      Mono<String> responseMono = webClient.get()
                                           .retrieve()
                                           .bodyToMono(String.class);
      final String jsonString = responseMono == null ? "can't get token" : responseMono.block();
      final Map<String, Object> stringObjectMap = JsonParserFactory.getJsonParser().parseMap(jsonString);
      token = String.valueOf(stringObjectMap.get("access_token"));
    }
    catch (SSLException e) {
      throw new RestClientException("Could not get token", e);
    }

    return token;
  }
}
