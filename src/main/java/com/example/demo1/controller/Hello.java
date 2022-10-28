package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "hello!!";
    }

    @GetMapping("/system")
    public String helloSystem(){
        return System.getenv().toString();
    }
}
