package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "list_sirvices")
public class ListSirvice {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "namesrv", length = 55)
    private String namesrv;

    @Column(name = "typesrv", length = 25)
    private String typesrv;

    @Column(name = "descriptionsrv")
    @Type(type = "org.hibernate.type.TextType")
    private String descriptionsrv;

    @Column(name = "costsrv", precision = 12, scale = 2)
    private BigDecimal costsrv;

    @Column(name = "timesrv")
    @Type(type = "org.hibernate.type.TextType")
    private String timesrv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamesrv() {
        return namesrv;
    }

    public void setNamesrv(String namesrv) {
        this.namesrv = namesrv;
    }

    public String getTypesrv() {
        return typesrv;
    }

    public void setTypesrv(String typesrv) {
        this.typesrv = typesrv;
    }

    public String getDescriptionsrv() {
        return descriptionsrv;
    }

    public void setDescriptionsrv(String descriptionsrv) {
        this.descriptionsrv = descriptionsrv;
    }

    public BigDecimal getCostsrv() {
        return costsrv;
    }

    public void setCostsrv(BigDecimal costsrv) {
        this.costsrv = costsrv;
    }

    public String getTimesrv() {
        return timesrv;
    }

    public void setTimesrv(String timesrv) {
        this.timesrv = timesrv;
    }

}