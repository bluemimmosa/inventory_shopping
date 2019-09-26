/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.Customer;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public interface CustomerDAO extends BaseVariable{
    public boolean CreateCustomer(int customer_id, String name, String address, long tpin_number, long contact_no);
    public boolean editCustomer(int customer_id, String name, String address, long tpin_number, long contact_no);
    public boolean editCustomer(int customer_id, String param, String value);
    public ArrayList<Customer> listAllCustomer(String wildcard); // if wildcard is "space" then list all customer
    public Customer getCustomer(long tpin_number);
    
}
