package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(String userId);
    List<User> getAllUsers();
    User updateUser(String userId, User user);
    void deleteUser(String userId);
}
