package com.example.EcommerceSpringApplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class categoryController {

    @GetMapping
    public String getAllCategories() {
        return "Electronics";
    }

    @GetMapping("/count") // if we call a GET request on /api/categories/count
    public int getCategoryCount() {
        return 5; // Example count
    }
}
