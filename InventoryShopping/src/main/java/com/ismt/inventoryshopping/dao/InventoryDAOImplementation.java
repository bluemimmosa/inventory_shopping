/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import com.ismt.inventoryshopping.entity.Inventory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Primax
 */
@Repository
public class InventoryDAOImplementation implements InventoryDAO {

    @Override
    public boolean addItem(Inventory arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editItem(int arg0, String arg1, String arg2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saleItem(Inventory arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
