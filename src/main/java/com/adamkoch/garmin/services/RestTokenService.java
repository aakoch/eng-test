package com.adamkoch.garmin.services;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import javax.net.ssl.SSLException;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestClientException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

public class RestTokenService implements TokenService {

  private String username;
  private String password;

  public RestTokenService(final String username, final String password) {
    this.username = username;
    this.password = password;
  }

  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("secrets.properties"));
    System.out.println(new RestTokenService(properties.getProperty("username"), properties.getProperty("password")).getToken());
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
                                     .defaultHeaders(header -> header.setBasicAuth(username, password))
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
