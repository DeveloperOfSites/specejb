/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.ejb;

import com.spec.entity.UserAccount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author Student1
 */
@Stateless
public class AccountServiceBean {
    
    @Resource(lookup = "jdbc/TestDS")
    private DataSource ds;
    
    public void init() {
        System.out.println("init");
    }
    public List<UserAccount> getAll() {
        List<UserAccount> list = new ArrayList<>();
        try(Connection c = ds.getConnection(); PreparedStatement ps = c.prepareStatement("select * from public.account");) {
            //ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();
            UserAccount ua;
            while(rs.next()) {
                ua = new UserAccount();
                //String name = rs.getString(1);
                ua.setUser_id(rs.getInt("user_id"));
                ua.setUsername(rs.getString("username"));
                ua.setPassword(rs.getString("password"));
                ua.setEmail(rs.getString("email"));
                list.add(ua);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public void createUserAccount(UserAccount user) {
        String insertQ = "insert into account (username, \"password\", email, created_on) values(?, ?, ?, current_timestamp) from public.account";
        try(Connection c = ds.getConnection();PreparedStatement ps = c.prepareStatement(insertQ);) {
            ps.setString(1, user.getUsername());
            //...//
            ps.executeUpdate();
        }   
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
