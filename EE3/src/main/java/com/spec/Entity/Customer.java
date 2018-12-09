/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.Entity;

import java.io.Serializable;
import javax.faces.annotation.FacesConfig;
import javax.faces.view.ViewScoped;
import javax.persistence.Entity;

/**
 *
 * @author Student1
 */
//@ViewScoped
//@FacesConfig(version = FacesConfig.Version.JSF_2_3)
//@Entity
public class Customer implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String firstName;
    private String lastName;
    
    public Customer() {
    }
    public Customer(String s1,String s2) {
        this.firstName = s1;
        this.lastName = s2;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String s) {
        this.firstName = s;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String s) {
        this.lastName = s;
    }
}
