package com.bike.bike.repository.crudRepository;



import org.springframework.data.repository.CrudRepository;

import com.bike.bike.model.Reservation;



public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
