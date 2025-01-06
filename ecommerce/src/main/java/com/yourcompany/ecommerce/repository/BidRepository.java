package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidRepository extends MongoRepository<Bid, String> {
    // You can define custom query methods here if necessary
}
