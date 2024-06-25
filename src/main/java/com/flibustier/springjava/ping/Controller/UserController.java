package com.flibustier.springjava.ping.Controller;

import com.flibustier.springjava.ping.Entities.User;
import com.flibustier.springjava.ping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
