package org.example.helloworld.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BhuvanController {

    @GetMapping("/bhuvan")
    public String myName() {
        return "Hello My name is Bhuvan Nanda";
    }
}
