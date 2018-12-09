/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import com.spec.model.CatalogItem;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Student1
 */
@Singleton
@Startup // аннотация для синглтона позволяет инициализация по время запуска приложения на сервере приложений
public class ProductCatalogBean {
    
    private List<CatalogItem> items = new ArrayList();
    
    @PostConstruct
    public void init() {
        System.out.println("ProdictCatelogBean.init!");
        addItem(new CatalogItem("id1","name1"));
        addItem(new CatalogItem("id2","name2"));
        addItem(new CatalogItem("id3","name3"));
    }
    
    public void addItem(CatalogItem item) {
        items.add(item);
    }
    
    public List<CatalogItem> getItem() {
        return items;
    }
}
