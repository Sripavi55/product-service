package com.kce.shopverse.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kce.shopverse.product.model.Product;
import com.kce.shopverse.product.repository.ProductRepository;
import com.kce.shopverse.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product Not Found"));
    }

    @Override
    public void deleteProduct(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> getProductsByCategory(String categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
