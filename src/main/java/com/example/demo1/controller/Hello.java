package com.example.demo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        String helloString = "hello!!";
        log.info("returing: {}", helloString);
        return helloString;
    }

    @GetMapping("/system")
    public String helloSystem() {
        String systemString = System.getenv().toString();
        log.info("returning: {}", systemString);
        return systemString;
    }
}
