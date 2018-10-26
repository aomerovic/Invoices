package com.example.invoice.demo.model;

public class Supplier {

    private Integer ID;
    private String Name;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Supplier(Integer ID, String name) {
        this.ID = ID;
        this.Name = name;
    }

    //Empty constructor
    public Supplier() {
    }



}
