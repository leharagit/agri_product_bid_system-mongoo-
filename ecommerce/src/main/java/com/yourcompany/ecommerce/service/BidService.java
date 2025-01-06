package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Bid;

import java.util.List;
import java.util.Optional;

public interface BidService {
    Bid createBid(Bid bid); // Method to create a new bid
    Optional<Bid> getBidById(String bidId); // Method to get a bid by ID
    List<Bid> getAllBids(); // Method to get all bids
    Bid updateBid(String bidId, Bid bid); // Method to update a bid
    void deleteBid(String bidId); // Method to delete a bid
}
