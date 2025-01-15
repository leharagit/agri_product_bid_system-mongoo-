package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review createReview(Review review);  // Method to create a new review
    Optional<Review> getReviewById(String reviewId);  // Method to get a review by ID
    List<Review> getAllReviews();  // Method to get all reviews
    List<Review> getReviewsByProductId(String productId);  // Get reviews for a specific product
    List<Review> getReviewsByUserId(String userId);  // Get reviews written by a specific user
    Review updateReview(String reviewId, Review review);  // Method to update a review
    void deleteReview(String reviewId);  // Method to delete a review
}
