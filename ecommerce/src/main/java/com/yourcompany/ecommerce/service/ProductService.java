package com.yourcompany.ecommerce.service;

import com.yourcompany.ecommerce.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product);
    Optional<Product> getProductById(String productId);
    List<Product> getAllProducts();
    Product updateProduct(String productId, Product product);
    void deleteProduct(String productId);
}
