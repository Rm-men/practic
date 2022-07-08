package com.example.practic.repository;

import com.example.practic.entity.Employee;
import com.example.practic.entity.Guarantee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuaranteRepository extends JpaRepository<Guarantee, Integer> {

}
