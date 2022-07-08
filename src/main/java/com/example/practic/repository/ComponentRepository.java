package com.example.practic.repository;

import com.example.practic.entity.Client;
import com.example.practic.entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Integer> {

}
