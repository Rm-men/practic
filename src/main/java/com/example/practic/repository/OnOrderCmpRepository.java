package com.example.practic.repository;

import com.example.practic.entity.Manufacturer;
import com.example.practic.entity.OnOrderCmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnOrderCmpRepository extends JpaRepository<OnOrderCmp, Integer> {

}
