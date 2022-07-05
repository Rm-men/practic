package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "on_order_srv")
public class OnOrderSrv {
    @Id
    @Column(name = "id_srv_onord", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_order_forservice")
    private Order idOrderForservice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_srv_onlist")
    private ListSirvice idSrvOnlist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdOrderForservice() {
        return idOrderForservice;
    }

    public void setIdOrderForservice(Order idOrderForservice) {
        this.idOrderForservice = idOrderForservice;
    }

    public ListSirvice getIdSrvOnlist() {
        return idSrvOnlist;
    }

    public void setIdSrvOnlist(ListSirvice idSrvOnlist) {
        this.idSrvOnlist = idSrvOnlist;
    }

}