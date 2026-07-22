package com.example.SpringBootProject.gateway.api;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FakeStoreCategoryApi {

    @GET("products/categories")
    Call<List<String>> getAllFakeCategories();
}
