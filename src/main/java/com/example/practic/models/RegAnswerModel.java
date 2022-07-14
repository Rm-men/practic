package com.example.practic.models;

public class RegAnswerModel {
    private Boolean family;
    private Boolean name;
    private Boolean email;
    private Boolean phone;
    private Boolean password;
    private Boolean userIsNotExist;
    private Boolean regComplete;

    public boolean AllFielldFilled(){
        return family & name & email & phone & password;
    }
    public RegAnswerModel (){
        family = false;
        name = false;
        email = false;
        phone = false;
        password = false;
        regComplete = false;
        // userIsNotExist = false;
    }
    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

    public Boolean getName() {
        return name;
    }

    public void setName(Boolean name) {
        this.name = name;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getPhone() {
        return phone;
    }

    public void setPhone(Boolean phone) {
        this.phone = phone;
    }

    public Boolean getPassword() {
        return password;
    }

    public void setPassword(Boolean password) {
        this.password = password;
    }

    public Boolean getUserIsNotExist() {
        return userIsNotExist;
    }

    public void setUserIsNotExist(Boolean userIsNotExist) {
        this.userIsNotExist = userIsNotExist;

    }

    public Boolean getRegComplete() {
        return regComplete;
    }

    public void setRegComplete() {
        if (userIsNotExist == null)
            this.regComplete = false;
        else
            this.regComplete = AllFielldFilled()&userIsNotExist;
    }
}
