package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DbHelper {

    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\DB\\dbgood.db");
        return connection;
    }

    public void addGood(Good good){
        try {
            Connection connection = getConnection();
            String sql = "INSERT INTO goods(good_name, price, amount) VALUES(?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, good.getName());
            preparedStatement.setInt(2, good.getPrice());
            preparedStatement.setInt(3,good.getAmount());

            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBuyer(Buyer buyer ){
        try {
            Connection conn = getConnection();
            String sql = "INSERT INTO buyers(name,age,money,address,phone) VALUES(?, ?, ?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, buyer.getName());
            preparedStatement.setInt(2, buyer.getAge());
            preparedStatement.setDouble(3,buyer.getMoney());
            preparedStatement.setString(4, buyer.getAddress());
            preparedStatement.setString(5, buyer.getPhone());

            preparedStatement.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void changeGoodAmount(int sellamount, int goodId){
        try {
            Connection connection = getConnection();
            String sql = "UPDATE goods set amount = amount - ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, sellamount);
            ps.setInt(2, goodId);
            ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Good> getGoods(){
        List<Good> list = new ArrayList<>();

        try {
            Connection conn = getConnection();
            String sql = "select id, good_name, price, amount from goods";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String good_name = resultSet.getString("good_name");
                int price = resultSet.getInt("price");
                int amount = resultSet.getInt("amount");

                Good good = new Good(id, good_name, price, amount);
                list.add(good);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Buyer> getBuyer(){
        List<Buyer> list = new ArrayList<>();


        try {
            Connection conn = getConnection();
            String sql = "select name, age, money, phone, address from buyers";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){

                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double money = resultSet.getDouble("money");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");

                Buyer buyer = new Buyer(name, age, money, address, phone);
                list.add(buyer);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
