package com.jero.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping(path = "/name")
    public String getClientName() {
        return this.name + " 2";
    }
}
