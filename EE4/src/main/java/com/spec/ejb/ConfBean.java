/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

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
    }
    
    public String getURrL() {
        return siteURL;
    }
        
}
