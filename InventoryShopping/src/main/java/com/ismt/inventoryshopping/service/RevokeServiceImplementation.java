/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.dao.RevokeDAO;
import com.ismt.inventoryshopping.entity.Revoke;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Primax
 */
@Service
public class RevokeServiceImplementation implements RevokeService{
    
    @Autowired
    RevokeDAO revokedao;
    
    @Override
    public boolean revokeItem(Revoke revoke) {
        return revokedao.revokeItem(revoke);
    }

    @Override
    public ArrayList<Revoke> listAll() {
        return revokedao.listAll();
    }
    
}
