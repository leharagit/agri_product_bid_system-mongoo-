package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationService {
    Notification createNotification(Notification notification);  // Create a new notification
    Optional<Notification> getNotificationById(String notificationId);  // Get a notification by ID
    List<Notification> getAllNotifications();  // Get all notifications
    List<Notification> getNotificationsByUserId(String userId);  // Get notifications for a specific user
    Notification updateNotification(String notificationId, Notification notification);  // Update an existing notification
    void deleteNotification(String notificationId);  // Delete a notification
}
