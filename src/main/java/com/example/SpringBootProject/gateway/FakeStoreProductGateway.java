package com.example.SpringBootProject.gateway;

import com.example.SpringBootProject.dto.ProductDTO;
import com.example.SpringBootProject.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getSingleProduct(Long id) throws IOException {
        Response<ProductDTO> response = fakeStoreProductApi.getSingleProduct(id).execute();

        if (!response.isSuccessful() || response.body() == null) {
            throw new IOException("Failed to fetch single product from FakeStore API");
        }

        return response.body();
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String categoryName) throws IOException {
        Response<List<ProductDTO>> response = fakeStoreProductApi.getProductsByCategory(categoryName).execute();

        if (!response.isSuccessful() || response.body() == null) {
            throw new IOException("Failed to fetch products by category from FakeStore API");
        }

        return response.body();
    }
}