package com.example.SpringBootProject.gateway;

import com.example.SpringBootProject.dto.CategoryDTO;
import com.example.SpringBootProject.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // FakeStore returns categories as a raw JSON string array.
        Response<List<String>> response = this.fakeStoreCategoryApi.getAllFakeCategories().execute();

        if (!response.isSuccessful() || response.body() == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        return response.body().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
