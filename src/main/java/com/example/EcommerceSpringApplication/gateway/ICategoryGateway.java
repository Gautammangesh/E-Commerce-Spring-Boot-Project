package com.example.EcommerceSpringApplication.gateway;

import com.example.EcommerceSpringApplication.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getAllCategories() throws IOException;

}