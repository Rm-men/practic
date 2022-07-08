package com.example.practic.repository;

import com.example.practic.entity.OnOrderCmp;
import com.example.practic.entity.OnOrderSrv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnOrderSrvRepository extends JpaRepository<OnOrderSrv, Integer> {
}
