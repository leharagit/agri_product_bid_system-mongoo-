package com.yourcompany.ecommerce.repository;

import java.util.List;
import com.yourcompany.ecommerce.model.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidRepository extends MongoRepository<Bid, String> {
    List<Bid> findByProductId(String productId);// You can define custom query methods here if necessary
}
