package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guarantee")
public class Guarantee {
    @Id
    @Column(name = "id_guarantee", nullable = false)
    private Integer id;

    @Column(name = "period")
    private Integer period;

    @Column(name = "conditions")
    @Type(type = "org.hibernate.type.TextType")
    private String conditions;

    public Guarantee(Integer id, Integer period, String conditions){
        this.id = id;
        this.period = period;
        this.conditions = conditions;
    }
    public Guarantee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

}