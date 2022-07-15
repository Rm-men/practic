package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "phone_model")
public class PhoneModel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;

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
        this.name = namephone;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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