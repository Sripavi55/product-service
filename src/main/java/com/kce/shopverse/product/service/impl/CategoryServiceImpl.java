package com.kce.shopverse.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kce.shopverse.product.model.Category;
import com.kce.shopverse.product.repository.CategoryRepository;
import com.kce.shopverse.product.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    @Override
    public Category getCategoryById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category Not Found"));
    }

    @Override
    public void deleteCategory(String id) {
        repository.deleteById(id);
    }
}
