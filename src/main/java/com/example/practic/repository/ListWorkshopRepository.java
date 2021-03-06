package com.example.practic.repository;

import com.example.practic.entity.WorkingAddress;
import com.example.practic.entity.WorkingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListWorkshopRepository extends JpaRepository<WorkingAddress, Integer> {
    List<WorkingAddress> findAll ();
    // List<WorkingAddress> getListWorkshopByAddressAndType(String address, String type);
    List<WorkingAddress>getAllByType(String type);
}
