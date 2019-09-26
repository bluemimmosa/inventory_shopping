/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.Customer;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public interface CustomerService {
    public boolean createCustomer(Customer c);
    public Customer editCustomer(Customer c);
    public ArrayList<Customer> listAllCustomer();
    public ArrayList<Customer> searchCustomer(String wildcard);
}
