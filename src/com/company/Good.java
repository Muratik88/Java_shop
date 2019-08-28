package com.company;

public class Good {
    private String name;
    private int price;
    private int amount;
    private int id;
    DBFField[] fields = new DBFField[3];DBFField[] fields = new DBFField[3];
    public Good(int id, String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.id = id;
    }

    public Good(String name, int price) {
        this.name = name;
        this.price = price;
        amount = 0;
        id = (int) Math.random() * 8999 + 1000;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
}
