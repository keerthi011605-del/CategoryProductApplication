package com.application.CategoryProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.CategoryProduct.entity.Product;
import com.application.CategoryProduct.Repository.ProductRepository;
import java.util.*;
@Service

public class ProductService {
    @Autowired
    public ProductRepository productRepository;
    
    public Product createProducts(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product updateProduct(Long id,Product newProduct)
    {
        Product existingProduct=productRepository.findById(id)
        .orElseThrow(()->new RuntimeException("product with "+id+"not found"));
        existingProduct.setName(newProduct.getName());
        existingProduct.setDescription(newProduct.getDescription());
        existingProduct.setPrice(newProduct.getPrice());
        existingProduct.setStock(newProduct.getStock());

        return productRepository.save(existingProduct);


    }
    public void removeProduct(Long id){
        productRepository.deleteById(id);
    }
}
