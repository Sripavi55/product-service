package com.kce.shopverse.product.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kce.shopverse.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findByCategoryId(String categoryId);
}
