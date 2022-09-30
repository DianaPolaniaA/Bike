package com.bike.bike.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.bike.model.Message;
import com.bike.bike.repository.MessageRepository;



@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> obtenerMensajes() {
        return messageRepository.obtenerMensajes();
    }


    public Message salvarMessage(Message message) {
      //if(room.getId()==null){
            return messageRepository.salvarMessage(message);
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
