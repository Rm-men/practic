package com.example.practic.services;

import com.example.practic.entity.PhoneModel;
import com.example.practic.repository.PhoneModelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonesService {
    @Autowired
    PhoneModelsRepository phoneModelsRepository;
    public List<PhoneModel> getModels() {
        return phoneModelsRepository.findAll();
    }
}
