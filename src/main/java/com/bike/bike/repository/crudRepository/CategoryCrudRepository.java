package com.bike.bike.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.bike.bike.model.Category;

public interface CategoryCrudRepository extends CrudRepository <Category,Integer>{
    
}
