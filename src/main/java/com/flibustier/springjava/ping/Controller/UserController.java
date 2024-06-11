package com.flibustier.springjava.ping.Controller;

import com.flibustier.springjava.ping.Entities.User;
import com.flibustier.springjava.ping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    private String registerUser(@RequestBody User user){
        userService.register(user);
        return "User registered successfully!";
    }
}
