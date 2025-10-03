package com.springweb.javaWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "WELCOME TO WEB PAGE - IT IS A STRING DATA ! HERE YOU COULD HAVE FETCHED A WEBPAGE ...";
    }

    @RequestMapping("/contact")
    public String contactUs(){
        return "EMAIL : abc@gmail.com ----- CONTACT : +91 8123 4500 26";
    }
}
