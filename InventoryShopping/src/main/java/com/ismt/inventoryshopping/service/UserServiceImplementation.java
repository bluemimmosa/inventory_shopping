/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.dao.UserDAO;
import com.ismt.inventoryshopping.dao.UserDAOImplementation;
import com.ismt.inventoryshopping.entity.User;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public class UserServiceImplementation implements UserService {
    // This to be autowired later.
    UserDAO userdao = new UserDAOImplementation();
    
    @Override
    public User verifyUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createUser(User u) {
        if(userdao.isAlready(u)){
            return false;
        }
        if(userdao.createUser(u.getUser_id(), u.getUsername(), u.getPassword(), u.getName(), u.getAddress(), u.getJoined_date(), u.isActive(), u.isBanned())){
            return true;
        }
        return false;
    }

    @Override
    public User editUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean changePassword(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean revokeUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> listAllUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean banUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean unbanUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
