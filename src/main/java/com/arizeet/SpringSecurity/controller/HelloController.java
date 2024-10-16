package com.arizeet.SpringSecurity.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String greet(HttpServletRequest request){
        return "Hello Arizeet " + request.getSession().getId();
    }
}
