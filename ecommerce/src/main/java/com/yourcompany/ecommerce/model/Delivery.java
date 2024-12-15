package com.yourcompany.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "deliveries")  // This annotation maps the class to a MongoDB collection
public class Delivery {

    @Id  // Marks the field as the primary key for MongoDB document
    private String id;

    private String transactionId; // Foreign Key to Transaction
    private double distance; // Distance for delivery
    private String deliveryMethod; // Delivery method (Standard, Express)
    private double deliveryCost; // Cost of delivery
    private LocalDateTime estimatedDeliveryDate; // Estimated date of delivery
    private LocalDateTime actualDeliveryDate; // Actual date of delivery

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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public LocalDateTime getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(LocalDateTime actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id='" + id + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", distance=" + distance +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", deliveryCost=" + deliveryCost +
                ", estimatedDeliveryDate=" + estimatedDeliveryDate +
                ", actualDeliveryDate=" + actualDeliveryDate +
                '}';
    }
}
