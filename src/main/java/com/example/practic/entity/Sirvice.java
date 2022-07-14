package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sirvices")
public class Sirvice {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 55)
    private String name;

    @Column(name = "type", length = 25)
    private String type;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "cost", precision = 12, scale = 2)
    private BigDecimal cost;

    @Column(name = "time")
    @Type(type = "org.hibernate.type.TextType")
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String namesrv) {
        this.name = namesrv;
    }

    public String getType() {
        return type;
    }

    public void setType(String typesrv) {
        this.type = typesrv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriptionsrv) {
        this.description = descriptionsrv;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal costsrv) {
        this.cost = costsrv;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timesrv) {
        this.time = timesrv;
    }

}