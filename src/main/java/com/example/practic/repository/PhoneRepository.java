package com.example.practic.repository;

import com.example.practic.entity.OrderStatus;
import com.example.practic.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
