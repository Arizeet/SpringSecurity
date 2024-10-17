package com.arizeet.SpringSecurity.controller;


import com.arizeet.SpringSecurity.model.Users;
import com.arizeet.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.register(user);
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return service.getUsers();
    }
}
