package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // You can define custom query methods here if necessary
}
