package com.example.practic.entity;

import com.example.practic.models.RegModel;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client", nullable = false)
    private Integer id;

    @Column(name = "namecl", nullable = false, length = 25)
    private String namecl;

    @Column(name = "family", nullable = false, length = 45)
    private String family;

    @Column(name = "patronymic", length = 45)
    private String patronymic;

    @Column(name = "phone", length = 12)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "clpassword", nullable = false, length = 64)
    private String clpassword;

    public Client(RegModel regModel)
    {
        namecl = regModel.getName();
        family = regModel.getFamily();
        patronymic = regModel.getPatronymic();
        phone = regModel.getPhone();
        email = regModel.getEmail();
        clpassword = regModel.getClpassword();
    };

    public Client() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamecl() {
        return namecl;
    }

    public void setNamecl(String namecl) {
        this.namecl = namecl;
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

    public String getClpassword() {
        return clpassword;
    }

    public void setClpassword(String clpassword) {
        this.clpassword = clpassword;
    }

}