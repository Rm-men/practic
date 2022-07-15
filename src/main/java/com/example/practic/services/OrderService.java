package com.example.practic.services;

import com.example.practic.entity.Order;
import com.example.practic.entity.StoryOrderMove;
import com.example.practic.exceptions.NotFilledFieldsEcxeption;
import com.example.practic.exceptions.NotFindOrderEcxeption;
import com.example.practic.models.NewOrderModel;
import com.example.practic.repository.*;
import com.example.practic.repository.ClientRepository;
import com.example.practic.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepo;
    @Autowired
    ClientRepository clientRepo;
    @Autowired
    com.example.practic.repository.PhoneModelsRepository phoneModelsRepo;
    @Autowired
    com.example.practic.repository.OrderStatusRepository orderStatusRepo;
    @Autowired
    com.example.practic.repository.ListWorkshopRepository workingAddressesRepo;
    @Autowired
    com.example.practic.repository.StoryOrderMoveRepository storyOrderMoveRepository;
/*    @Autowired
    PhoneModelsRepo phoneModelsRepo;
    @Autowired
    OrderStatusRepo orderStatusRepo;
    @Autowired
    WorkingAddressesRepo workingAddressesRepo;
    @Autowired
    StoryOrderMoveRepostoryOrderMoveRepo;*/
    public List<Order> getOrdersFor(Integer id_client) {
        return orderRepo.getOrdersByIdClientId(id_client);
    }
    public Order getOrder(Integer id) {
        return orderRepo.getOrderById(id);
    }
    public Boolean orderSetAgreement(Integer id, Boolean agree) throws NotFindOrderEcxeption, NotFilledFieldsEcxeption {
/*
        if (orderRepo.getOrderById(id) == null)
            return false;
        if (agree == null)
            return null;
        Order order = orderRepo.getOrderById(id);
        order.setAgreement(agree);
        orderRepo.save(order);
        return true;
        */
        if (orderRepo.getOrderById(id) == null)
            throw new NotFindOrderEcxeption(id);
        if (agree == null)
            throw new NotFilledFieldsEcxeption("Не заполнено поле с согласием");
        Order order = orderRepo.getOrderById(id);
        order.setAgreement(agree);
        orderRepo.save(order);
        return true;
    }
    public Boolean orderSetPayed(Integer id, Boolean pay) throws NotFilledFieldsEcxeption, NotFindOrderEcxeption {
        if (orderRepo.getOrderById(id) == null)
            throw new NotFindOrderEcxeption(id);
        if (pay == null)
            throw new NotFilledFieldsEcxeption("Не заполнено поле оплаты");
        Order order = orderRepo.getOrderById(id);
        order.setPayed(pay);
        orderRepo.save(order);
        return true;
    }
    public List<StoryOrderMove> getStoryOrderMove(Integer id) {
        return storyOrderMoveRepository.getStoryOrderMovesByIdOrderId(id);
    }
    public Boolean createNewOrder(NewOrderModel newOrderModel) {
        try {
            if (newOrderModel.Truly())
            {
                Order order = new Order(newOrderModel);
                order.setIdClient(clientRepo.getClientById(newOrderModel.getIdClient()));
                order.setIdPhone(phoneModelsRepo.getPhoneModelById(newOrderModel.getIdPhoneModel()));
                order.setIdOrderStatus(orderStatusRepo.getOrderStatusById("add_0"));
                if (!order.ValidCheck()) {
                    String noFilled = "";
                    if (order.getDate() == null)
                        noFilled+= "дата ";
                    if (order.getPrice() == null)
                        noFilled+= "цена ";
                    if (order.getIdMaster() == null)
                        noFilled+= "мастер ";
                    if (order.getIdOrderStatus() == null)
                        noFilled+= "статус заказа ";
                    throw new NotFilledFieldsEcxeption("Не заполнены следующие поля: "+ noFilled);
                }
                orderRepo.save(order);
                return true;
            }
            else
                throw new NotFilledFieldsEcxeption("Не заполнены все поля");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
