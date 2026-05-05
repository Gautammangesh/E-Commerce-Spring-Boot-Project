package com.example.EcommerceSpringApplication.services;


import com.example.EcommerceSpringApplication.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> getAllCategories() throws IOException;

}
