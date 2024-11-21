package com.example.demo1.controller;

import com.example.demo1.model.Category;
import com.example.demo1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    // Pobiera listę wszystkich kategorii
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Dodaje nową kategorię
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }
}
