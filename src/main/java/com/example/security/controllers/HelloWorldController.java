package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }
    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String director() {
        return "On s'en fou des villes de cette école";
    }
}