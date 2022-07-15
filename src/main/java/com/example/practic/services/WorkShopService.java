package com.example.practic.services;

import com.example.practic.entity.WorkingAddress;
import com.example.practic.repository.ListWorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class WorkShopService {
    @Autowired
    ListWorkshopRepository listWorkshopRepository;
    public List<WorkingAddress> getModels() {
        return listWorkshopRepository.findAll();
    }

    public List<WorkingAddress> getReceptionPoints() {
/*        List<String> address = new ArrayList<>();
        for (WorkingAddress w: getModels()) {
            if (Objects.equals(w.getType(), "Пункт приема")) // вынести бы это на отедльные параметры
                address.add(w.getAddress());
        }
        return address;*/
        return listWorkshopRepository.getAllByType("Пункт приема");
    }
}
