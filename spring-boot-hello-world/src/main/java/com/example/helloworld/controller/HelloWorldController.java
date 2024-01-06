package com.example.helloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String sendGreetings(@PathVariable("name") String name){

       log.info("Hello World API Called with " + name);
        return "Hello, World!" + name;
    }
}
