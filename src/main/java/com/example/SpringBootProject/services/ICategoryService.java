package com.example.SpringBootProject.services;

import com.example.SpringBootProject.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> getAllCategories() throws IOException;

}
