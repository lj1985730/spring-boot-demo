package com.jero.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("JERO-EUREKA-CLIENT")
public interface FeignDemoService {

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    String getName();
}
