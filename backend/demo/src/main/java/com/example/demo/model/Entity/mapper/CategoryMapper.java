package com.example.demo.model.Entity.mapper;

import com.example.demo.model.DTO.CategoryResponseDTO;
import com.example.demo.model.Entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponseDTO categoryToCategoryResponseDTO(Category category);
    List<CategoryResponseDTO> categoryListToCategoryResponseDTOList(List<Category> categories);
}
