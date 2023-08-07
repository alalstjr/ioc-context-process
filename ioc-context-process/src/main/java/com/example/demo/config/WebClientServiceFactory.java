package com.example.demo.config;

import com.example.demo.service.WebClientService;
import java.util.Map;

public class WebClientServiceFactory {
    private final Map<String, WebClientService> webClientServiceMap;

    public WebClientServiceFactory(Map<String, WebClientService> webClientServiceMap) {
        this.webClientServiceMap = webClientServiceMap;
    }

    public WebClientService getWebClientService(String webClientName) {
        WebClientService webClientService = webClientServiceMap.get(webClientName);
        if (webClientService == null) {
            throw new IllegalArgumentException("Vendor not supported: " + webClientName);
        }
        return webClientService;
    }
}
