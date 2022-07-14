package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @Column(name = "idos", nullable = false, length = 10)
    private String id;

    @Column(name = "descriptionos")
    @Type(type = "org.hibernate.type.TextType")
    private String descriptionos;

    @Column(name = "logicalSequence", nullable = false)
    private Integer logicalSequence;

    public OrderStatus(String id, String descriptionos,Integer logicalSequence ) {
        this.id = id;
        this.descriptionos = descriptionos;
        this.logicalSequence = logicalSequence;
    }

    public OrderStatus() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescriptionos() {
        return descriptionos;
    }

    public void setDescriptionos(String descriptionos) {
        this.descriptionos = descriptionos;
    }

    public Integer getLogicalSequence() {
        return logicalSequence;
    }

    public void setLogicalSequence(Integer logicalSequence) {
        this.logicalSequence = logicalSequence;
    }

}