/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author Student1
 */
@Stateless // без сохранения состояния
public class TestServiceBean {
    
    public TestServiceBean() {/*не рекомендуется для инициализации компонентов*/}
    
    /**
     * Лучшая практика
     * действия по инициализации
     */
    @PostConstruct // эта анатация только одиного метода
    public void init() {
        System.out.println("TestServiceBean.init");
    }
    
    @PreDestroy
    private void destroy() {
        System.out.println("TestServiceBean.destroy");
    }
    
    public void hello() {
        System.out.println("hello ejb!!!");
    }
}
