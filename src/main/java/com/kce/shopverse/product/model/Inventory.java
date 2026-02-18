package com.kce.shopverse.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

@Document(collection = "inventory")
public class Inventory {

    @Id
    private String id;

    @NotBlank(message = "ProductId is required")
    private String productId;

    @PositiveOrZero(message = "Quantity cannot be negative")
    private int quantity;

    public Inventory() {}

    public Inventory(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
