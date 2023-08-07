package com.example.demo.service;

import com.example.demo.config.WebClientServiceFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final WebClientServiceFactory webClientServiceFactory;

    public OrderService(WebClientServiceFactory webClientServiceFactory) {
        this.webClientServiceFactory = webClientServiceFactory;
    }

    public void getOrderList(String payLoad) {
        WebClientService orderService = webClientServiceFactory.getWebClientService(payLoad);

        orderService.getSyncInfo(payLoad);
    }
}
