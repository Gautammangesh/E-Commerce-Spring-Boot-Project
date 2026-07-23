package com.example.SpringBootProject.mappers;

import com.example.SpringBootProject.dto.CategoryDTO;
import java.util.List;

public class GetAllCategoriesMapper {

    public static List<CategoryDTO> toCategoryDto(List<String> categories) {
        return categories.stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }

}
