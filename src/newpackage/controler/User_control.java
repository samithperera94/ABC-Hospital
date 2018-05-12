/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import newpackage.Databaseconnector;
import newpackage.classes.User;

/**
 *
 * @author samith
 */
public class User_control {
    public static User search(String  id){
        User user = new User();
        try {
            
            String sql = "SELECT * FROM user WHERE UID = '"+id+"'";
            Connection con = Databaseconnector.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                user.setName(rs.getString("name"));
               
                user.setPosition(rs.getString("position"));
                user.setUID(rs.getString("UID"));
                user.setEID(rs.getInt("EID"));
                
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
    return user;
    }
    
    public static User save(User a){
        User add = new User();
        try{
            
            String q2="INSERT INTO user (UID,EID,name,position,password) VALUES('"+a.getUID()+"','"+a.getEID()+"','"+a.getName()+"','"+a.getPosition()+"','"+a.getPassword()+"')";
            Connection con = Databaseconnector.getcon();
            PreparedStatement ps = con.prepareStatement(q2);
            
           
            
            ps.executeUpdate(q2);
            
            JOptionPane.showMessageDialog(null, "success");
        }catch(Exception e2){
            e2.printStackTrace();
            
        }
        return add;
}}
