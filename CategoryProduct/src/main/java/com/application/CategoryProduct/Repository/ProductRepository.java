package com.application.CategoryProduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.CategoryProduct.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
