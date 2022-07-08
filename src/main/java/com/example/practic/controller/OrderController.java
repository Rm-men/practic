package com.example.practic.controller;

import com.example.practic.entity.Order;
import com.example.practic.entity.StoryOrderMove;
import com.example.practic.models.AuthModel;
import com.example.practic.models.NewOrderModel;
import com.example.practic.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired// инициализирует репозиторий при заходе в контроллер
    OrderService orderService;
    @PostMapping(path="/new_order", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean LoginUser (@RequestBody @Validated NewOrderModel newOrderModel){ // названия важны
        return orderService.CreateNewOrder(newOrderModel);
    }
    @GetMapping(path="/get_order_for")
    public List<Order> GetOrdersFor (@RequestParam(value = "id_client") String id){
        Integer id_client = Integer.valueOf(id);
        return orderService.GetOrdersFor(id_client);
        // return null;
    }
    @GetMapping(path="/get_order")
    public Order GetOrder (@RequestParam(value = "id") String id){
        // orderService.UpdateOrder(Integer.valueOf(id));
        return orderService.GetOrder(Integer.valueOf(id));
        // return orderService.GetOrder(59);
    }
    @GetMapping(path="/get_order_move")
    public List<StoryOrderMove> GetOrderMove (@RequestParam(value = "idorder") String idorder){
        return orderService.GetStoryOrderMove(Integer.valueOf(idorder));
    }
    @GetMapping(path="/set_agree")
    public Boolean SetOrderAgreement (@RequestParam(value = "idorder") String idorder, @RequestParam(value = "agreement") Boolean agreement){
        orderService.OrderSetAgreement(Integer.valueOf(idorder), agreement);
        return true;
    }
    @GetMapping(path="/set_pay")
    public Boolean SetOrderPayed (@RequestParam(value = "idorder") String idorder, @RequestParam(value = "payed") Boolean agreement){
        orderService.OrderSetPayed(Integer.valueOf(idorder), agreement);
        return true;
    }
}
