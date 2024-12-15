package com.yourcompany.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "notifications")  // Maps the class to the "notifications" MongoDB collection
public class Notification {

    @Id  // Marks the field as the primary key for MongoDB document
    private String id;

    private String userId;        // Foreign Key to User (recipient of the notification)
    private String content;        // Content of the notification
    private LocalDateTime timestamp;  // Timestamp when the notification is created
    private String status;         // Status of the notification (Read, Unread)

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                '}';
    }
}
