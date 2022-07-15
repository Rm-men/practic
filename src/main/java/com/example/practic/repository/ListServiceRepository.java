package com.example.practic.repository;

import com.example.practic.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListServiceRepository extends JpaRepository<Service, Integer> {

}
