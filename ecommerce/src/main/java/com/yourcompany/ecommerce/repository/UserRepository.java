package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.User;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUserId(String userId);
    User findByUserEmail(String username);
     Optional<User> findUsernameByUserId(String userId);
     
}
