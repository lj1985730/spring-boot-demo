package com.jero.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonDemoService {

    private final RestTemplate restTemplate;

    @Autowired
    public RibbonDemoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName() {
        return restTemplate.getForObject("http://JERO-EUREKA-CLIENT/name", String.class);
    }
}
