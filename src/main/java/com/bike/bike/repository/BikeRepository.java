package com.bike.bike.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.bike.model.Bike;
import com.bike.bike.repository.crudRepository.BikeCrudRepository;

@Repository
public class BikeRepository {
    @Autowired
    private BikeCrudRepository bikeCrudRepository;

    public List<Bike> obtenerBikes(){
        return (List<Bike>) bikeCrudRepository.findAll();
    }

    public Optional<Bike> bikePorId(int id){
        return bikeCrudRepository.findById(id);
    }

    public Bike guardarBike (Bike bike){
        return bikeCrudRepository.save(bike);
    }
}
