package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "imei", length = 17)
    private String imei;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_phone_model")
    private PhoneModel idPhoneModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public PhoneModel getIdPhoneModel() {
        return idPhoneModel;
    }

    public void setIdPhoneModel(PhoneModel idPhoneModel) {
        this.idPhoneModel = idPhoneModel;
    }

}