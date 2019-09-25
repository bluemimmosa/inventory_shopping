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
import org.springframework.stereotype.Service;

/**
 *
 * @author Primax
 */
@Service
public class UserServiceImplementation implements UserService {
    // This to be autowired later.
    UserDAO userdao;
    
    @Override
    public User verifyUser(User u) {
        return userdao.verifyUser(u.getUsername(), u.getPassword());
    }

    @Override
    public boolean createUser(User u) {
        if(userdao.isAlready(u)){
            return false;
        }
        return userdao.createUser(u.getUser_id(), u.getUsername(), u.getPassword(), u.getName(), u.getAddress(), u.getJoined_date(), u.isActive(), u.isBanned());
    }

    @Override
    public User editUser(User u) {
        if(userdao.editUser(u.getUser_id(), u.getUsername(), u.getPassword(), u.getName(), u.getAddress(), u.getJoined_date(), u.isActive(), u.isBanned())){
            return userdao.verifyUser(u.getUsername(), u.getPassword());
        }
        return null;
    }

    @Override
    public boolean changePassword(User u, String password) {
        return userdao.editUser(u.getUser_id(), "password", password);
    }

    @Override
    public boolean revokeUser(User u) {
        return userdao.editUser(u.getUser_id(), "active", "0");
    }

    @Override
    public ArrayList<User> listAllUser() {
        return userdao.listAllUser();
    }

    @Override
    public boolean banUser(User u) {
        return userdao.editUser(u.getUser_id(), "banned", "1");
    }

    @Override
    public boolean unbanUser(User u) {
    return userdao.editUser(u.getUser_id(), "banned", "0");
    }
    
}
