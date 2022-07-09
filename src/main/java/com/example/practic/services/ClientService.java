package com.example.practic.services;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModel;
import com.example.practic.models.RegModel;
import com.example.practic.repository.ClientRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public boolean LoginUser(AuthModel authModel) {
        try {
            // return clientRepository.getClientByEmail(authModel.getEmail()).getClpassword().equals(authModel.getClpassword());
            return ((clientRepository.getClientByEmailAndClpassword(authModel.getEmail(), authModel.getClpassword()) != null));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public RegAnswerModel RegisterUser(@NotNull RegModel regModel) throws IllegalAccessException {
        RegAnswerModel regAnswerModel = new RegAnswerModel();
        regAnswerModel.setName(regModel.getName() != null);
        regAnswerModel.setFamily(regModel.getFamily()!=null);
        regAnswerModel.setPhone(regModel.getPhone()!=null);
        regAnswerModel.setClpassword(regModel.getClpassword()!=null);
        regAnswerModel.setEmail(regModel.getEmail()!=null);
        if (!regAnswerModel.AllFielldFilled()) return regAnswerModel;
        try {
            if (clientRepository.getClientByEmail(regModel.getEmail()) == null)
            {
                regAnswerModel.setUserIsNotExist(true);
                Client client = new Client(regModel);
                clientRepository.save(client);
                regAnswerModel.setRegComplete();
            }
            else regAnswerModel.setUserIsNotExist(false);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return regAnswerModel;
    }
    public boolean RegisterUser2(RegModel regModel) {
        try {
            // if (clientRepository.getClientByEmail(regModel.getEmail()).getClpassword().equals(regModel.getClpassword()))
            {
                Client client = new Client(regModel);
                clientRepository.save(client);
            }
            // else
            return true;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
