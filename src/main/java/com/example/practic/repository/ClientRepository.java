package com.example.practic.repository;

import com.example.practic.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client getClientById (Integer id);
    Client getClientByEmail(String email);
    // Client getClientByEmailAndClpassword(String email, String clpassword);

    Client getClientByEmailAndPassword(String email, String password);
}
