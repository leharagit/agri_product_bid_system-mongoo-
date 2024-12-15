package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.User;
import com.yourcompany.ecommerce.repository.UserRepository;
import com.yourcompany.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
 @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
    }
    @Override
    public User getUserNameById(String userId) {
        return userRepository.findUsernameByUserId(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
    }
    @Override
    public User getUserByUserEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

}