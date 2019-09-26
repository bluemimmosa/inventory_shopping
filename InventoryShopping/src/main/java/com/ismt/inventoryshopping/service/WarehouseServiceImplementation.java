/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.dao.WarehouseDAO;
import com.ismt.inventoryshopping.entity.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Primax
 */
@Service
public class WarehouseServiceImplementation implements WarehouseService{
    
    @Autowired
    WarehouseDAO warehousedao;
    
    @Override
    public boolean createWarehouse(Warehouse warehouse) {
        return warehousedao.createWarehouse(warehouse.getWarehouse_id(), warehouse.getName(), warehouse.getLocation());
    }

    @Override
    public Warehouse editWarehouse(Warehouse warehouse) {
        if(warehousedao.editWarehouse(warehouse.getWarehouse_id(), warehouse.getName(), warehouse.getLocation())){
            return warehousedao.findWarehouse(warehouse.getWarehouse_id());
        }
        return null;
    }

    @Override
    public boolean deleteWarehouse(Warehouse warehouse) {
        return warehousedao.deleteWarehouse(warehouse);
    }
    
}
