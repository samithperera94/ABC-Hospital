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
import newpackage.classes.Doctor;

/**
 *
 * @author samith
 */
public class Doctor_control {
    public static Doctor save(Doctor a){
        Doctor add = new Doctor();
        try{
            
            

            String q2="INSERT INTO doctor (EID,name,speciality,ward_num) VALUES('"+a.getEID()+"','"+a.getName()+"','"+a.getSpeciality()+"','"+a.getWard_num()+"')";
            Connection con = Databaseconnector.getcon();
            PreparedStatement ps = con.prepareStatement(q2);
            
            
            ps.executeUpdate(q2);
            
            JOptionPane.showMessageDialog(null, "success");
        }catch(Exception e2){
            e2.printStackTrace();
            
        }
        return add;
     
}
 
     public static Doctor search(String  id){
       Doctor doctor = new Doctor();
        try {
            
            String sql = "SELECT * FROM doctor WHERE DID = '"+id+"'";
            Connection con = Databaseconnector.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                //doctor.setName(rs.getString("name"));
               
                doctor.setPosition(rs.getString("speciality"));
                doctor.setWard_num(Integer.parseInt(rs.getString("ward_num")));
                
                
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
		try {
            
            String sql = "SELECT * FROM employee WHERE EID = '"+id+"'";
            Connection con = Databaseconnector.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                doctor.setEID(Integer.parseInt(rs.getString("EID")));
				doctor.setName(rs.getString("name"));
				doctor.setAddress(rs.getString("Address"));
				//employee.setName(rs.getString("name"))
               
                

                
                
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
    
    return doctor;
    }
}
