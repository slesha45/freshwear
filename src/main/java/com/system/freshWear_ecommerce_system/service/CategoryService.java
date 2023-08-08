package com.system.freshWear_ecommerce_system.service;

import com.system.freshWear_ecommerce_system.dto.CategoryDto;
import com.system.freshWear_ecommerce_system.entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();

    Category getCategoryById(int categoryId);

}
