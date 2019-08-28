package com.company;

public class Shop {
    private String name;
    private String address;
    private double money;
    private Good[] goods;


    public Shop(String name, double money) {
        this.name = name;
        this.money = money;
        this.goods = new Good[5];
    }
    public Good[] getGoods() {
        return goods;
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

    public double getMoney() {
        return money;
    }

    public void setGood(Good good) {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null){
                goods[i] = good;
                break;
            }
        }
    }

    public void setGoodAmount(String name, int amount){
        Good good = null;

        for (int i = 0; i < goods.length; i++) {
            if(goods[i].getName().equalsIgnoreCase(name)){
                goods[i].setAmount(goods[i].getAmount() + amount);
                break;
            }
        }
    }
}
