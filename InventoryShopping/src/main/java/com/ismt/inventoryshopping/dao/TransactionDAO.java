/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.Transaction;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public interface TransactionDAO extends BaseVariable{
    public boolean createTransaction(int transaction_id, int pid, int quantity, double total, double discount, double tax, Date date, int customer_id, int user_id, int payment_method, boolean revoked);
    public ArrayList<Transaction> saleReport(Date fromDate, Date toDate);
    public ArrayList<Transaction> todaySaleReport();
    public ArrayList<Transaction> generateBill(Transaction transaction);
}
