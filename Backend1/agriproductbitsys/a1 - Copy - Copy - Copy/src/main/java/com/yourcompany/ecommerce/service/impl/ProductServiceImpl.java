package com.yourcompany.ecommerce.service.impl;

import com.yourcompany.ecommerce.model.Product;
import com.yourcompany.ecommerce.repository.ProductRepository;
import com.yourcompany.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(String productId) {
        return productRepository.findById(productId);
    }

    @Override
    public List<Product> getAllProducts(double min, double max, String sort) {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(String productId, Product product) {
        Optional<Product> existingProduct = productRepository.findById(productId);
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setName(product.getName());
            updatedProduct.setCategory(product.getCategory());
            updatedProduct.setDescription(product.getDescription());
            updatedProduct.setQuantity(product.getQuantity());
            updatedProduct.setQuality(product.getQuality());
            updatedProduct.setLocation(product.getLocation());
            updatedProduct.setStartBidPrice(product.getStartBidPrice());
            updatedProduct.setBuyNowPrice(product.getBuyNowPrice());
            updatedProduct.setSize(product.getSize());
            updatedProduct.setStatus(product.getStatus());
            updatedProduct.setProductQuantity(product.getProductQuantity());
            return productRepository.save(updatedProduct);
        } else {
            return null; // Or throw a custom exception for product not found
        }
    }

    @Override
    public void deleteProduct(String productId) {
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
        } else {
            throw new RuntimeException("Product not found with id: " + productId);
        }
    }
}
