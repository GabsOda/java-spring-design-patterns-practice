package com.gIssamu.javaspringdesignpatternspractice.service;

import com.gIssamu.javaspringdesignpatternspractice.model.Client;

public interface ClientService {
    
    Iterable<Client> findAll();

    Client findById(Long id); 

    void insert(Client client);

    void update(Long id, Client clinet);

    void delete(Long id); 
}
