package com.kce.shopverse.product.service;

import com.kce.shopverse.product.model.Inventory;
import java.util.List;

public interface InventoryService {

    Inventory addInventory(Inventory inventory);

    List<Inventory> getAllInventory();

    Inventory getByProductId(String productId);
}
