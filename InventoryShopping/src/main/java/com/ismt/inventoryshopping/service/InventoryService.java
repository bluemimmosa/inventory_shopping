/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.Inventory;

/**
 *
 * @author Primax
 */
public interface InventoryService {
    public boolean addItem(Inventory item);
    public boolean transferItem(Inventory item, int warehouse);
    public boolean revokeItem(Inventory item);
    public boolean saleItem(Inventory item, int quantity);
    public boolean updatePrice(Inventory item, double sellingprice);
    public Inventory findItem(String pid);
}
