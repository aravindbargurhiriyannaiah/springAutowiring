package com.funkyganesha.autowiring.controllers;

import com.funkyganesha.autowiring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String greet() {
        return greetingService.greet();
    }
}
