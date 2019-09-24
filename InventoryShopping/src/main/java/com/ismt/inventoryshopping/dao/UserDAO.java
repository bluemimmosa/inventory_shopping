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
public interface UserDAO extends BaseVariable {
    public User verifyUser(String username, String password);
    public boolean createUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned);
    public User editUser(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned);
    public User editUser(int user_id, String param, String value);
    public boolean changePassword(int user_id, String password);
    public boolean revokeUser(int user_id);
    public ArrayList<User> listAllUser();
    public boolean banUser(int user_id);
    public boolean unbanUser(int user_id);
    public boolean isAlready(User u);
}
