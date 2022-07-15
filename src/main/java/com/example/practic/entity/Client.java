package com.example.practic.entity;

import com.example.practic.models.RegModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "family", nullable = false, length = 45)
    private String family;

    @Column(name = "patronymic", length = 45)
    private String patronymic;

    @Column(name = "phone", length = 12)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    public Client(RegModel regModel)
    {
        name = regModel.getName();
        family = regModel.getFamily();
        patronymic = regModel.getPatronymic();
        phone = regModel.getPhone();
        email = regModel.getEmail();
        password = regModel.getPassword();
    }
    public Client(RegModel regModel, Integer id)
    {
        this.id = id;
        name = regModel.getName();
        family = regModel.getFamily();
        patronymic = regModel.getPatronymic();
        phone = regModel.getPhone();
        email = regModel.getEmail();
        password = regModel.getPassword();
    }

    public Client() {

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}