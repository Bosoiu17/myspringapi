package com.example.myspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class Endpoint {
    @GetMapping("/hello")
    public String GreetingController(){
        return "Hello i'm a spring boot endpoint";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "See you soon";
    }
}
