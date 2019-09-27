/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.Inventory;

/**
 *
 * @author Primax
 */
public interface InventoryDAO extends BaseVariable{
    public boolean addItem(Inventory item);
    public boolean editItem(int pid, String param, String value);
    public boolean saleItem(Inventory item);
    public Inventory findItem(int pid);
}   
