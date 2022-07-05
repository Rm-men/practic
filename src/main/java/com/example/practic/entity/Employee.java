package com.example.practic.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_contract", length = 8)
    private String idContract;

    @Column(name = "paspserial", nullable = false, length = 4)
    private String paspserial;

    @Column(name = "paspnumber", nullable = false, length = 6)
    private String paspnumber;

    @Column(name = "empaddress")
    @Type(type = "org.hibernate.type.TextType")
    private String empaddress;

    @Column(name = "type", length = 15)
    private String type;

    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    @Column(name = "dateemploymentet", nullable = false)
    private LocalDate dateemploymentet;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "workshop", nullable = false)
    private ListWorkshop workshop;

    @Column(name = "family", nullable = false, length = 30)
    private String family;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "patronymic", length = 30)
    private String patronymic;

    @Column(name = "login", nullable = false, length = 64)
    private String login;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getPaspserial() {
        return paspserial;
    }

    public void setPaspserial(String paspserial) {
        this.paspserial = paspserial;
    }

    public String getPaspnumber() {
        return paspnumber;
    }

    public void setPaspnumber(String paspnumber) {
        this.paspnumber = paspnumber;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateemploymentet() {
        return dateemploymentet;
    }

    public void setDateemploymentet(LocalDate dateemploymentet) {
        this.dateemploymentet = dateemploymentet;
    }

    public ListWorkshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(ListWorkshop workshop) {
        this.workshop = workshop;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}