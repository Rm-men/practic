package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "on_order_srv")
public class OnOrderSrv {
    @Id
    @Column(name = "id_srv_onord", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idOrder")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idSrv")
    private Sirvice idSrv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrderForservice) {
        this.idOrder = idOrderForservice;
    }

    public Sirvice getIdSrv() {
        return idSrv;
    }

    public void setIdSrv(Sirvice idSrvOnlist) {
        this.idSrv = idSrvOnlist;
    }

}