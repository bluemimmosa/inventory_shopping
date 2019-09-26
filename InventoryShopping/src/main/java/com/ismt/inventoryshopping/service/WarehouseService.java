/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.Warehouse;

/**
 *
 * @author Primax
 */
public interface WarehouseService {
    public boolean createWarehouse(Warehouse warehouse);
    public Warehouse editWarehouse(Warehouse warehouse);
    public boolean deleteWarehouse(Warehouse warehouse);
    
}
