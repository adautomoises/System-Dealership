package com.system.dealership.service;

import com.system.dealership.model.Client;
import com.system.dealership.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;

    public List<Client> getClients(){
        return repository.findAll();
    }

    @Transactional
    public Client postClient(Client client){
        return repository.save(client);
    }

    @Transactional
    public Client putClient(Client client){
        return repository.save(client);
    }

    @Transactional
    public Void deleteClient(UUID id){
        repository.deleteById(id);
        return null;
    }
}