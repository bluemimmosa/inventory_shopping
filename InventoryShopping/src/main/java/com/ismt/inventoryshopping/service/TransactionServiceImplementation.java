/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.dao.TransactionDAO;
import com.ismt.inventoryshopping.entity.Transaction;
import java.sql.Date;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Primax
 */
@Service
public class TransactionServiceImplementation implements TransactionService{
    
    @Autowired
    TransactionDAO transactiondao;
    
    @Override
    public boolean createTransaction(Transaction transaction) {
        return transactiondao.createTransaction(transaction.getTransaction_id(), transaction., 0, 0, 0, 0, arg6, 0, 0, 0, true)
    }

    @Override
    public ArrayList<Transaction> saleReport(Date fromDate, Date toDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Transaction> todaySaleReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Transaction> generateBill(Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
