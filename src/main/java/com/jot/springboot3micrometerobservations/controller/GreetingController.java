package com.jot.springboot3micrometerobservations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting getGreeting(){
        return new Greeting("Hello!");
    }

    record Greeting(String text){}
}
