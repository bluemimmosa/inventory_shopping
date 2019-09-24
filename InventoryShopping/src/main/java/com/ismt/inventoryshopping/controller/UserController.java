/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.controller;

import com.ismt.inventoryshopping.entity.User;
import javax.servlet.http.HttpSession;
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
public class UserController {
    ModelAndView mav;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        mav = new ModelAndView("home");
        mav.addObject("usr", new User());
        return mav;
    }
    
    
    
    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(@ModelAttribute User usr, HttpSession session) {
        user = userService.verfiyUser(usr);
        if (user != null) {
            mav = new ModelAndView("dashboard");
            //mav.addObject("name", user.getName());
            //AccountController.user = user.getName();
            mav.addObject("title", "BANKING SYSTEM : DASHBOARD");
            session.setAttribute("uname", user.getName());
        } else {
            mav = new ModelAndView("home");
            mav.addObject("message", "Username or Password is wrong!!");
        }
        return mav;
    }
}
