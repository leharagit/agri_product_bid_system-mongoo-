package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Notification;
import com.yourcompany.ecommerce.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin(origins = "http://localhost:5173") // Allow requests from all origins
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Endpoint to create a new notification
    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }

    // Endpoint to retrieve a notification by ID
    @GetMapping("/{id}")
    public Optional<Notification> getNotificationById(@PathVariable String id) {
        return notificationService.getNotificationById(id);
    }

    // Endpoint to retrieve all notifications
    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    // Endpoint to retrieve notifications by user ID
    @GetMapping("/user/{userId}")
    public List<Notification> getNotificationsByUserId(@PathVariable String userId) {
        return notificationService.getNotificationsByUserId(userId);
    }

    // Endpoint to update an existing notification
    @PutMapping("/{id}")
    public Notification updateNotification(@PathVariable String id, @RequestBody Notification notification) {
        return notificationService.updateNotification(id, notification);
    }

    // Endpoint to delete a notification
    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable String id) {
        notificationService.deleteNotification(id);
    }
}
