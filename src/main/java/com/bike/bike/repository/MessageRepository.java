package com.bike.bike.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.bike.model.Message;
import com.bike.bike.repository.crudRepository.MessageCrudRepository;



@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> obtenerMensajes() {
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Message salvarMessage(Message message) {
        return messageCrudRepository.save(message);
    }
}
