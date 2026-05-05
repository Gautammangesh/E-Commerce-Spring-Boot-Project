package com.example.EcommerceSpringApplication.gateway;

import com.example.EcommerceSpringApplication.dto.CategoryDTO;
import com.example.EcommerceSpringApplication.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // Execute the network call
        Response<List<String>> response = this.fakeStoreCategoryApi.getAllFakeCategories().execute();

        List<CategoryDTO> categoryDTOS = new ArrayList<>();

        // Map the String response from FakeStore to our CategoryDTO list
        if (response.isSuccessful() && response.body() != null) {
            for (String categoryName : response.body()) {
                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setName(categoryName);
                categoryDTOS.add(categoryDTO);
            }
        }

        return categoryDTOS;
    }
}
