package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
    // Custom query methods can be defined here if needed
}
