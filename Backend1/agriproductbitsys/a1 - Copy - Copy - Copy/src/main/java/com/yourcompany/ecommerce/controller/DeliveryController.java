package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Delivery;
import com.yourcompany.ecommerce.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    // Endpoint to create a new delivery
    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.createDelivery(delivery);
    }

    // Endpoint to retrieve a delivery by ID
    @GetMapping("/{id}")
    public Optional<Delivery> getDeliveryById(@PathVariable String id) {
        return deliveryService.getDeliveryById(id);
    }

    // Endpoint to retrieve all deliveries
    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    // Endpoint to update an existing delivery
    @PutMapping("/{id}")
    public Delivery updateDelivery(@PathVariable String id, @RequestBody Delivery delivery) {
        return deliveryService.updateDelivery(id, delivery);
    }

    // Endpoint to delete a delivery
    @DeleteMapping("/{id}")
    public void deleteDelivery(@PathVariable String id) {
        deliveryService.deleteDelivery(id);
    }
}
