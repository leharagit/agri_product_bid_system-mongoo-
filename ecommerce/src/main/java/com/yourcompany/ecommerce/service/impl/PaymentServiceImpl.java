package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Payment;
import com.yourcompany.ecommerce.repository.PaymentRepository;
import com.yourcompany.ecommerce.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Optional<Payment> getPaymentById(String paymentId) {
        return paymentRepository.findById(paymentId);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment updatePayment(String paymentId, Payment payment) {
        Optional<Payment> existingPayment = paymentRepository.findById(paymentId);
        if (existingPayment.isPresent()) {
            Payment updatedPayment = existingPayment.get();
            updatedPayment.setTotalAmount(payment.getTotalAmount());
            updatedPayment.setPaymentMethod(payment.getPaymentMethod());
            updatedPayment.setPaymentType(payment.getPaymentType());
            updatedPayment.setPaymentStatus(payment.getPaymentStatus());
            updatedPayment.setTimestamp(payment.getTimestamp());
            return paymentRepository.save(updatedPayment);
        } else {
            return null; // Or throw an exception for payment not found
        }
    }

    @Override
    public void deletePayment(String paymentId) {
        if (paymentRepository.existsById(paymentId)) {
            paymentRepository.deleteById(paymentId);
        } else {
            throw new RuntimeException("Payment not found with id: " + paymentId);
        }
    }
}
