package com.example.practic.services;

import com.example.practic.entity.ListWorkshop;
import com.example.practic.entity.PhoneModel;
import com.example.practic.repository.ListWorkshopRepository;
import com.example.practic.repository.PhoneModelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class WorkShopService {
    @Autowired
    ListWorkshopRepository listWorkshopRepository;
    public List<ListWorkshop> GetModels() {
        return listWorkshopRepository.findAll();
    }

    public List<String> GetAddress() { // наверное можно сделать проще
        List<String> address = new ArrayList<>();
        for (ListWorkshop w: GetModels()) {
            if (Objects.equals(w.getType(), "Пункт приема")) // вынести бы это на отедльные параметры
                address.add(w.getAddress());
        }
        return address;
    }
}
