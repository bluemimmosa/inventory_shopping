/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.dao;

import static com.ismt.inventoryshopping.dao.BaseVariable.dbConn;
import com.ismt.inventoryshopping.entity.Revoke;
import com.ismt.inventoryshopping.entity.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Primax
 */
@Repository
public class RevokeDAOImplementation implements RevokeDAO{

    @Override
    public boolean revokeItem(Revoke revoke) {
        String sql = "INSERT INTO `shopping`.`revoke` (`pid`, `revoke_id`, `quantity`, `expiry_date`, `remarks`) VALUES ('"+revoke.getPid()+"', '"+revoke.getRevoke_id()+"', '"+revoke.getQuantity()+"', '"+revoke.getExpiry_date()+"', '"+revoke.getRemarks()+"');";
        return dbConn.iud(sql);
    }

    @Override
    public ArrayList<Revoke> listAll() {
        String sql ="SELECT * FROM shopping.revoke;";
        ResultSet rs = dbConn.select(sql);
        ArrayList<Revoke> data = new ArrayList<>();
        try {
            while (rs.next()) {
                Revoke tmp = new Revoke(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4), rs.getString(5));
                data.add(tmp);
            }
        } catch (SQLException sQLException) {
           return null;
        }
        return data;
    }
    
}
