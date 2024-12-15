package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Transaction;
import com.yourcompany.ecommerce.repository.TransactionRepository;
import com.yourcompany.ecommerce.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Optional<Transaction> getTransactionById(String transactionId) {
        return transactionRepository.findById(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction updateTransaction(String transactionId, Transaction transaction) {
        Optional<Transaction> existingTransaction = transactionRepository.findById(transactionId);
        if (existingTransaction.isPresent()) {
            Transaction updatedTransaction = existingTransaction.get();
            updatedTransaction.setPaymentStatus(transaction.getPaymentStatus());
            updatedTransaction.setDeliveryStatus(transaction.getDeliveryStatus());
            updatedTransaction.setDate(transaction.getDate());
            return transactionRepository.save(updatedTransaction);
        } else {
            return null; // Or throw an exception
        }
    }

    @Override
    public void deleteTransaction(String transactionId) {
        if (transactionRepository.existsById(transactionId)) {
            transactionRepository.deleteById(transactionId);
        } else {
            throw new RuntimeException("Transaction not found with id: " + transactionId);
        }
    }
}
