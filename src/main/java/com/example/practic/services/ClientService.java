package com.example.practic.services;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public boolean LoginUser(AuthModel authModel) {
        try {
            return clientRepository.getClientByEmail(authModel.getEmail()).getClpassword().equals(authModel.getClpassword());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
