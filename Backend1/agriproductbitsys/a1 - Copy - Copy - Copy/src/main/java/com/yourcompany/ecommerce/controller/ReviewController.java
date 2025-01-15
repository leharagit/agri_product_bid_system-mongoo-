package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Review;
import com.yourcompany.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // Endpoint to create a new review
    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    // Endpoint to retrieve a review by ID
    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable String id) {
        return reviewService.getReviewById(id);
    }

    // Endpoint to retrieve all reviews
    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    // Endpoint to retrieve reviews for a specific product
    @GetMapping("/product/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable String productId) {
        return reviewService.getReviewsByProductId(productId);
    }

    // Endpoint to retrieve reviews by a specific user
    @GetMapping("/user/{userId}")
    public List<Review> getReviewsByUserId(@PathVariable String userId) {
        return reviewService.getReviewsByUserId(userId);
    }

    // Endpoint to update an existing review
    @PutMapping("/{id}")
    public Review updateReview(@PathVariable String id, @RequestBody Review review) {
        return reviewService.updateReview(id, review);
    }

    // Endpoint to delete a review
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable String id) {
        reviewService.deleteReview(id);
    }
}
