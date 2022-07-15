package com.example.practic.models;

public class NewOrderModel {
    private Integer idClient;
    private String phoneNumber;
    private String address;
    private Integer idPhoneModel;
    private String descriptionOrd;
    public boolean Truly(){
        return (idClient != null & phoneNumber != null & address != null & idPhoneModel != null &  descriptionOrd != null);
    }
    public NewOrderModel (){

    }
    public NewOrderModel withIdClient(Integer i){
        this.idClient = i;
        return this;
    }
    public NewOrderModel withPhoneNumber(String ph){
        this.phoneNumber = ph;
        return this;
    }
    public NewOrderModel withAddress(String a){
        this.address = a;
        return this;
    }
    public NewOrderModel withPhoneModel(Integer pm){
        this.idPhoneModel = pm;
        return this;
    }
    public NewOrderModel withDescription(String d){
        this.descriptionOrd = d;
        return this;
    }
    public NewOrderModel build() {
        NewOrderModel nom = new NewOrderModel();
        nom.idPhoneModel = idPhoneModel;
        nom.idClient = idClient;
        nom.phoneNumber = phoneNumber;
        nom.address = address;
        nom.descriptionOrd = descriptionOrd;
        if (Truly())
            return nom;
        else
            return  null;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdPhoneModel() {
        return idPhoneModel;
    }

    public void setIdPhoneModel(Integer idPhoneModel) {
        this.idPhoneModel = idPhoneModel;
    }

    public String getDescriptionOrd() {
        return descriptionOrd;
    }

    public void setDescriptionOrd(String descriptionOrd) {
        this.descriptionOrd = descriptionOrd;
    }
}
