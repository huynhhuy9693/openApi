package com.example.demo.repository;

import com.example.demo.entity.CategoryEntity;
import io.tej.SwaggerCodgen.model.AdminProductCategoryPostRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
