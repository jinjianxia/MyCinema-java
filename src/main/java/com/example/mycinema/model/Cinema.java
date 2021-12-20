package com.example.mycinema.model;

public class Cinema {
    private String name;
    private String address;
    private double minPrice;
    private int[] privilege;

    public Cinema(String name, String address, double minPrice, int[] privilege) {
        this.name = name;
        this.address = address;
        this.minPrice = minPrice;
        this.privilege = privilege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public int[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int[] privilege) {
        this.privilege = privilege;
    }
}
