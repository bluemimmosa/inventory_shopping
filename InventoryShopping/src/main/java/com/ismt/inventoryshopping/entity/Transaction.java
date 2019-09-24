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
public class Transaction {
    int transaction_id;
    int pid;
    int quantity;
    double total;
    double discount;
    double tax;
    Date date;
    int customer_id;
    int user_id;
    int payment_method;
    boolean revoked;

    public Transaction() {
    }

    public Transaction(int transaction_id, int pid, int quantity, double total, double discount, double tax, Date date, int customer_id, int user_id, int payment_method, boolean revoked) {
        this.transaction_id = transaction_id;
        this.pid = pid;
        this.quantity = quantity;
        this.total = total;
        this.discount = discount;
        this.tax = tax;
        this.date = date;
        this.customer_id = customer_id;
        this.user_id = user_id;
        this.payment_method = payment_method;
        this.revoked = revoked;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }

    public boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(boolean revoked) {
        this.revoked = revoked;
    }
    
}
