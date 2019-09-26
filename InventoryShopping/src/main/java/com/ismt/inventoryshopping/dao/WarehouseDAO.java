/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.Warehouse;

/**
 *
 * @author Primax
 */
public interface WarehouseDAO extends BaseVariable{
    public boolean createWarehouse(int warehouse_id, String name, String location);
    public boolean editWarehouse(int warehouse_id, String name, String location);
    public boolean deleteWarehouse(Warehouse warehouse);
    public Warehouse findWarehouse(int warehouse_id);
}
