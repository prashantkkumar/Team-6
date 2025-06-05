package org.example.helloworld.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DarpanController {

    @GetMapping("/darpan")
    public String myName() {
        return "Darpan";
    }
}
