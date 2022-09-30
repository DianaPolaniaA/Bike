package com.bike.bike.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.bike.model.Category;
import com.bike.bike.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> obtenerCategorias(){
        return categoryRepository.obtenerCategorias();
    }

    public Optional<Category> categoryPorId(int id){
        return categoryRepository.categoryPorId(id);
    } 
    
    public Category guardarCategory(Category category) {
        if (category.getId() == null) {
            return categoryRepository.categoryGuardar(category);
        } else {
            Optional<Category> category1 = categoryRepository.categoryPorId(category.getId());
            if (category1.isEmpty()) {
                return categoryRepository.categoryGuardar(category);
            } else {
                return category;
            }
        }
    }
}
