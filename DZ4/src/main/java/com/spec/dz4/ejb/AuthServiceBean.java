/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.dz4.ejb;

import com.spec.dz4.entity.UserAccount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author UserAdmin
 */
@Stateless
public class AuthServiceBean {
    
    @Resource(lookup = "jdbc/TestDS")
    private DataSource ds;

    public boolean authUser(String userName, String password){
        try(Connection c = ds.getConnection(); PreparedStatement ps = c.prepareStatement("SELECT * FROM public.account WHERE username=?");) {
            ps.setString(1,userName);
            ResultSet rs = ps.executeQuery();
            UserAccount ua;
            if(rs.next()) {
                ua = new UserAccount();
                //String name = rs.getString(1);
                ua.setUser_id(rs.getInt("user_id"));
                ua.setUsername(rs.getString("username"));
                ua.setPassword(rs.getString("password"));
                ua.setEmail(rs.getString("email"));
                
                if(ua.getPassword().equals(password)) 
                    return true;
                else
                    return false;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
}
