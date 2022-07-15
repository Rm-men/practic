package com.example.practic.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "\"story_order_move\"")
public class StoryOrderMove {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_order\"")
    private Order idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_human\"")
    private Employee idHuman;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_old_status\"")
    private OrderStatus idOldStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_new_status\"")
    private OrderStatus idNewStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_old_address\"")
    private WorkingAddress idOldAddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_new_address\"")
    private WorkingAddress idNewAddress;

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

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Employee getIdHuman() {
        return idHuman;
    }

    public void setIdHuman(Employee idHuman) {
        this.idHuman = idHuman;
    }

    public OrderStatus getIdOldStatus() {
        return idOldStatus;
    }

    public void setIdOldStatus(OrderStatus idOldStatus) {
        this.idOldStatus = idOldStatus;
    }

    public OrderStatus getIdNewStatus() {
        return idNewStatus;
    }

    public void setIdNewStatus(OrderStatus idNewStatus) {
        this.idNewStatus = idNewStatus;
    }

    public WorkingAddress getIdOldAddress() {
        return idOldAddress;
    }

    public void setIdOldAddress(WorkingAddress idOldAddress) {
        this.idOldAddress = idOldAddress;
    }

    public WorkingAddress getIdNewAddress() {
        return idNewAddress;
    }

    public void setIdNewAddress(WorkingAddress idNewAddress) {
        this.idNewAddress = idNewAddress;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

}