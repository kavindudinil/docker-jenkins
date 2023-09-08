package com.example.dockertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("hello-world/welcome")
    public String sayHello(){
        return "Hello From SpringBoot Docker Project";
    }
}
