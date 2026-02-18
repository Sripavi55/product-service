package com.kce.shopverse.product.controller;

import com.kce.shopverse.product.model.Inventory;
import com.kce.shopverse.product.service.InventoryService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin(origins = "*")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @PostMapping
    public Inventory addInventory(@Valid @RequestBody Inventory inventory) {
        return service.addInventory(inventory);
    }

    @GetMapping
    public List<Inventory> getAllInventory() {
        return service.getAllInventory();
    }

    @GetMapping("/product/{productId}")
    public Inventory getByProductId(@PathVariable String productId) {
        return service.getByProductId(productId);
    }
}
