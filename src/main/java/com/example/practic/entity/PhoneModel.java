package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "phone_model")
public class PhoneModel {
    @Id
    @Column(name = "id_phone_model", nullable = false)
    private Integer id;

    @Column(name = "namephone", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String namephone;

    @Column(name = "specifications", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String specifications;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "guarantee")
    private Guarantee guarantee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturer")
    private Manufacturer manufacturer;

    public PhoneModel(Integer id, String namephone, String specification, Guarantee guarantee, Manufacturer manufacturer) {
        this.id = id;
        this.namephone = namephone;
        this.specifications = specification;
        this.guarantee = guarantee;
        this.manufacturer = manufacturer;
    }

    public PhoneModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamephone() {
        return namephone;
    }

    public void setNamephone(String namephone) {
        this.namephone = namephone;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Guarantee getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}