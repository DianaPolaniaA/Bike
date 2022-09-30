package com.bike.bike.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.bike.bike.model.Bike;

public interface BikeCrudRepository extends CrudRepository <Bike,Integer>{
    
}
