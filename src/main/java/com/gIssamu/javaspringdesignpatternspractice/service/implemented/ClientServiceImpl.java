package com.gIssamu.javaspringdesignpatternspractice.service.implemented;

import com.gIssamu.javaspringdesignpatternspractice.model.Address;
import com.gIssamu.javaspringdesignpatternspractice.model.Client;
import com.gIssamu.javaspringdesignpatternspractice.repository.AddressRepository;
import com.gIssamu.javaspringdesignpatternspractice.repository.ClientRepository;
import com.gIssamu.javaspringdesignpatternspractice.service.ClientService;
import com.gIssamu.javaspringdesignpatternspractice.service.ViaCepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ViaCepService viaCepService; 

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
            .get();         
    }

    @Override
    public void insert(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void update(Long id, Client clinet) {
        saveClientWithCep(
            clientRepository.findById(id)
                .orElseGet(() -> {
                    return null; 
                })
        ); 
        
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);        
    }

    private void saveClientWithCep(Client client) {
        String cep = client.getAddress().getCep(); 

        Address address = addressRepository.findById(cep)
            .orElseGet(() -> {
                Address newAddress = viaCepService.consultCep(cep);

                addressRepository.save(newAddress);

                return newAddress;
            });

        client.setAddress(address);

        clientRepository.save(client); 

    }
    
}
