package com.microservice.serviceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class SecondController {

    @GetMapping("/greet")
    public String sayHello(){
        return "hello from service-two";
    }
}
