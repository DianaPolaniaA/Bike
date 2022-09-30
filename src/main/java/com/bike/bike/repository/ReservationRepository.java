package com.bike.bike.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.bike.model.Reservation;
import com.bike.bike.repository.crudRepository.ReservationCrudRepository;



@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> obtenerReservaciones() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Reservation salvarReservacion(Reservation reservation) {
        return reservationCrudRepository.save(reservation);
    }
}
