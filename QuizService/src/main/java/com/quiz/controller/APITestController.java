package com.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testAPI")
public class APITestController {

    @GetMapping
    public String testAPI(){
        return "This call completes the API multiple endpoint decalaration successful";
    }
}
