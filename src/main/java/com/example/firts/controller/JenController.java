package com.example.firts.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenController {


    @GetMapping("/getMessage")
    public String getMessage(){
        return "hello world";
    }
    
}
