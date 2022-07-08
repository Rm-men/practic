package com.example.practic.repository;

import com.example.practic.entity.Client;
import com.example.practic.entity.OnOrderSrv;
import com.example.practic.entity.Order;
import com.example.practic.entity.PhoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();
    Order getById(Integer id);
    Order getOrderById(Integer id);
    List<Order> getAllByIdClientId(Integer id_client);
}
