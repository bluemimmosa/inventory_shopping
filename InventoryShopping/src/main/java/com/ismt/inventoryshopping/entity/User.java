/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.entity;

import java.sql.Date;

/**
 *
 * @author Primax
 */
public class User {
    int user_id;
    String username;
    String password;
    String name;
    String address;
    Date joined_date;
    boolean active;
    boolean banned;

    public User() {
    }
    
    public User(int user_id, String username, String password, String name, String address, Date joined_date, boolean active, boolean banned) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.joined_date = joined_date;
        this.active = active;
        this.banned = banned;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoined_date() {
        return joined_date;
    }

    public void setJoined_date(Date joined_date) {
        this.joined_date = joined_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
 
}
