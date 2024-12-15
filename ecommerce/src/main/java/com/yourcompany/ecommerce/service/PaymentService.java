package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment createPayment(Payment payment); // Method to create a new payment
    Optional<Payment> getPaymentById(String paymentId); // Method to get a payment by ID
    List<Payment> getAllPayments(); // Method to get all payments
    Payment updatePayment(String paymentId, Payment payment); // Method to update a payment
    void deletePayment(String paymentId); // Method to delete a payment
}
