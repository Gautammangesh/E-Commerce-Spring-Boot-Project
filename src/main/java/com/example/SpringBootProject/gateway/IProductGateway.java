package com.example.SpringBootProject.gateway;

import com.example.SpringBootProject.dto.ProductDTO;

import java.io.IOException;
import java.util.List;
public interface IProductGateway {
    ProductDTO getSingleProduct(Long id) throws IOException;
    List<ProductDTO> getProductsByCategory(String categoryName) throws IOException;
}