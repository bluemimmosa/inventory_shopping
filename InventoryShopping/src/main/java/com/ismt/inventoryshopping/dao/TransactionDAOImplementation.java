/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Transaction;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Primax
 */
@Repository
public class TransactionDAOImplementation implements TransactionDAO{

    @Override
    public boolean createTransaction(int transaction_id, int pid, int quantity, double total, double discount, double tax, Date date, int customer_id, int user_id, int payment_method, boolean revoked) {
        String sql = "INSERT INTO `shopping`.`transaction` (`transaction_id`, `pid`, `quantity`, `total`, `discount`, `tax`, `date`, `customer_id`, `user_id`, `payment_method`, `revoked`) "
                + "VALUES ('"+transaction_id+"', '"+pid+"', '"+quantity+"', '"+total+"', '"+discount+"', '"+tax+"', '"+date+"', '"+customer_id+"', '"+user_id+"', '"+payment_method+"', '"+revoked+"');";
        return dbConn.iud(sql);
    }

    @Override
    public ArrayList<Transaction> saleReport(Date fromDate, Date toDate) {
        String sql ="SELECT * FROM shopping.transaction WHERE date>='"+fromDate+"'AND date<='"+toDate+"';";
        ResultSet rs = dbConn.select(sql);
        ArrayList<Transaction> data = new ArrayList<>();
        try {
            while (rs.next()) {
                Transaction tmp = new Transaction(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), rs.getInt(8),rs.getInt(9),rs.getInt(10), (rs.getInt(11)==1) ? Boolean.TRUE : Boolean.FALSE);
                data.add(tmp);
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return data;
    }

    @Override
    public ArrayList<Transaction> generateBill(Transaction transaction) {
        String sql ="SELECT * FROM shopping.transaction WHERE transaction_id = '"+transaction.getTransaction_id()+"';";
        ResultSet rs = dbConn.select(sql);
        ArrayList<Transaction> data = new ArrayList<>();
        try {
            while (rs.next()) {
                Transaction tmp = new Transaction(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), rs.getInt(8),rs.getInt(9),rs.getInt(10), (rs.getInt(11)==1) ? Boolean.TRUE : Boolean.FALSE);
                data.add(tmp);
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return data;
    }
    
}
