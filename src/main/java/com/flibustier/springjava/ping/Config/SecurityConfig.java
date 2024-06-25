package com.flibustier.springjava.ping.Config;

import com.flibustier.springjava.ping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig{

    @Autowired
    private UserService userService;

    @Bean
    protected void configure(HttpSecurity http) throws Exception{
        http.
    }

}
