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
    public NewOrderModel (Integer id_client, String phonenumber,  String address, Integer idPhoneModel, String descriptionord){
        this.idClient = id_client;
        this.phoneNumber = phonenumber;
        this.address = address;
        this.idPhoneModel = idPhoneModel;
        this.descriptionOrd = descriptionord;
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
