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
public class Warehouse {
    int warehouse_id;
    String name;
    String location;

    public Warehouse() {
    }

    public Warehouse(int warehouse_id, String name, String location) {
        this.warehouse_id = warehouse_id;
        this.name = name;
        this.location = location;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
