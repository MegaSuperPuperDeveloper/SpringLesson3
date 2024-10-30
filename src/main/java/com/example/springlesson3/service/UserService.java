package com.example.springlesson3.service;

import com.example.springlesson3.domain.User;
import com.example.springlesson3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        userRepository.save(new User(null, "Nik", "dsa@gmail.com"));
        userRepository.save(new User(null, "Alex", "asd@gmail.com"));
        userRepository.save(new User(null, "Dima", "d@gmail.com"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

}