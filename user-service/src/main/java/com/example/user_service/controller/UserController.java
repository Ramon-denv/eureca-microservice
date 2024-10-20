package com.example.user_service.controller;

import java.util.List;

import com.example.user_service.entity.User;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService _service;

    @GetMapping
    public List<User> getUsers() {
        return _service.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return _service.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return _service.createUser(user);
    }
}
