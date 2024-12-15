package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
    // You can define custom query methods if necessary (e.g., to find reviews by productId or userId)
}
