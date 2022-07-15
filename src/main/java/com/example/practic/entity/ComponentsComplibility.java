package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "components_complibility")
public class ComponentsComplibility {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_component\"")
    private Component idComponent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"id_ph_model\"")
    private PhoneModel idPhModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Component getIdComponent() {
        return idComponent;
    }

    public void setIdComponent(Component idComponent) {
        this.idComponent = idComponent;
    }

    public PhoneModel getIdPhModel() {
        return idPhModel;
    }

    public void setIdPhModel(PhoneModel idPhModel) {
        this.idPhModel = idPhModel;
    }

}