package com.example.practic.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "component")
public class Component {
    @Id
    @Column(name = "id_component", nullable = false)
    private Integer id;

    @Column(name = "typecmp", nullable = false, length = 20)
    private String typecmp;

    @Column(name = "namecmp", nullable = false, length = 40)
    private String namecmp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_guaranteecmp")
    private Guarantee idGuaranteecmp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturercmp")
    private Manufacturer manufacturercmp;

    @Column(name = "pricecmp", precision = 12, scale = 2)
    private BigDecimal pricecmp;

    @Column(name = "count")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypecmp() {
        return typecmp;
    }

    public void setTypecmp(String typecmp) {
        this.typecmp = typecmp;
    }

    public String getNamecmp() {
        return namecmp;
    }

    public void setNamecmp(String namecmp) {
        this.namecmp = namecmp;
    }

    public Guarantee getIdGuaranteecmp() {
        return idGuaranteecmp;
    }

    public void setIdGuaranteecmp(Guarantee idGuaranteecmp) {
        this.idGuaranteecmp = idGuaranteecmp;
    }

    public Manufacturer getManufacturercmp() {
        return manufacturercmp;
    }

    public void setManufacturercmp(Manufacturer manufacturercmp) {
        this.manufacturercmp = manufacturercmp;
    }

    public BigDecimal getPricecmp() {
        return pricecmp;
    }

    public void setPricecmp(BigDecimal pricecmp) {
        this.pricecmp = pricecmp;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}