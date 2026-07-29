package com.example.SpringBootProject.controllers;

import com.example.SpringBootProject.dto.ProductDTO;
import com.example.SpringBootProject.services.IProductService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDTO getSingleProduct(@PathVariable Long id) throws IOException {
        return productService.getSingleProduct(id);
    }

    @GetMapping("/category/{categoryName}")
    public List<ProductDTO> getProductsByCategory(@PathVariable String categoryName) throws IOException {
        return productService.getProductsByCategory(categoryName);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) {
        return ResponseEntity.ok(productService.createProduct(dto));
    }
}