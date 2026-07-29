package com.example.SpringBootProject.mappers;

import com.example.SpringBootProject.dto.ProductDTO;
import com.example.SpringBootProject.entity.Product;

public class ProductMapper {

    public static ProductDTO toDto(Product product) {
        return ProductDTO.builder()
                .id((long) product.getId())
                .image(product.getImage())
                .price((double) product.getPrice())
                .description(product.getDescription())
                .title(product.getTitle())
                .category(product.getCategory())
                .build();
    }

    public static Product toEntity(ProductDTO dto) {
        return Product.builder()
                .image(dto.getImage())
                .price(dto.getPrice() == null ? 0 : dto.getPrice().intValue())
                .description(dto.getDescription())
                .title(dto.getTitle())
                .category(dto.getCategory())
                .id(dto.getId() == null ? 0 : dto.getId().intValue())
                .build();
    }
}
