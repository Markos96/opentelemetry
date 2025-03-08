package com.spring.opentelemetry.controller;

import com.spring.opentelemetry.data.domain.User;
import com.spring.opentelemetry.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Void> saveCustomer(@RequestBody User user) {
        this.userService.saveUser(user);
        return ResponseEntity.ok().build();
    }
}
