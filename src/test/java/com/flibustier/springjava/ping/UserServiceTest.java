package com.flibustier.springjava.ping;

import com.flibustier.springjava.ping.Entities.User;
import com.flibustier.springjava.ping.Repository.UserRepository;
import com.flibustier.springjava.ping.Services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @BeforeEach
    public void setup(){
        userRepository.deleteAll();
    }

    @Test
    public void testRegisterUser(){
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("password123");
        user.setEmail("testuser@examp.com");

        userService.registerUser(user);

        Optional<User> savedUser = userRepository.findByUsername("testUser");
        assertTrue(savedUser.isPresent());
        assertTrue(bCryptPasswordEncoder.matches("password123", savedUser.get().getPassword()));

    }

}