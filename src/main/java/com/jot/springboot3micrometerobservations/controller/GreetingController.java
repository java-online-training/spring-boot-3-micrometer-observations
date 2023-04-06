package com.jot.springboot3micrometerobservations.controller;

import org.slf4j.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greeting")
    public Greeting getGreeting(){
        log.info("Request received.");
        return new Greeting("Hello!");
    }

    record Greeting(String text){}
}
