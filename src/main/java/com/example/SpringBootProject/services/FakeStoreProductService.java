package com.example.SpringBootProject.services;

import com.example.SpringBootProject.dto.ProductDTO;
import com.example.SpringBootProject.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getSingleProduct(Long id) throws IOException {
        return productGateway.getSingleProduct(id);
    }

    public ProductDTO createProduct(ProductDTO dto) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String categoryName) throws IOException {
        return productGateway.getProductsByCategory(categoryName);
    }
}