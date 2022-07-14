package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "on_order_cmp")
public class OnOrderCmp {
    @Id
    @Column(name = "id_cmp_onord", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idOrder")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCmp")
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

    public void setIdOrder(Order idOrderForcomp) {
        this.idOrder = idOrderForcomp;
    }

    public Component getIdCmp() {
        return idCmp;
    }

    public void setIdCmp(Component idCmpOnlist) {
        this.idCmp = idCmpOnlist;
    }

}