package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "\"on_order_cmp\"")
public class OnOrderCmp {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_order\"")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_cmp\"")
    private Component idCmp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Component getIdCmp() {
        return idCmp;
    }

    public void setIdCmp(Component idCmp) {
        this.idCmp = idCmp;
    }

}