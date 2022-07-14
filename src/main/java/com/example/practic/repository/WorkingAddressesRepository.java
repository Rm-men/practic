package com.example.practic.repository;

import com.example.practic.entity.WorkingAddresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkingAddressesRepository extends JpaRepository<WorkingAddresses, Integer> {
    List<WorkingAddresses> findAll ();
    WorkingAddresses getListWorkshopByAddressAndType(String address, String type);
}
