package com.example.practic.controller;

import com.example.practic.entity.PhoneModel;
import com.example.practic.models.AuthModel;
import com.example.practic.services.ClientService;
import com.example.practic.services.PhonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class ModelsController {
    @Autowired// инициализирует репозиторий при заходе в контроллер
    ClientService clientService;
    @Autowired// инициализирует репозиторий при заходе в контроллер
    PhonesService phonesService;
    @GetMapping(path="/phones")
    public List<PhoneModel> GetModels (){ // названия важны
        return phonesService.GetModels();
    }
}
