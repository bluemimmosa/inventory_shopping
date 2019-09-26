/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.controller;

import com.ismt.inventoryshopping.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Primax
 */
public class WarehouseController {
    ModelAndView mav;
    
    @Autowired
    WarehouseService warehouseservice;
    
    //todo
}
