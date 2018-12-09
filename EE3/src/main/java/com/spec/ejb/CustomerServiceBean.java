/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import com.spec.Entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Student1
 */
@Stateless
public class CustomerServiceBean {
    
    public List<Customer> getCustomer() {
        List<Customer> lc = new ArrayList<>();
        lc.add(new Customer("Customer1","1"));
        lc.add(new Customer("Customer2","2"));
        lc.add(new Customer("Customer3","3"));
        return lc;
    }
}
