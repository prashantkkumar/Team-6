package org.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChaitanyaController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Chaitanya";
    }
}
