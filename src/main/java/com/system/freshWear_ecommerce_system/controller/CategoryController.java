package com.system.freshWear_ecommerce_system.controller;


import com.system.freshWear_ecommerce_system.dto.CategoryDto;
import com.system.freshWear_ecommerce_system.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/add")
    public String addCategory(@Valid CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);
        return "redirect:/item/add";
    }
}
