package com.example.demo.service;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.repository.CategoryRepository;
import io.tej.SwaggerCodgen.model.AdminProductCategoryPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

   @Autowired
   private CategoryRepository repository;
  @Autowired
    ModelMapper modelMapper;

    public List<CategoryEntity> getAll()
    {
        return repository.findAll();
    }
}
