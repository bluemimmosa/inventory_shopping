/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.Transaction;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public class TransactionServiceImplementation implements TransactionService{

    @Override
    public boolean createTransaction(Transaction arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Transaction> saleReport(Date arg0, Date arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Transaction> todaySaleReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Transaction> generateBill(Transaction arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
