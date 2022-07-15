package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "\"on_order_srv\"")
public class OnOrderSrv {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_order\"")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_srv\"")
    private Service idSrv;

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

    public Service getIdSrv() {
        return idSrv;
    }

    public void setIdSrv(Service idSrv) {
        this.idSrv = idSrv;
    }

}