package com.yourcompany.ecommerce.controller;

import com.yourcompany.ecommerce.model.Product;
import com.yourcompany.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.ok(createdProduct);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(
            @RequestParam(required = false, defaultValue = "0") double min,
            @RequestParam(required = false, defaultValue = "10000") double max,
            @RequestParam(required = false, defaultValue = "sales") String sort
    ) {
        List<Product> products = productService.getAllProducts(min, max, sort);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable String id,
            @RequestBody Product product
    ) {
        Product updatedProduct = productService.updateProduct(id, product);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}

