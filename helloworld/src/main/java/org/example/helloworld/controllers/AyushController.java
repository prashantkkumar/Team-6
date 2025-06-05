package org.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AyushController {

    @GetMapping("/ayush")
    public String greetUser() {
        return "Hello my name is Ayush Nagar";
    }
}
