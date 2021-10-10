package com.gIssamu.javaspringdesignpatternspractice.repository;

import com.gIssamu.javaspringdesignpatternspractice.model.Client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{
    
}
