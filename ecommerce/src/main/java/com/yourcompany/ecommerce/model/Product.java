package com.yourcompany.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")  // This annotation maps the class to the 'products' collection in MongoDB
public class Product {

    @Id  // This annotation marks the field as the primary key for the MongoDB document
    private String productId;

    private String userId;  // Foreign Key: Link to the seller/owner (represented by User ID)
    private String name;
    private String category;
    private String description;
    private int quantity;
    private String quality;
    private String location;
    private double startBidPrice;
    private double buyNowPrice;
    private String size;  // Dimensions or weight
    private String status;  // Available, Sold, etc.
    private int productQuantity;  // Available stock

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getStartBidPrice() {
        return startBidPrice;
    }

    public void setStartBidPrice(double startBidPrice) {
        this.startBidPrice = startBidPrice;
    }

    public double getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", quality='" + quality + '\'' +
                ", location='" + location + '\'' +
                ", startBidPrice=" + startBidPrice +
                ", buyNowPrice=" + buyNowPrice +
                ", size='" + size + '\'' +
                ", status='" + status + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
