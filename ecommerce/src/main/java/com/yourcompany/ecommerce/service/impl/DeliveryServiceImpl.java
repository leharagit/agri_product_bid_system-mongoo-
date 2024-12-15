package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Delivery;
import com.yourcompany.ecommerce.repository.DeliveryRepository;
import com.yourcompany.ecommerce.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Optional<Delivery> getDeliveryById(String deliveryId) {
        return deliveryRepository.findById(deliveryId);
    }

    @Override
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery updateDelivery(String deliveryId, Delivery delivery) {
        Optional<Delivery> existingDelivery = deliveryRepository.findById(deliveryId);
        if (existingDelivery.isPresent()) {
            Delivery updatedDelivery = existingDelivery.get();
            updatedDelivery.setDistance(delivery.getDistance());
            updatedDelivery.setDeliveryMethod(delivery.getDeliveryMethod());
            updatedDelivery.setDeliveryCost(delivery.getDeliveryCost());
            updatedDelivery.setEstimatedDeliveryDate(delivery.getEstimatedDeliveryDate());
            updatedDelivery.setActualDeliveryDate(delivery.getActualDeliveryDate());
            return deliveryRepository.save(updatedDelivery);
        } else {
            return null; // Or throw an exception for delivery not found
        }
    }

    @Override
    public void deleteDelivery(String deliveryId) {
        if (deliveryRepository.existsById(deliveryId)) {
            deliveryRepository.deleteById(deliveryId);
        } else {
            throw new RuntimeException("Delivery not found with id: " + deliveryId);
        }
    }
}
