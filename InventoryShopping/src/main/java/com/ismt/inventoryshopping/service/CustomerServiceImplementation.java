/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.dao.CustomerDAO;
import com.ismt.inventoryshopping.entity.Customer;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Primax
 */
@Service
public class CustomerServiceImplementation implements CustomerService{

    @Autowired
    CustomerDAO customerdao;
    
    @Override
    public boolean createCustomer(Customer c) {
        //check if customer already exist first.
        //These kind of checking is alwasy done on service layer.
        // Never do such checking in DAO layer as DAO layer should be
        // very clean and only with database queries.
        if(customerdao.getCustomer(c.getTpin_number()) != null){
            return false;
        }
        return customerdao.CreateCustomer(c.getCustomer_id(), c.getName(), c.getAddress(), c.getContact_no(), c.getTpin_number());
    }

    @Override
    public Customer editCustomer(Customer c) {
        if(customerdao.editCustomer(c.getCustomer_id(), c.getName(), c.getAddress(), c.getContact_no(), c.getTpin_number())){
            return customerdao.getCustomer(c.getTpin_number());
        }
        return null;
    }

    @Override
    public ArrayList<Customer> listAllCustomer() {
        return customerdao.listAllCustomer("");
    }

    @Override
    public ArrayList<Customer> searchCustomer(String wildcard) {
        return customerdao.listAllCustomer(wildcard);
    }
    
}
