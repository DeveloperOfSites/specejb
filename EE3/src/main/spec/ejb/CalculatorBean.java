/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import javax.ejb.Stateless;
import javax.faces.annotation.FacesConfig;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Student1
 */
@Stateless // Stateless - значит получают всю информацию для работы из параметров метода
public class CalculatorBean {
    
    public double calculate(double a,double b, String operation) {
        Double rez=0.0;
        switch(operation){
            case "+":   rez = a + b;
                        break;
            case "-":   rez = a-b;
                        break;
            case "*":   rez = a*b;
                        break;
            case "/":   rez = a/b;
                        break;
        }
        System.out.println("== "+rez);
        return rez;
    }    
    
    private void init() {
        System.out.println("CalculatorBean.init");
    }
}

/**
 * Singleton 
 * в качестве некоторого общего кэша
 * проблемы конкурентного доступа при модификации
 */