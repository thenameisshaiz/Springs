package com.jspiders.springs.demo;

public class Employee {
    private int id;
    private String name;
    private double sal;
    private ContactInfo contact;
    private Address address = new Address();
    private int aadhaar;

//    Injecting Dependency in Constructor
    public Employee(ContactInfo contact){
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
