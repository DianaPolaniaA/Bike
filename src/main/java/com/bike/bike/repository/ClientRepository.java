package com.bike.bike.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.bike.model.Clients;
import com.bike.bike.repository.crudRepository.ClientCrudRepository;


@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Clients> obtenerClientes() {
        return (List<Clients>) clientCrudRepository.findAll();
    }

    public Clients salvarCliente(Clients client) {
        return clientCrudRepository.save(client);
    }
}
