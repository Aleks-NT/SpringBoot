package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;
import com.example.SpringBoot.repository.UserRepository;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @SuppressAjWarnings
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
