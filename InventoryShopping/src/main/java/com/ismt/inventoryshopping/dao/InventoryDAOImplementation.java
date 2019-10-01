/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Inventory;
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
    public boolean addItem(Inventory item) {
        String sql = "INSERT INTO `shopping`.`inventory` (`pid`, `product_id`, `batch_id`, `description`, `quantity`, `cost_price`, `selling_price`, `warehouse_id`) "
                + "VALUES ('"+item.getPid()+"', '"+item.getProduct_id()+"', '"+item.getBatch_id()+"', '"+item.getDescription()+"', '"+item.getQuantity()+"', '"+item.getCost_price()+"', '"+item.getSelling_price()+"', '"+item.getWarehouse_id()+"');";
        return dbConn.iud(sql);
    }

    @Override
    public boolean editItem(int pid, String param, String value) {
        String sql;
        if(param.equals("description")){
            sql = "UPDATE `shopping`.`inventory` SET `"+param+"` = '"+value+"' WHERE (`pid` = '"+pid+"');";
        }else if(param.equals("cost_price") || param.equals("selling_price")){
            sql = "UPDATE `shopping`.`inventory` SET `"+param+"` = '"+Double.parseDouble(value)+"' WHERE (`pid` = '"+pid+"');";
        }else{
            sql = "UPDATE `shopping`.`inventory` SET `"+param+"` = '"+Integer.parseInt(value)+"' WHERE (`pid` = '"+pid+"');";            
        }
        return dbConn.iud(sql);
    }

    @Override
    public boolean saleItem(Inventory item) {
        // in case we are getting inventory and then subtracting it from stock.
        // needs logical overhaul according to business logic.
        String sql = "UPDATE `shopping`.`inventory` SET `quantity` = '"+item.getQuantity()+"' WHERE (`pid` = '"+item.getPid()+"');";
        return dbConn.iud(sql);
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
