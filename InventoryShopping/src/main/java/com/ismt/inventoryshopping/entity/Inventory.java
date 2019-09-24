/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.entity;

/**
 *
 * @author Primax
 */
public class Inventory {
    int pid;
    int product_id;
    int batch_id;
    String description;
    int quantity;
    double cost_price;
    double selling_price;
    int warehouse_id;

    public Inventory() {
    }

    public Inventory(int pid, int product_id, int batch_id, String description, int quantity, double cost_price, double selling_price, int warehouse_id) {
        this.pid = pid;
        this.product_id = product_id;
        this.batch_id = batch_id;
        this.description = description;
        this.quantity = quantity;
        this.cost_price = cost_price;
        this.selling_price = selling_price;
        this.warehouse_id = warehouse_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost_price() {
        return cost_price;
    }

    public void setCost_price(double cost_price) {
        this.cost_price = cost_price;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
    
    

}
