package com.kce.shopverse.product.service.impl;

import com.kce.shopverse.product.model.Inventory;
import com.kce.shopverse.product.repository.InventoryRepository;
import com.kce.shopverse.product.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository repository;

    @Override
    public Inventory addInventory(Inventory inventory) {
        return repository.save(inventory);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return repository.findAll();
    }

    @Override
    public Inventory getByProductId(String productId) {
        return repository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Inventory not found for product"));
    }
}
