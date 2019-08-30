package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DbHelper dbHelper = new DbHelper();

//        Good good = new Good("Молоко", 45);
//        dbHelper.addGood(good);

//        Buyer buyer = new Buyer("Тынчтык",33,5000.5,"ул.Мира","0550221133");
//        dbHelper.addBuyer(buyer);

//        dbHelper.changeGoodAmount(-5,3);
//
//        List<Good> list = dbHelper.getGoods();
//        for (Good good:list) {
//            System.out.println("Наименование - "+good.getName()+", Цена - "+good.getPrice());
//        }

        List<Buyer> list1 = dbHelper.getBuyer();
        for (Buyer buyer:list1) {
            System.out.println("Имя - " + buyer.getName() + ", Адрес - " + buyer.getAddress() + ", Телефон - " + buyer.getPhone());
        }

    }
}