package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_workshops")
public class ListWorkshop {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "address", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String address;

    @Column(name = "description", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "type", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}