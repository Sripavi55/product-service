package com.kce.shopverse.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kce.shopverse.product.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

}
