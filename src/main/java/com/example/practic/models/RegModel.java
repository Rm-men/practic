package com.example.practic.models;

public class RegModel {
    private String family;
    private String name;
    private String patronymic;
    private String email;
    private String phone;
    private String password;

    public  RegModel(){

    }

    public RegModel withName(String n){
        this.name = name;
        return this;
    }
    public RegModel withFamily(String f){
        this.family = family;
        return this;
    }
    public RegModel withPatronymic(String p){
        this.patronymic = patronymic;
        return this;
    }
    public RegModel withPhone(String ph){
        this.phone = phone;
        return this;
    }
    public RegModel withPassword(String pw){
        this.password = password;
        return this;
    }
    public RegModel withEmail(String e){
        this.email = email;
        return this;
    }
    public boolean AllFielldFilled(){
        return family != null & name != null & email != null & phone != null & password != null;
    }

    public RegModel build() {
        RegModel rm = new RegModel();
        rm.name = name;
        rm.family = family;
        rm.patronymic = patronymic;
        rm.phone = phone;
        rm.password = password;
        rm.email = email;
        if (AllFielldFilled())
            return rm;
        else
            return  null;
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
