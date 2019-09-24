/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.User;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public class UserDAOImplementation implements UserDAO{

    @Override
    public User verifyUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned) {
        String sql = "INSERT INTO `shopping`.`user` (`user_id`, "
                + "`username`, `password`, `name`, `address`, "
                + "`joined_date`, `active`, `banned`) VALUES "
                + "('"+user_id+"', '"+username+"', '"+password+"', "
                + "'"+name+"', '"+address+"', '"+joined_date+"', "
                + "'"+active+"', '"+banned+"');";
        if(dbConn.iud(sql)){
            return true;
        }
        return false;
    }

    @Override
    public User editUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User editUser(int user_id, String param, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean changePassword(int user_id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean revokeUser(int user_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> listAllUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean banUser(int user_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean unbanUser(int user_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAlready(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
