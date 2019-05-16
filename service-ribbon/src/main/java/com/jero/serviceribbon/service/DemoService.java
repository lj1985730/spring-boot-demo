package com.jero.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    private final RestTemplate restTemplate;

    @Autowired
    public DemoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName() {
        return restTemplate.getForObject("http://JERO-EUREKA-CLIENT/name", String.class);
    }
}
