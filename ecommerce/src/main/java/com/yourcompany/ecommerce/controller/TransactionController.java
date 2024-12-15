package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Transaction;
import com.yourcompany.ecommerce.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Endpoint to create a new transaction
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    // Endpoint to retrieve a transaction by ID
    @GetMapping("/{id}")
    public Optional<Transaction> getTransactionById(@PathVariable String id) {
        return transactionService.getTransactionById(id);
    }

    // Endpoint to retrieve all transactions
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    // Endpoint to update an existing transaction
    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable String id, @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(id, transaction);
    }

    // Endpoint to delete a transaction
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable String id) {
        transactionService.deleteTransaction(id);
    }
}
