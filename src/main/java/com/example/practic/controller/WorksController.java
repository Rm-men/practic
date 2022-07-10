package com.example.practic.controller;

import com.example.practic.services.WorkShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/works")
public class WorksController {
    @Autowired// инициализирует репозиторий при заходе в контроллер
    WorkShopService workShopService;
    @GetMapping(path="/get_address")
    public List<String> GetAddress (){ // названия важны
        return workShopService.GetAddress();
    }
}
