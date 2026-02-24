package com.application.CategoryProduct.Repository;

//import java.util.Locale.Category;
import com.application.CategoryProduct.entity.Category;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category, Long>{
}
