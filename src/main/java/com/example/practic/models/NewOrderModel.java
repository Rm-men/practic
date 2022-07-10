package com.example.practic.models;

public class NewOrderModel {
    private Integer id_client;
    private String phonenumber;
    private String address;
    private Integer idPhoneModel;
    private String descriptionord;
    public boolean Truly(){
        return (id_client != null & phonenumber != null & address != null & idPhoneModel != null &  descriptionord != null);
    }
    public NewOrderModel (){

    }
    public NewOrderModel (Integer id_client, String phonenumber,  String address, Integer idPhoneModel, String descriptionord){
        this.id_client = id_client;
        this.phonenumber = phonenumber;
        this.address = address;
        this.idPhoneModel = idPhoneModel;
        this.descriptionord = descriptionord;
    }
    public Integer getIdClient() {
        return id_client;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
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

    public String getDescriptionord() {
        return descriptionord;
    }

    public void setDescriptionord(String descriptionord) {
        this.descriptionord = descriptionord;
    }
}
