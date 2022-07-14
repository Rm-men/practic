package com.example.practic.services;

import com.example.practic.entity.WorkingAddresses;
import com.example.practic.repository.WorkingAddressesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class WorkShopService {
    @Autowired
    WorkingAddressesRepository listWorkshopRepository;
    public List<WorkingAddresses> getModels() {
        return listWorkshopRepository.findAll();
    }

    public List<String> getAddress() { // наверное можно сделать проще
        List<String> address = new ArrayList<>();
        for (WorkingAddresses w: getModels()) {
            if (Objects.equals(w.getType(), "Пункт приема")) // вынести бы это на отедльные параметры
                address.add(w.getAddress());
        }
        return address;
    }
}
