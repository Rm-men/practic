package com.example.practic.controller;

import com.example.practic.entity.PhoneModel;
import com.example.practic.services.ClientService;
import com.example.practic.services.PhonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhonesController {
    @Autowired// инициализирует репозиторий при заходе в контроллер
    PhonesService phonesService;
    @GetMapping(path="/models")
    public List<PhoneModel> GetModels (){ // названия важны
        return phonesService.GetModels();
    }
}
