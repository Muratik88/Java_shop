package com.company;

public class Buyer extends Person {
    private double money;
    private String address;
    private String phone;

    public Buyer(String name, int age, double money, String address, String phone){
        super(name, age);
        this.money = money;
        this.address = address;
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
