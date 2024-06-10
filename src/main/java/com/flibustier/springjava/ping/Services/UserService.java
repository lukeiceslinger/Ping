package com.flibustier.springjava.ping.Services;

import com.flibustier.springjava.ping.Entities.UserEntity;
import com.flibustier.springjava.ping.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public UserEntity registerUser(UserEntity user){
        if(userRepository.findUsername(user.getUsername()).isPresent() ||
            userRepository.findByEmail(user.getEmail()).isPresent())
        {
            throw new IllegalArgumentException("Username or Email already exists");
        }
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword((hashedPassword));

        return userRepository.save(user);
    }
}