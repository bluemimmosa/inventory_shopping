/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.controller;

import com.ismt.inventoryshopping.entity.Inventory;
import com.ismt.inventoryshopping.entity.User;
import com.ismt.inventoryshopping.service.InventoryService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Primax
 */
@Controller
public class InventoryController {
    ModelAndView mav;
    
    @Autowired
    InventoryService inventoryservice;
    
    @RequestMapping(value = "/additem", method = RequestMethod.GET)
    public ModelAndView showAddItem() {
        mav = new ModelAndView("additem");
        mav.addObject("inventory", new Inventory());
        return mav;
    }
    
    @RequestMapping(value = "/processadditem", method = RequestMethod.POST)
    public ModelAndView processAddItem(@ModelAttribute Inventory invent, HttpSession session ) {
        
        //TODO
        return mav;
    }
    
    @RequestMapping(value = "/transferitem", method = RequestMethod.GET)
    public ModelAndView showTransferItem(){
        mav = new ModelAndView("transferitem");
        mav.addObject("inventory", new Inventory()); // in this form only ask user to input pid and warehouse no.
        return mav;
    }
    
    @RequestMapping(value = "/processtransferitem", method = RequestMethod.POST)
    public ModelAndView processTransferItem(@ModelAttribute Inventory invent, HttpSession session){
        //TODO
        return mav;
    }
}
