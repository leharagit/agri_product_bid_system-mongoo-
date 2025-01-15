package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Bid;
import com.yourcompany.ecommerce.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bids")
@CrossOrigin(origins = "http://localhost:5173")
public class BidController {

    private final BidService bidService;

    @Autowired
    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    // Endpoint to create a new bid
    @PostMapping
    public Bid createBid(@RequestBody Bid bid) {
        return bidService.createBid(bid);
    }

    // Endpoint to retrieve a bid by ID
    @GetMapping("/{id}")
    public Optional<Bid> getBidById(@PathVariable String id) {
        return bidService.getBidById(id);
    }

    // Endpoint to retrieve all bids
    @GetMapping
    public List<Bid> getAllBids() {
        return bidService.getAllBids();
    }

    // Endpoint to update an existing bid
    @PutMapping("/{id}")
    public Bid updateBid(@PathVariable String id, @RequestBody Bid bid) {
        return bidService.updateBid(id, bid);
    }

    // Endpoint to delete a bid
    @DeleteMapping("/{id}")
    public void deleteBid(@PathVariable String id) {
        bidService.deleteBid(id);
    }


    @GetMapping("/product/{productId}")
    public List<Bid> getBidsByProductId(@PathVariable String productId) {
        return bidService.getBidsByProductId(productId);
    }
}