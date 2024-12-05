package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // You can define custom query methods here if necessary
}
