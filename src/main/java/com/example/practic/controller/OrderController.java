package com.example.practic.controller;

import com.example.practic.entity.Order;
import com.example.practic.entity.StoryOrderMove;
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
    public boolean createNewOrder(@RequestBody @Validated NewOrderModel newOrderModel){ // названия важны
        return orderService.createNewOrder(newOrderModel);
    }
    @GetMapping(path="/get_order_for")
    public List<Order> getOrdersFor(@RequestParam(value = "id_client") String id){
        Integer id_client = Integer.valueOf(id);
        return orderService.getOrdersFor(id_client);
        // return null;
    }
    @GetMapping(path="/get_order")
    public Order getOrder(@RequestParam(value = "id") String id){
        return orderService.getOrder(Integer.valueOf(id));
    }
    @GetMapping(path="/get_order_move")
    public List<StoryOrderMove> getOrderMove(@RequestParam(value = "idorder") String idorder){
        return orderService.getStoryOrderMove(Integer.valueOf(idorder));
    }
    @GetMapping(path="/set_agree")
    public Boolean setOrderAgreement(@RequestParam(value = "idorder") String idorder, @RequestParam(value = "agreement") Boolean agreement){
        orderService.orderSetAgreement(Integer.valueOf(idorder), agreement);
        return true;
    }
    @GetMapping(path="/set_pay")
    public Boolean setOrderPayed(@RequestParam(value = "idorder") String idorder, @RequestParam(value = "payed") Boolean agreement){
        orderService.orderSetPayed(Integer.valueOf(idorder), agreement);
        return true;
    }
}
