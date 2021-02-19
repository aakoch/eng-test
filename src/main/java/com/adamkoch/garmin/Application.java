package com.adamkoch.garmin;

import static org.apache.logging.log4j.LogManager.*;

import com.adamkoch.garmin.services.CreditCardService;
import com.adamkoch.garmin.services.DeviceService;
import com.adamkoch.garmin.services.RestCreditCardService;
import com.adamkoch.garmin.services.RestDeviceService;
import com.adamkoch.garmin.services.RestTokenService;
import com.adamkoch.garmin.services.RestUserService;
import com.adamkoch.garmin.services.TokenService;
import com.adamkoch.garmin.services.UserService;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

    private static final Logger LOGGER = getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.debug("starting app");
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebClient webClient() {
        WebClient webClient = WebClient.builder()
                                       .baseUrl("https://api.qa.fitpay.ninja/users/")
                                       .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                                       .build();
        return webClient;
    }


    @Bean
    public CreditCardService ccService() {
        return new RestCreditCardService(webClient());
    }

    @Bean
    public UserService userService() {
        return new RestUserService(webClient());
    }

    @Bean
    public DeviceService deviceService() {
        return new RestDeviceService(webClient());
    }

    @Bean
    public TokenService tokenService() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("secrets.properties"));
        return new RestTokenService(properties.getProperty("username"), properties.getProperty("password"));
    }
}
