package com.example.practic.controller;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModel;
import com.example.practic.models.RegModel;
import com.example.practic.repository.ClientRepository;
import com.example.practic.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired// инициализирует репозиторий (может так то всё) при заходе в контроллер
    ClientService clientService;
    @PostMapping(path="/signin",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean LoginUser (@RequestBody @Validated AuthModel authModel){ // названия важны
        return clientService.LoginUser(authModel);
    }
    // !!! как сохнанять/добавлять сущности
    @PostMapping(path="/signon",produces = MediaType.APPLICATION_JSON_VALUE)
    public RegAnswerModel RegisterUser (@RequestBody @Validated RegModel regModel) throws IllegalAccessException { // !!! добавить хэширование
        return clientService.RegisterUser(regModel);
    }
}
