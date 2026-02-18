package com.kce.shopverse.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kce.shopverse.product.model.Inventory;

import java.util.Optional;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

    Optional<Inventory> findByProductId(String productId);
}
