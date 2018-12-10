/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Stereotype;
import javax.sql.DataSource;

/**
 *
 * @author Student1
 */
@Singleton
@Startup
public class ConfBean {
    
    @Resource(lookup = "siteURL")
    String siteURL;
    
    @Resource(lookup = "jndiCustomTest")
    String test;
    
    @Resource(lookup = "jdbc/TestDS")
    private DataSource dataSource;
    
            
    @PostConstruct
    private void init() {
        System.out.println("siteURL = "+siteURL);
        System.out.println("jndiCustomTest = "+test);
        
        try {
            Connection con = dataSource.getConnection();
            String sql = "select * from public.test1"; // coursetotals where spid=?
            ResultSet rs = con.prepareStatement(sql).executeQuery();
            //statement = connection.prepareStatement(sql);
            //statement.setLong(1, sid);
            //rs = statement.executeQuery();
            //for every row, call read method to extract column 
            //values and place them in a coursesummary instance
            while (rs.next()) {
                System.out.println("" + rs.getRow() + ". " + "id = " + rs.getInt("uid") + ", name = '" + rs.getString("str1"));
            }
//                CourseSummary coursesummary = read("findAll", rs);
//                coursesummaries.add(coursesummary);
//            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ConfBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getURrL() {
        return siteURL;
    }
        
}
