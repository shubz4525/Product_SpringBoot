package com.example.SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // when you use restcontroller no need of responsebody
public class HomeController {
    @RequestMapping("/")
    //@ResponseBody // when you use controller then responsebody is needed
    public String greet(){
        return "Welcome to the Simple Web Application!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is a simple web application built with Spring Boot.";
    }
}
