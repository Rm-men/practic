package com.example.practic.services;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModel;
import com.example.practic.models.RegModel;
import com.example.practic.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.lang.reflect.Field;

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

    public RegAnswerModel RegisterUser(RegModel regModel) throws IllegalAccessException {
        RegAnswerModel regAnswerModel = new RegAnswerModel();
        regAnswerModel.setName(regModel.getName() != null);
        regAnswerModel.setFamily(regModel.getFamily()!=null);
        regAnswerModel.setPhone(regModel.getPhone()!=null);
        regAnswerModel.setClpassword(regModel.getClpassword()!=null);
        regAnswerModel.setEmail(regModel.getEmail()!=null);
        if (!regAnswerModel.Truly()) return regAnswerModel;
        try {
            if (clientRepository.getClientByEmail(regModel.getEmail()) == null)
            {
                Client client = new Client(regModel);
                clientRepository.save(client);
                regAnswerModel.setRegComplete();
            }
            else regAnswerModel.setUserIsExist(true);
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
