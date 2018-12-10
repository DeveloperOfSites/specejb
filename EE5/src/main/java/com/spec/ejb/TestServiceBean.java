/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author Student1
 */
@Stateless
public class TestServiceBean {

    @Resource(lookup = "jdbc/TestDS")
    private DataSource ds;
    
    public void testDB() {
        try (Connection c = ds.getConnection()) {
            String pName = c.getMetaData().getDatabaseProductName();
            String pVersion = c.getMetaData().getDatabaseProductVersion();
            System.out.println("pName "+pName+" pVersion "+pVersion);
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Logger.getLogger(TestServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getName(long id) {
        try(Connection c = ds.getConnection(); PreparedStatement ps = c.prepareStatement("select username from account where user_id=?")) {
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                String name = rs.getString(1);
                return name;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    
//            ResultSet rs = con.prepareStatement(sql).executeQuery();
//            while (rs.next()) {
//                System.out.println("" + rs.getRow() + ". " + "id = " + rs.getInt("uid") + ", name = '" + rs.getString("str1"));
//            }
//            con.close();
    
}
