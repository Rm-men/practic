package com.example.practic.entity;

import javax.persistence.*;

@Entity
@Table(name = "components_complibility")
public class ComponentsComplibility {
    @Id
    @Column(name = "idcc", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_component")
    private Component idComponent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_phmodel")
    private PhoneModel idPhmodel;

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

    public PhoneModel getIdPhmodel() {
        return idPhmodel;
    }

    public void setIdPhmodel(PhoneModel idPhmodel) {
        this.idPhmodel = idPhmodel;
    }

}