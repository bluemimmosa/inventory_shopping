/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Inventory;
import com.ismt.inventoryshopping.entity.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public Inventory findItem(int pid) {
       String sql = "SELECT * FROM shopping.inventory WHERE pid = '"+pid+"';";
        ResultSet rs = dbConn.select(sql);
        try {
            while (rs.next()) {
                Inventory tmp = new Inventory(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
                return tmp;
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return null; 
    }
    
}
