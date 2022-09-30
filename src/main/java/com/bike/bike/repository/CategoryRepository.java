package com.bike.bike.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.bike.bike.model.Category;
import com.bike.bike.repository.crudRepository.CategoryCrudRepository;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> obtenerCategorias(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> categoryPorId(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category categoryGuardar(Category category){
        return categoryCrudRepository.save(category);
    }
}
