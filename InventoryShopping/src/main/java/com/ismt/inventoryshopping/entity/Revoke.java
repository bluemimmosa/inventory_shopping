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
public class Revoke {
    int revoke_id;
    int pid;
    int quantity;
    Date expiry_date;
    String remarks;

    public Revoke() {
    }

    public Revoke(int revoke_id, int pid, int quantity, Date expiry_date, String remarks) {
        this.revoke_id = revoke_id;
        this.pid = pid;
        this.quantity = quantity;
        this.expiry_date = expiry_date;
        this.remarks = remarks;
    }

    public int getRevoke_id() {
        return revoke_id;
    }

    public void setRevoke_id(int revoke_id) {
        this.revoke_id = revoke_id;
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

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
}
