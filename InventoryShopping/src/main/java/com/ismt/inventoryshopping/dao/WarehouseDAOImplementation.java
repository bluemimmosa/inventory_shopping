/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Customer;
import com.ismt.inventoryshopping.entity.Warehouse;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Primax
 */
@Repository
public class WarehouseDAOImplementation implements WarehouseDAO{

    @Override
    public boolean createWarehouse(int warehouse_id, String name, String location) {
        String sql = "INSERT INTO `shopping`.`warehouse` (`warehouse_id`, `name`, `location`) VALUES ('"+warehouse_id+"', '"+name+"', '"+location+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editWarehouse(int warehouse_id, String name, String location) {
        String sql = "UPDATE `shopping`.`warehouse` SET `name` = '"+name+"', `location` = '"+location+"' WHERE (`warehouse_id` = '"+warehouse_id+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean deleteWarehouse(Warehouse warehouse) {
        String sql = "DELETE FROM `shopping`.`warehouse` WHERE (`warehouse_id` = '"+warehouse.getWarehouse_id()+"');";
        return dbConn.iud(sql);
    }

    @Override
    public Warehouse findWarehouse(int warehouse_id) {
    String sql = "SELECT * FROM shopping.warehouse WHERE warehouse_id = '"+warehouse_id+"';";
        ResultSet rs = dbConn.select(sql);
        try {
            while (rs.next()) {
                Warehouse tmp = new Warehouse(rs.getInt(1), rs.getString(2), rs.getString(3));
                return tmp;
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return null;    
    }
    
    
}
