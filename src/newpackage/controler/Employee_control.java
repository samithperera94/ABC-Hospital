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
import newpackage.classes.Employee;

/**
 *
 * @author samith
 */
public class Employee_control {
    
    public static Employee save(Employee a){
        Employee add = new Employee();
        try{
            //System.out.println(a.getPName());
            

            String q2="INSERT INTO employee (name,position,nic,address,age,gender) VALUES('"+a.getName()+"','"+a.getPosition()+"','"+a.getNic()+"','"+a.getAddress()+"','"+a.getAge()+"','"+a.getGender()+"')";
            Connection con = Databaseconnector.getcon();
            PreparedStatement ps = con.prepareStatement(q2);
            
            //String q3="INSERT INTO Payment(PID,Payment,Date) VALUES ('"+a.getPID()+"','"+Double.parseDouble(a.getPayment())+"','"+a.getPayDate()+"')";
            
            ps.executeUpdate(q2);
            //s2.executeUpdate(q3);
            //r.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "success");
        }catch(Exception e2){
            e2.printStackTrace();
            
        }
        return add;
     
}
    public static Employee search(int id){
        Employee employee = new Employee();
        try {
            
            String sql = "SELECT * FROM employee WHERE EID = '"+id+"'";
            Connection con = Databaseconnector.getcon();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                employee.setName(rs.getString("name"));
                
                employee.setPosition(rs.getString("position"));
                employee.setAddress(rs.getString("address"));
                employee.setNic(rs.getString("nic"));
                employee.setAge(rs.getInt("age"));
                
                employee.setGender(rs.getString("gender"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
        
        return employee;
    }
}