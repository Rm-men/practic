package com.example.practic.services;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModelBuilder;
import com.example.practic.models.RegModel;
import com.example.practic.repository.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public boolean loginUser(AuthModel authModel) {
        try {
            return ((clientRepository.getClientByEmailAndPassword(authModel.getEmail(), authModel.getPassword()) != null));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public RegAnswerModelBuilder registerUser(@NotNull RegModel regModel) {
        RegAnswerModelBuilder regAnswerModelBuilder = new RegAnswerModelBuilder()
                .withName(regModel.getName())
                .withFamily(regModel.getFamily())
                .withPhone(regModel.getPhone())
                .withPassword(regModel.getPassword())
                .withEmail(regModel.getEmail())
                .build();
        if (regAnswerModelBuilder != null) return regAnswerModelBuilder;
        try {
            if (clientRepository.getClientByEmail(regModel.getEmail()) == null)
            {
                regAnswerModelBuilder.setUserIsNotExist(true);
                Client client = new Client(regModel);
                clientRepository.save(client);
                regAnswerModelBuilder.setRegComplete();
            }
            else regAnswerModelBuilder.setUserIsNotExist(false);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return regAnswerModelBuilder;
    }
}
