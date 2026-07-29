package com.example.SpringBootProject.services;

import com.example.SpringBootProject.dto.ProductDTO;
import com.example.SpringBootProject.mappers.ProductMapper;
import com.example.SpringBootProject.entity.Product;
import com.example.SpringBootProject.repository.ProductRepository;

public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public ProductDTO getProductById(Long id) throws Exception {
        Product product = repo.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));

        return ProductMapper.toDto(product);
    }

    public ProductDTO createProduct(ProductDTO dto) {
        Product saved = repo.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDto(saved);
    }

}
