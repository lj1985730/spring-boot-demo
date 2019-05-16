package com.jero.serviceribbon.controller;

import com.jero.serviceribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService service;

    @Autowired
    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping("/name")
    public String getName() {
        return service.getName();
    }
}
