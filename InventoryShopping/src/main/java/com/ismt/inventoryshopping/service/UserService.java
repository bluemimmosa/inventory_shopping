/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.User;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public interface UserService {
    public User verifyUser(User u);
    public boolean createUser(User u);
    public User editUser(User u);
    public boolean changePassword(User u);
    public boolean revokeUser(User u);
    public ArrayList<User> listAllUser();
    public boolean banUser(User u);
    public boolean unbanUser(User u);
}
