/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public class UserDAOImplementation implements UserDAO{

    @Override
    public User verifyUser(String username, String password) {
        String sql = "SELECT * FROM shopping.user WHERE username = '"+username+"' AND password = '"+password+"';";
        ResultSet rs = dbConn.select(sql);
        try {
            while (rs.next()) {
                User tmp = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Date.valueOf(rs.getString(6)), (rs.getInt(7)==0) ? Boolean.FALSE : Boolean.TRUE, (rs.getInt(8)==0) ? Boolean.FALSE : Boolean.TRUE);
                if(tmp.getUsername().equals(username) && tmp.getPassword().equals(password)){
                    return tmp;
                }
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return null;
    }

    @Override
    public boolean createUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned) {
        String sql = "INSERT INTO `shopping`.`user` (`user_id`, "
                + "`username`, `password`, `name`, `address`, "
                + "`joined_date`, `active`, `banned`) VALUES "
                + "('"+user_id+"', '"+username+"', '"+password+"', "
                + "'"+name+"', '"+address+"', '"+joined_date+"', "
                + "'"+active+"', '"+banned+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned) {
        String sql = "UPDATE `shopping`.`user` SET `username` = '"+username+"', `password` = '"+password+"', `name` = '"+name+"', `address` = '"+address+"', `joined_date` = '"+joined_date+"', `active` = '"+active+"', `banned` = '"+banned+"' WHERE (`user_id` = '"+user_id+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editUser(int user_id, String param, String value) {
        String sql;
        if(param.equals("active")||param.equals("banned")){
            sql = "UPDATE `shopping`.`user` SET `"+param+"` = '"+Integer.parseInt(value)+"' WHERE (`user_id` = '"+user_id+"');";
        }else{
            sql = "UPDATE `shopping`.`user` SET `"+param+"` = '"+value+"' WHERE (`user_id` = '"+user_id+"');";
        }
        return dbConn.iud(sql);

    }


    @Override
    public ArrayList<User> listAllUser() {
        String sql ="SELECT * FROM shopping.user;";
        ResultSet rs = dbConn.select(sql);
        ArrayList<User> data = new ArrayList<>();
        try {
            while (rs.next()) {
                User tmp = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Date.valueOf(rs.getString(6)), (rs.getInt(7)==0) ? Boolean.FALSE : Boolean.TRUE, (rs.getInt(8)==0) ? Boolean.FALSE : Boolean.TRUE);
                data.add(tmp);
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return data;
    }

    @Override
    public boolean isAlready(User u) {
        String sql = "SELECT * FROM shopping.user WHERE username = '"+u.getUsername()+"';";
        ResultSet rs = dbConn.select(sql);
        try {
            while (rs.next()) {
                User tmp = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Date.valueOf(rs.getString(6)), (rs.getInt(7)==0) ? Boolean.FALSE : Boolean.TRUE, (rs.getInt(8)==0) ? Boolean.FALSE : Boolean.TRUE);
                if(tmp.getUsername().equals(u.getUsername())){
                    return true;
                }
            }
        } catch (SQLException sQLException) {
           return false;
        }
        return false;
        
    }
    
}
