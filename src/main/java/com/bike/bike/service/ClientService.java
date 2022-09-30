package com.bike.bike.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.bike.model.Clients;
import com.bike.bike.repository.ClientRepository;


@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    public List<Clients> obtenerClientes() {
        return clientRepository.obtenerClientes();
    }


    public Clients salvarCliente(Clients client) {
      //if(room.getId()==null){
            return clientRepository.salvarCliente(client);
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
