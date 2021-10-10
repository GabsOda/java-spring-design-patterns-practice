package com.gIssamu.javaspringdesignpatternspractice.repository;

import com.gIssamu.javaspringdesignpatternspractice.model.Address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String>{
    
}
