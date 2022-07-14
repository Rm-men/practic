package com.example.practic.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "story_order_move")
public class StoryOrderMove {
    @Id
    @Column(name = "id_move", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idOrder")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idHuman")
    private Employee idHuman;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idOldStatus")
    private OrderStatus idOldStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNewStatus")
    private OrderStatus idNewStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idOldAddress")
    private WorkingAddresses idOldAddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNewAddress")
    private WorkingAddresses idNewAddress;

    @Column(name = "date")
    private Instant date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idorder) {
        this.idOrder = idorder;
    }

    public Employee getIdHuman() {
        return idHuman;
    }

    public void setIdHuman(Employee idhuman) {
        this.idHuman = idhuman;
    }

    public OrderStatus getIdOldStatus() {
        return idOldStatus;
    }

    public void setIdOldStatus(OrderStatus idoldstatus) {
        this.idOldStatus = idoldstatus;
    }

    public OrderStatus getIdNewStatus() {
        return idNewStatus;
    }

    public void setIdNewStatus(OrderStatus idnewstatus) {
        this.idNewStatus = idnewstatus;
    }

    public WorkingAddresses getIdOldAddress() {
        return idOldAddress;
    }

    public void setIdOldAddress(WorkingAddresses idoldaddress) {
        this.idOldAddress = idoldaddress;
    }

    public WorkingAddresses getIdNewAddress() {
        return idNewAddress;
    }

    public void setIdNewAddress(WorkingAddresses idnewaddress) {
        this.idNewAddress = idnewaddress;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant somdate) {
        this.date = somdate;
    }

}