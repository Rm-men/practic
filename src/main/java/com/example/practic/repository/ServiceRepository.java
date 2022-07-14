package com.example.practic.repository;

import com.example.practic.entity.Sirvice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Sirvice, Integer> {

}
