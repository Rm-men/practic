package com.example.practic.models;

import javax.persistence.Column;

public class RegModel {
    private String family;
    private String name;
    private String patronymic;
    private String email;
    private String phone;
    private String clpassword;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
