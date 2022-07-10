package com.example.practic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @Column(name = "id_manufacturer", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    public Manufacturer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Manufacturer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}