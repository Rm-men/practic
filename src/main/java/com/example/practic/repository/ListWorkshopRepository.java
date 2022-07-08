package com.example.practic.repository;

import com.example.practic.entity.ListWorkshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListWorkshopRepository extends JpaRepository<ListWorkshop, Integer> {
    List<ListWorkshop> findAll ();

}
