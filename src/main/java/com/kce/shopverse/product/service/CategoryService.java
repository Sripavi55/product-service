package com.kce.shopverse.product.service;

import java.util.List;
import com.kce.shopverse.product.model.Category;

public interface CategoryService {

    Category saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(String id);

    void deleteCategory(String id);
}
