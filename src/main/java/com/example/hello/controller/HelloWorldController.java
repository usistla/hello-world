package com.example.hello.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/ujjwal", produces = MediaType.APPLICATION_JSON_VALUE)
    public String prashant() {
        System.out.println("Hey");
        return "Hello World";
    }
}
