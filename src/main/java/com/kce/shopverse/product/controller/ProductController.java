package com.kce.shopverse.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.kce.shopverse.product.model.Product;
import com.kce.shopverse.product.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kce.shopverse.product.model.Product;
import com.kce.shopverse.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return service.getProductById(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable String categoryId) {
        return service.getProductsByCategory(categoryId);
    }
    

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);
        return "Product Deleted Successfully";
    }
    @PostMapping("/reduce-stock")
    public String reduceStock(@RequestParam String productId,
                              @RequestParam int quantity) {

        Product product = service.getProductById(productId);

        if (product.getStock() < quantity) {
            throw new RuntimeException("Not enough stock available");
        }

        product.setStock(product.getStock() - quantity);
        service.saveProduct(product);

        return "Stock reduced successfully";
    }

}
