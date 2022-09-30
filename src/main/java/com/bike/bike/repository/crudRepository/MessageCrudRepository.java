package com.bike.bike.repository.crudRepository;



import org.springframework.data.repository.CrudRepository;

import com.bike.bike.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
    
}
