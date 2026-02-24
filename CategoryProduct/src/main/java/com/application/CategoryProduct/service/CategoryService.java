package com.application.CategoryProduct.service;

import com.application.CategoryProduct.entity.Category; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.CategoryProduct.Repository.CategoryRepository;
import java.util.*;

@Service
public class CategoryService {
 @Autowired
 private CategoryRepository categoryRepository;


 public Category saveCategory(Category  category){
    return categoryRepository.save(category);
 }
 public List<Category> getAllCategory(){
    return categoryRepository.findAll();
 }
 public Category updateCategory(Long id,Category newCategory){
   Category existingCategory=categoryRepository.findById(id)
   .orElseThrow(()-> new RuntimeException("catory with "+id+"not present"));
   existingCategory.setName(newCategory.getName());
   existingCategory.setDescription(newCategory.getDescription());
   return categoryRepository.save(existingCategory);

 }
 public void  removeCategory(Long id){
  categoryRepository.deleteById(id);
 }
}
