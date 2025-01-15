package com.yourcompany.ecommerce.repository;

import com.yourcompany.ecommerce.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    // Custom query methods can be added here if needed, for example:
    // List<Notification> findByUserId(String userId);
}
