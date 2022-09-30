package com.bike.bike.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bike.bike.model.Bike;
import com.bike.bike.service.BikeService;

@RestController
@RequestMapping("/api/Bike")
@CrossOrigin(origins="*", methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class BikeController {
    
    @Autowired
    private BikeService bikeService;

 
    @GetMapping("/all")
    public List<Bike> obtenerListaBikes(){
        return bikeService.obtenerBikes();
    }

    @GetMapping("/{id}")  // {}  son variables digitarlas
    public Optional<Bike> bikePorId(@PathVariable("id") int bikeId){
        return bikeService.bikePorId(bikeId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike agregarBike(@RequestBody Bike bike){
        return bikeService.guardarBike(bike);
    }

}
