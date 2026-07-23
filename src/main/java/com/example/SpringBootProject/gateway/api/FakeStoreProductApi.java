package com.example.SpringBootProject.gateway.api;

import com.example.SpringBootProject.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;
public interface FakeStoreProductApi {

    @GET("products/{id}") 
    Call<ProductDTO> getSingleProduct(@Path("id") Long id);

    @GET("products/category/{categoryName}")
    Call<List<ProductDTO>> getProductsByCategory(@Path("categoryName") String categoryName);

}
