package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction); // Method to create a new transaction
    Optional<Transaction> getTransactionById(String transactionId); // Method to get a transaction by ID
    List<Transaction> getAllTransactions(); // Method to get all transactions
    Transaction updateTransaction(String transactionId, Transaction transaction); // Method to update a transaction
    void deleteTransaction(String transactionId); // Method to delete a transaction
}
