/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.service;

import com.ismt.inventoryshopping.entity.Revoke;
import java.util.ArrayList;

/**
 *
 * @author Primax
 */
public interface RevokeService {
    boolean revokeItem(Revoke revoke);
    ArrayList<Revoke> listAll();
}
