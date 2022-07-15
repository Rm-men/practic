package com.example.practic.entity;

import com.example.practic.models.NewOrderModel;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date")
    private Date date;

    @Column(name = "\"phone_number\"")
    @Type(type = "org.hibernate.type.TextType")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_client")
    private Client idClient;

    @Column(name = "\"id_master\"")
    private Integer idMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_phone\"")
    private PhoneModel idPhone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_order_status\"")
    private OrderStatus idOrderStatus;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "comments")
    @Type(type = "org.hibernate.type.TextType")
    private String comments;

    @Column(name = "price", precision = 12, scale = 2)
    private BigDecimal price;

    @Column(name = "agreement")
    private Boolean agreement;

    @Column(name = "diagnostic")
    @Type(type = "org.hibernate.type.TextType")
    private String diagnostic;

    @Column(name = "payed")
    private Boolean payed;
    public Order (){

    }
    public Order (NewOrderModel newOrderModel){
        phoneNumber = newOrderModel.getPhoneNumber();
        description = newOrderModel.getDescriptionOrd();
        address = newOrderModel.getAddress();
        date = new Date();
        price = BigDecimal.valueOf(0);
        idMaster = 0;
        // idPhone = newOrderModel.getIdPhoneModel();
        // idClient = clientRepository.getById(newOrderModel.getIdClient());
    }
    public Order (NewOrderModel newOrderModel, Client client, PhoneModel phoneModel, Integer id){
        this.id = id;
        phoneNumber = newOrderModel.getPhoneNumber();
        description = newOrderModel.getDescriptionOrd();
        address = newOrderModel.getAddress();
        date = new Date();
        price = BigDecimal.valueOf(0);
        idMaster = 0;
        idPhone = phoneModel;
        idClient = client;
    }
    public Boolean ValidCheck(){
        return
                idClient != null &
                phoneNumber != null &
                description != null &
                address != null &
                idPhone != null &

                date != null &
                price != null &
                idMaster == 0 &
                idOrderStatus != null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public PhoneModel getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(PhoneModel idPhone) {
        this.idPhone = idPhone;
    }

    public OrderStatus getIdOrderStatus() {
        return idOrderStatus;
    }

    public void setIdOrderStatus(OrderStatus idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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