package com.mlby.pojo;

public class Joinus {
    private Integer id;

    private String name;

    private Integer sax;

    private String company;

    private String phone;

    private String address;

    private String number;

    private String unitNumber;

    private String plateNumber;

    private String email;

    public Joinus(Integer id, String name, Integer sax, String company, String phone, String address, String number, String unitNumber, String plateNumber, String email) {
        this.id = id;
        this.name = name;
        this.sax = sax;
        this.company = company;
        this.phone = phone;
        this.address = address;
        this.number = number;
        this.unitNumber = unitNumber;
        this.plateNumber = plateNumber;
        this.email = email;
    }

    public Joinus() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public Integer getSax() {
        return sax;
    }

    public void setSax(Integer sax) {
        this.sax = sax;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber == null ? null : unitNumber.trim();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}