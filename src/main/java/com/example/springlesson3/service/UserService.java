package com.example.springlesson3.service;

import com.example.springlesson3.domain.User;
import com.example.springlesson3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Nik", "dsa@gmail.com"));
        userRepository.save(new User(null, "Alex", "asd@gmail.com"));
        userRepository.save(new User(null, "Dima", "d@gmail.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

}