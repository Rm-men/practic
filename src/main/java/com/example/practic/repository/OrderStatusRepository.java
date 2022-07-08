package com.example.practic.repository;

import com.example.practic.entity.Order;
import com.example.practic.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
    OrderStatus getOrderStatusById (String id);
}
