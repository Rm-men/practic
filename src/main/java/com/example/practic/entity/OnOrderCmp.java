package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "on_order_cmp")
public class OnOrderCmp {
    @Id
    @Column(name = "id_cmp_onord", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_order_forcomp")
    private Order idOrderForcomp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cmp_onlist")
    private Component idCmpOnlist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdOrderForcomp() {
        return idOrderForcomp;
    }

    public void setIdOrderForcomp(Order idOrderForcomp) {
        this.idOrderForcomp = idOrderForcomp;
    }

    public Component getIdCmpOnlist() {
        return idCmpOnlist;
    }

    public void setIdCmpOnlist(Component idCmpOnlist) {
        this.idCmpOnlist = idCmpOnlist;
    }

}