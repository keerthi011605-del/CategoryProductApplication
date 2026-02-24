package com.application.CategoryProduct.controller;

import com.application.CategoryProduct.entity.Category; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.CategoryProduct.service.CategoryService;
import java.util.*;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
   @Autowired
    private CategoryService categoryService;
    @PostMapping
        public Category addCategory(@RequestBody Category category){
            return categoryService.saveCategory(category);
    }
    @GetMapping
    public List<Category>getCategories(){
        return categoryService.getAllCategory();
    }
     @PutMapping("/{id}")
     public Category editCategory(@PathVariable Long id,
                                @RequestBody Category category){
                                    return categoryService.updateCategory(id,category);
                                }
    @DeleteMapping("{id}")
    public void deleteCategory(@PathVariable Long id){
         categoryService.removeCategory(id);
    }
    }
    
