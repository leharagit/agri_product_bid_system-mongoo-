package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Notification;
import com.yourcompany.ecommerce.repository.NotificationRepository;
import com.yourcompany.ecommerce.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Optional<Notification> getNotificationById(String notificationId) {
        return notificationRepository.findById(notificationId);
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public List<Notification> getNotificationsByUserId(String userId) {
        return notificationRepository.findAll(); // Example placeholder, customize with actual query
    }

    @Override
    public Notification updateNotification(String notificationId, Notification notification) {
        Optional<Notification> existingNotification = notificationRepository.findById(notificationId);
        if (existingNotification.isPresent()) {
            Notification updatedNotification = existingNotification.get();
            updatedNotification.setStatus(notification.getStatus());  // For example, change the status to "Read"
            updatedNotification.setContent(notification.getContent());
            updatedNotification.setTimestamp(notification.getTimestamp());
            return notificationRepository.save(updatedNotification);
        } else {
            return null;  // Return null or throw an exception if notification is not found
        }
    }

    @Override
    public void deleteNotification(String notificationId) {
        if (notificationRepository.existsById(notificationId)) {
            notificationRepository.deleteById(notificationId);
        } else {
            throw new RuntimeException("Notification not found with id: " + notificationId);
        }
    }
}
