package com.example.sharathproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sharathcontroller {

    @GetMapping("/ust")
    public String hello(){
        return "i am fine";
    }


}
