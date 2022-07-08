package com.example.practic.models;

public class RegAnswerModel {
    private Boolean family;
    private Boolean name;
    private Boolean email;
    private Boolean phone;
    private Boolean clpassword;
    private Boolean allFieldIn;
    private Boolean userIsExist;
    private Boolean regComplete;

    public boolean Truly(){
        allFieldIn = family&name&email&phone&clpassword;
        return allFieldIn;
    }
    public RegAnswerModel (){
        family = false;
        name = false;
        email = false;
        phone = false;
        clpassword = false;
        allFieldIn = false;
        regComplete = false;
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

    public Boolean getClpassword() {
        return clpassword;
    }

    public void setClpassword(Boolean clpassword) {
        this.clpassword = clpassword;
    }

    public Boolean getUserIsExist() {
        return userIsExist;
    }

    public void setUserIsExist(Boolean userIsExist) {
        this.userIsExist = userIsExist;
    }

    public Boolean getRegComplete() {
        return regComplete;
    }

    public void setRegComplete() {
        this.regComplete = true;
    }
}
