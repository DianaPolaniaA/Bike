package com.bike.bike.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.bike.model.Reservation;
import com.bike.bike.repository.ReservationRepository;



@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> obtenerReservaciones() {
        return reservationRepository.obtenerReservaciones();
    }


    public Reservation salvarReservacion(Reservation reservation) {
      //if(room.getId()==null){
            return reservationRepository.salvarReservacion(reservation);
       //  }else{
        /*     Optional<Room> roomOptional = roomRepository.obtenerRoomId(room.getId());
            if(roomOptional.isEmpty()){
                return roomRepository.agregarRoom(room);
            }
            else{
              return room;
           }
            */
        //}
        
    }
}
