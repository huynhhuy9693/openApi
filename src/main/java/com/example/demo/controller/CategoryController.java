package com.example.demo.controller;


import com.example.demo.entity.CategoryEntity;
import com.example.demo.service.CategoryService;
import io.tej.SwaggerCodgen.api.AdminProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController implements AdminProductApi {

    @Autowired
    private CategoryService service;
    @Override
    public ResponseEntity adminProductCategoriesGet()
    {
        System.out.println("category");
        List<CategoryEntity> list = service.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
