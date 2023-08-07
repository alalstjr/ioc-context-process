package com.example.demo.config;

import com.example.demo.service.WebClientService;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClientConfig {

    private final List<WebClientService> webClientServices;

    public WebClientConfig(List<WebClientService> webClientServices) {
        this.webClientServices = webClientServices;
    }

    @Bean
    public WebClientServiceFactory webClientServiceFactory() {
        Map<String, WebClientService> webClientServiceMap = webClientServices.stream()
            .collect(Collectors.toMap(WebClientService::getWebClientName, Function.identity()));
        return new WebClientServiceFactory(webClientServiceMap);
    }
}
