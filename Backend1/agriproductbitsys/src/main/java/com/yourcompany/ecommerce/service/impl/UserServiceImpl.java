package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.User;
import com.yourcompany.ecommerce.repository.UserRepository;
import com.yourcompany.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        // You can add additional business logic here (e.g., password hashing, validation, etc.)
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(String userId) {
        // Fetch the user by ID, returns Optional to handle absence of the user gracefully
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        // Fetch all users
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String userId, User user) {
        // Check if the user exists, and if it does, update its details
        Optional<User> existingUser = userRepository.findById(userId);
        if (existingUser.isPresent()) {
            // Optionally, you can update fields here
            User updatedUser = existingUser.get();
            updatedUser.setName(user.getName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPhoneNumber(user.getPhoneNumber());
            updatedUser.setRole(user.getRole());
            updatedUser.setAddress(user.getAddress());
            updatedUser.setLocation(user.getLocation());
            return userRepository.save(updatedUser);
        } else {
            return null; // Or throw a custom exception for user not found
        }
    }

    @Override
    public void deleteUser(String userId) {
        // Delete a user by ID, throws an exception if not found
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new RuntimeException("User not found with id: " + userId);
        }
    }
}
