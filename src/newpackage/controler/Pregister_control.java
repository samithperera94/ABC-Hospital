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
import newpackage.classes.Patient_register;

/**
 *
 * @author samith
 */
public class Pregister_control {
    public static Patient_register save(Patient_register a){
        Patient_register add = new Patient_register();
        try{
          
            String q2="INSERT INTO register (PID,admitted_date,ward_name,ward_num,address,telephone,gurdian) VALUES('"+a.getPID()+"','"+a.getAdmitted_date()+"','"+a.getWard_name()+"','"+a.getWard_num()+"','"+a.getAddress()+"','"+a.getTelephone()+"','"+a.getGurdian()+"')";
            Connection con = Databaseconnector.getcon();
            PreparedStatement ps = con.prepareStatement(q2);
            
            
            ps.executeUpdate(q2);
            
            JOptionPane.showMessageDialog(null, "success");
        }catch(Exception e2){
            e2.printStackTrace();
            
        }
        return add;
     }

 
   public static Patient_register search(int id){
        Patient_register patient_register = new Patient_register();
        try {
            
            String sql = "SELECT * FROM patient_register WHERE PID = '"+id+"'";
            Connection con = Databaseconnector.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                patient_register.setRegID(Integer.parseInt(rs.getString("RegID")));
                patient_register.setAdmitted_date(rs.getString("admitted_date"));
                patient_register.setWard_name(rs.getString("ward_name"));
				patient_register.setWard_num(Integer.parseInt(rs.getString("ward_num")));

                patient_register.setAddress(rs.getString("address"));
                
                patient_register.setTelephone(rs.getString("telephone"));
                patient_register.setGurdian(rs.getString("gurdian"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
        
        return patient_register;
    }
    
}
