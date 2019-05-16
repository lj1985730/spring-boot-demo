package com.jero.servicefeign.controller;

import com.jero.servicefeign.service.FeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignDemoController {

    private final FeignDemoService service;

    @Autowired
    public FeignDemoController(FeignDemoService service) {
        this.service = service;
    }

    @GetMapping("/name")
    public String getName() {
        return this.service.getName();
    }
}
