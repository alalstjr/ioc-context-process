package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class WebClientAService implements WebClientService {

    @Override
    public void getSyncInfo(String payLoad) {
        System.out.println("A 업체에게 싱크합니다.");
    }

    @Override
    public String getWebClientName() {
        return "WebClientAService";
    }
}
