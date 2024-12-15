package com.yourcompany.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // This annotation maps the class to a MongoDB collection
public class User {

    @Id  // This annotation marks the field as the primary key for the MongoDB document
    private String userId;  // MongoDB uses ObjectId by default, but you can also use a String as the ID
    private String name;
    private String userEmail;
    private String password;
    private String phoneNumber;
    private String role;  // (Farmer, Buyer, Admin)
    private String address;
    private String location;  // You can store this as a simple string, or you can break it into latitude and longitude

    // Getters and Setters
    public String getId() {
        return userId;
    }

    public void setId(String id) {
        this.userId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
