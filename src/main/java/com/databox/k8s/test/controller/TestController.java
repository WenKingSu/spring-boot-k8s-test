package com.databox.k8s.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Value("${custom.value}")
    private String testValue;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return testValue;
    }

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public String name() {
        return applicationName;
    }
}
