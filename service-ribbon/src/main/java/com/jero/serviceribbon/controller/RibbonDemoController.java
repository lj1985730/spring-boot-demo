package com.jero.serviceribbon.controller;

import com.jero.serviceribbon.service.RibbonDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonDemoController {

    private final RibbonDemoService service;

    @Autowired
    public RibbonDemoController(RibbonDemoService service) {
        this.service = service;
    }

    @GetMapping("/name")
    public String getName() {
        return service.getName();
    }
}
