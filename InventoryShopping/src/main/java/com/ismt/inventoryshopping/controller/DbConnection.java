/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.inventoryshopping.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Primax
 */
public class DbConnection {
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private String classname = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/shopping";
    private String dbUser = "root";
    private String dbPass = "toor";
    
    
    public DbConnection(){
        try{
            Class.forName(classname);
            conn = DriverManager.getConnection(url, dbUser, dbPass);
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            System.out.println("Please include driver file");
        } catch (SQLException ex) {
            System.out.println("Cannot connect");
            //ex.printStackTrace();
        }
    }

    
    public ResultSet select(String sql){
        try {
            st = conn.createStatement();
            return st.executeQuery(sql);         
        } catch (SQLException ex) {
            //ex.printStackTrace();
            return null;
        }
    }
    
    public boolean iud(String sql){
          try {
            st = conn.createStatement();
            int r = st.executeUpdate(sql);
            return r>0;
        } catch (SQLException ex) {
            //ex.printStackTrace();
            return false;
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void closeConnection(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
