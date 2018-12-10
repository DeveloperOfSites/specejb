/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Student1
 */
@Singleton
@Startup
public class AppConfBean {
    
    @PostConstruct
    private void init() {
        System.out.println("init");
    }
    @PreDestroy
    private void destr() {
        System.out.println("destroy");
    }
    
    public String getConfig() {
        return "result";
    }
}
