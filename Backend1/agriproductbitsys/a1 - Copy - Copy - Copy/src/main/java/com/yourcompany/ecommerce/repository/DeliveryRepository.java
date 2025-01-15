package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {
    // Custom query methods can be defined here if needed
}
