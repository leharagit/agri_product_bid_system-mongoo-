package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Review;
import com.yourcompany.ecommerce.repository.ReviewRepository;
import com.yourcompany.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Optional<Review> getReviewById(String reviewId) {
        return reviewRepository.findById(reviewId);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public List<Review> getReviewsByProductId(String productId) {
        return reviewRepository.findAll().stream()
                .filter(review -> review.getProductId().equals(productId))
                .toList();
    }

    @Override
    public List<Review> getReviewsByUserId(String userId) {
        return reviewRepository.findAll().stream()
                .filter(review -> review.getUserId().equals(userId))
                .toList();
    }

    @Override
    public Review updateReview(String reviewId, Review review) {
        Optional<Review> existingReview = reviewRepository.findById(reviewId);
        if (existingReview.isPresent()) {
            Review updatedReview = existingReview.get();
            updatedReview.setRating(review.getRating());
            updatedReview.setComment(review.getComment());
            updatedReview.setTimestamp(review.getTimestamp());
            return reviewRepository.save(updatedReview);
        } else {
            return null;  // Or throw an exception for review not found
        }
    }

    @Override
    public void deleteReview(String reviewId) {
        if (reviewRepository.existsById(reviewId)) {
            reviewRepository.deleteById(reviewId);
        } else {
            throw new RuntimeException("Review not found with id: " + reviewId);
        }
    }
}
