package com.bike.bike.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.bike.model.Bike;
import com.bike.bike.repository.BikeRepository;

@Service
public class BikeService {
    
    @Autowired
    private BikeRepository bikeRepository;
    
    public List<Bike> obtenerBikes(){
        return bikeRepository.obtenerBikes();
    }

    public Optional<Bike> bikePorId(int id){
        return bikeRepository.bikePorId(id);
    } 
    
    public Bike guardarBike(Bike bike) {
        if (bike.getId() == null) {
            return bikeRepository.guardarBike(bike);
        } else {
            Optional<Bike> bike1 = bikeRepository.bikePorId(bike.getId());
            if (bike1.isEmpty()) {
                return bikeRepository.guardarBike(bike);
            } else {
                return bike;
            }
        }
    }

}
