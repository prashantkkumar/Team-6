package org.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MohitController {

    @GetMapping("Mohit")
    public String greetUser() {
        return "Hello my name is Mohit Goyal";
    }
}
