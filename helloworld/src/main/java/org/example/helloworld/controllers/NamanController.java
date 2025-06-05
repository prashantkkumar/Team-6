package org.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Naman")
public class NamanController {

    @GetMapping
    public String demo(){
        return "Hello my name is Naman";
    }
}
