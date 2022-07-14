package com.example.practic.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "component")
public class Component {
    @Id
    @Column(name = "id_component", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "name", nullable = false, length = 40)
    private String namecmp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_guarantee")
    private Guarantee idGuarantee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturer")
    private Manufacturer manufacturer;

    @Column(name = "price", precision = 12, scale = 2)
    private BigDecimal price;

    @Column(name = "count")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String typecmp) {
        this.type = typecmp;
    }

    public String getNamecmp() {
        return namecmp;
    }

    public void setNamecmp(String namecmp) {
        this.namecmp = namecmp;
    }

    public Guarantee getIdGuarantee() {
        return idGuarantee;
    }

    public void setIdGuarantee(Guarantee idGuaranteecmp) {
        this.idGuarantee = idGuaranteecmp;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturercmp) {
        this.manufacturer = manufacturercmp;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal pricecmp) {
        this.price = pricecmp;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}