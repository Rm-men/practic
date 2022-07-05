package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id_order", nullable = false)
    private Integer id;

    @Column(name = "dateord")
    private Instant dateord;

    @Column(name = "phonenumber")
    @Type(type = "org.hibernate.type.TextType")
    private String phonenumber;

    @Column(name = "address")
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_client")
    private Client idClient;

    @Column(name = "id_master")
    private Integer idMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_phone")
    private Phone idPhone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_order_status")
    private OrderStatus idOrderStatus;

    @Column(name = "descriptionord")
    @Type(type = "org.hibernate.type.TextType")
    private String descriptionord;

    @Column(name = "comments")
    @Type(type = "org.hibernate.type.TextType")
    private String comments;

    @Column(name = "priceord", precision = 12, scale = 2)
    private BigDecimal priceord;

    @Column(name = "agreement")
    private Boolean agreement;

    @Column(name = "diagnostic")
    @Type(type = "org.hibernate.type.TextType")
    private String diagnostic;

    @Column(name = "payed")
    private Boolean payed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateord() {
        return dateord;
    }

    public void setDateord(Instant dateord) {
        this.dateord = dateord;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

    public Integer getIdMaster() {
        return idMaster;
    }

    public void setIdMaster(Integer idMaster) {
        this.idMaster = idMaster;
    }

    public Phone getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(Phone idPhone) {
        this.idPhone = idPhone;
    }

    public OrderStatus getIdOrderStatus() {
        return idOrderStatus;
    }

    public void setIdOrderStatus(OrderStatus idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    public String getDescriptionord() {
        return descriptionord;
    }

    public void setDescriptionord(String descriptionord) {
        this.descriptionord = descriptionord;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getPriceord() {
        return priceord;
    }

    public void setPriceord(BigDecimal priceord) {
        this.priceord = priceord;
    }

    public Boolean getAgreement() {
        return agreement;
    }

    public void setAgreement(Boolean agreement) {
        this.agreement = agreement;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Boolean getPayed() {
        return payed;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

}