package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(String userId);
    User getUserNameById(String userId);
    User getUserByUserEmail(String userEmail);
    List<User> getAllUsers();
    void deleteUser(String userId);
   
}
