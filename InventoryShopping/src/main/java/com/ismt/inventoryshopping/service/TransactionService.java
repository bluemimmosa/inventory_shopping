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
public interface TransactionService {
    public boolean createTransaction(Transaction transaction);
    public ArrayList<Transaction> saleReport(Date fromDate, Date toDate);
    public ArrayList<Transaction> todaySaleReport();
    public ArrayList<Transaction> generateBill(Transaction transaction);
}
