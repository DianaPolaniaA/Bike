package com.bike.bike.repository.crudRepository;



import org.springframework.data.repository.CrudRepository;

import com.bike.bike.model.Clients;



public interface ClientCrudRepository extends CrudRepository<Clients,Integer> {
    
}
