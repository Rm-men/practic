package com.example.practic.services;

import com.example.practic.entity.Order;
import com.example.practic.entity.StoryOrderMove;
import com.example.practic.models.NewOrderModel;
import com.example.practic.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    PhoneRepository phoneRepository;
    @Autowired
    PhoneModelsRepository phoneModelsRepository;
    @Autowired
    OrderStatusRepository orderStatusRepository;
    @Autowired
    ListWorkshopRepository listWorkshopRepository;
    @Autowired
    StoryOrderMoveRepository storyOrderMoveRepository;
    public List<Order> GetOrdersFor(Integer id_client) {
        return orderRepository.getAllByIdClientId(id_client);
    }
    public Order GetOrder(Integer id) {
        return orderRepository.getOrderById(id);
    }
    public Boolean OrderSetAgreement(Integer id, Boolean agree) {
        if (orderRepository.getOrderById(id) == null)
            return false;
        if (agree == null)
            return null;
        Order order = orderRepository.getOrderById(id);
        order.setAgreement(agree);
        orderRepository.save(order);
        return true;
    }
    public Boolean OrderSetPayed(Integer id, Boolean pay) {
        if (orderRepository.getOrderById(id) == null)
            return false;
        if (pay == null)
            return null;
        Order order = orderRepository.getOrderById(id);
        order.setPayed(pay);
        orderRepository.save(order);
        return true;
    }
    public List<StoryOrderMove> GetStoryOrderMove(Integer id) {
        return storyOrderMoveRepository.getStoryOrderMovesByIdorderId(id);
    }
    public Boolean CreateNewOrder(NewOrderModel newOrderModel) {
        try {
            if (newOrderModel.Truly())
            {
                Order order = new Order(newOrderModel);
                order.setIdClient(clientRepository.getClientById(newOrderModel.getIdClient()));
                order.setIdPhone(phoneModelsRepository.getPhoneModelById(newOrderModel.getIdPhoneModel()));
                order.setIdOrderStatus(orderStatusRepository.getOrderStatusById("add_0"));
                if (!order.ValidCheck())
                    return null;
                orderRepository.save(order);
                return true;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
