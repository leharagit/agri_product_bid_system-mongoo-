package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    Delivery createDelivery(Delivery delivery); // Method to create a new delivery
    Optional<Delivery> getDeliveryById(String deliveryId); // Method to get a delivery by ID
    List<Delivery> getAllDeliveries(); // Method to get all deliveries
    Delivery updateDelivery(String deliveryId, Delivery delivery); // Method to update a delivery
    void deleteDelivery(String deliveryId); // Method to delete a delivery
}
