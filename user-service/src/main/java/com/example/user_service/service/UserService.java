package com.example.user_service.service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository _repository;
    public User getUserById(Long id) {
        return _repository.findById(id).orElse(null);
    }
    public User createUser(User user) {
        return _repository.save(user);
    }
    public List<User> getUsers() {
        return _repository.findAll();
    }

}
