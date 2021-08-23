package com.example.springtemplate.controllers;

import java.util.List;

import com.example.springtemplate.entities.User;
import com.example.springtemplate.entities.UserRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/api/user")
    Iterable<User> GET() {
        return this.userRepo.findAll();
    }
}
