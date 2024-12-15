package com.yourcompany.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "payments")  // This annotation maps the class to a MongoDB collection
public class Payment {

    @Id  // Marks the field as the primary key for MongoDB document
    private String id;

    private String transactionId; // Foreign Key to Transaction
    private double totalAmount; // Amount including delivery cost
    private String paymentMethod; // Payment method (Card, Bank Transfer, Digital Wallet, Crypto, COD)
    private String paymentType; // Payment type (Online Payment, Cash on Delivery)
    private String paymentStatus; // Payment status (Pending, Completed)
    private LocalDateTime timestamp; // Timestamp of payment

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
