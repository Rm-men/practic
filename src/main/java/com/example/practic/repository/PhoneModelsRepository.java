package com.example.practic.repository;

import com.example.practic.entity.Phone;
import com.example.practic.entity.PhoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneModelsRepository extends JpaRepository<PhoneModel, Integer> {
    List<PhoneModel> findAll();
    PhoneModel getPhoneModelById(Integer id);
}