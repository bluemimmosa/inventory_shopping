/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Customer;
import com.ismt.inventoryshopping.entity.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Primax
 */
@Repository
public class CustomerDAOImplementation implements CustomerDAO{

    @Override
    public boolean CreateCustomer(int customer_id, String name, String address, long tpin_number, long contact_no) {
        String sql = "INSERT INTO `shopping`.`customer` (`customer_id`, `name`, `address`, `tpin_number`, `contact_no`) VALUES ('"+customer_id+"', '"+name+"', '"+address+"', '"+tpin_number+"', '"+contact_no+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editCustomer(int customer_id, String name, String address, long tpin_number, long contact_no) {
        String sql = "UPDATE `shopping`.`customer` SET `name` = '"+name+"', `address` = '"+address+"', `tpin_number` = '"+tpin_number+"', `contact_no` = '"+contact_no+"' WHERE (`customer_id` = '"+customer_id+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editCustomer(int customer_id, String param, String value) {
        if(param.equals("customer_id")){
            return false;
        }
        String sql = "UPDATE customer SET "+param+" = '"+value+"';";
        return dbConn.iud(sql);
    }

    @Override
    public ArrayList<Customer> listAllCustomer(String wildcard) {
        String sql ="SELECT * FROM shopping.customer WHERE name LIKE '"+wildcard+"';";
        ResultSet rs = dbConn.select(sql);
        ArrayList<Customer> data = new ArrayList<>();
        try {
            while (rs.next()) {
                Customer tmp = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5));
                data.add(tmp);
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return data;
    }

    @Override
    public Customer getCustomer(long tpin_number) {
        String sql = "SELECT * FROM shopping.customer WHERE tpin_number = '"+tpin_number+"';";
        ResultSet rs = dbConn.select(sql);
        try {
            while (rs.next()) {
                Customer tmp = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5));
                return tmp;
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return null;
    }
    
}
