package com.example.practic.repository;

import com.example.practic.entity.Employee;
import com.example.practic.entity.ListSirvice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListServiceRepository extends JpaRepository<ListSirvice, Integer> {

}
