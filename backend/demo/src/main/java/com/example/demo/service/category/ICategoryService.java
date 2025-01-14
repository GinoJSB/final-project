package com.example.demo.service.category;

import com.example.demo.model.Entity.Category;
import java.util.List;

public interface ICategoryService {
    List<Category> findAllById(List<Long> ids);
}
