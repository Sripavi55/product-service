package com.kce.shopverse.product.service;

import java.util.List;
import com.kce.shopverse.product.model.Product;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(String id);

    void deleteProduct(String id);

    List<Product> getProductsByCategory(String categoryId);
}
