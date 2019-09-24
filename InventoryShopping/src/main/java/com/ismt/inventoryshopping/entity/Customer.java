/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.entity;

/**
 *
 * @author Primax
 */
public class Customer {
    int customer_id;
    String name;
    String address;
    long tpin_number;
    long contact_no;

    public Customer() {
    }

    public Customer(int customer_id, String name, String address, long tpin_number, long contact_no) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
        this.tpin_number = tpin_number;
        this.contact_no = contact_no;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public long getTpin_number() {
        return tpin_number;
    }

    public void setTpin_number(long tpin_number) {
        this.tpin_number = tpin_number;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }
    
    
}
