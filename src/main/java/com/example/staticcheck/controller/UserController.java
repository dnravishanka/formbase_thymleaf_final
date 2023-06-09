package com.example.staticcheck.controller;


import com.example.staticcheck.model.Users;
import com.example.staticcheck.repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ap")
@CrossOrigin
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<Users> getAllUsers() {
        List<Users> all = userRepository.findAll();
        return all;
    }
}
