package com.kce.shopverse.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kce.shopverse.product.model.Category;
import com.kce.shopverse.product.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService service;

    // CREATE
    @PostMapping({"", "/"})
    public Category createCategory(@RequestBody Category category) {
        return service.saveCategory(category);
    }

    // GET ALL
    @GetMapping({"", "/"})
    public List<Category> getAllCategories() {
        return service.getAllCategories();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Category getCategory(@PathVariable String id) {
        return service.getCategoryById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable String id) {
        service.deleteCategory(id);
        return "Category Deleted Successfully";
    }

    // TEST
    @GetMapping("/test")
    public String test() {
        return "Controller Working";
    }
}
