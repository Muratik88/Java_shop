package com.company;

public class Seller extends Person{
    private String login;
    private String password;
    private Shop shop;

    public Seller(String name, int age, String login, Shop shop) {
        super(name,age);
        setName(name);
        setAge(age);
        this.login = login;
        this.shop = shop;
        password = String.valueOf(Math.random() * 8999 + 1000);
    }

     public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Shop getShop() {
        return shop;
    }

    public void createGood(String name, int price){
        Good good = new Good(name, price);
        shop.setGood(good);
    }

    public void printAllGood(){
        Good[] goods = shop.getGoods();

        for (Good item:goods) {
            if (item != null)
                System.out.println("ID - " + item.getId() + "Название - " + item.getName() + ", Цена - " + item.getPrice()+ ", Кол-во - " + item.getAmount());
        }
    }

    public void addGood(String goodName, int amount) {
        shop.setGoodAmount(goodName,amount);
    }
}
