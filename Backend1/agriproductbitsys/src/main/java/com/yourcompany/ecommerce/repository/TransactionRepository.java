package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // You can define custom query methods here if necessary
}
