package com.devopsintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloContrroler {
    @GetMapping
    public String message(){
        System.out.println("Hallo");
        return "Welcome Mohammad to DevOps Integration with Jenkins and Docker and Kubernetes";
    }
}
