package com.example.practic.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "story_order_move")
public class StoryOrderMove {
    @Id
    @Column(name = "idmove", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idorder")
    private Order idorder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idhuman")
    private Employee idhuman;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idoldstatus")
    private OrderStatus idoldstatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idnewstatus")
    private OrderStatus idnewstatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idoldaddress")
    private ListWorkshop idoldaddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idnewaddress")
    private ListWorkshop idnewaddress;

    @Column(name = "somdate")
    private Instant somdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdorder() {
        return idorder;
    }

    public void setIdorder(Order idorder) {
        this.idorder = idorder;
    }

    public Employee getIdhuman() {
        return idhuman;
    }

    public void setIdhuman(Employee idhuman) {
        this.idhuman = idhuman;
    }

    public OrderStatus getIdoldstatus() {
        return idoldstatus;
    }

    public void setIdoldstatus(OrderStatus idoldstatus) {
        this.idoldstatus = idoldstatus;
    }

    public OrderStatus getIdnewstatus() {
        return idnewstatus;
    }

    public void setIdnewstatus(OrderStatus idnewstatus) {
        this.idnewstatus = idnewstatus;
    }

    public ListWorkshop getIdoldaddress() {
        return idoldaddress;
    }

    public void setIdoldaddress(ListWorkshop idoldaddress) {
        this.idoldaddress = idoldaddress;
    }

    public ListWorkshop getIdnewaddress() {
        return idnewaddress;
    }

    public void setIdnewaddress(ListWorkshop idnewaddress) {
        this.idnewaddress = idnewaddress;
    }

    public Instant getSomdate() {
        return somdate;
    }

    public void setSomdate(Instant somdate) {
        this.somdate = somdate;
    }

}