/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.controler;

/**
 *
 * @author Acer*/
import newpackage.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement; 
import javax.swing.JOptionPane;
import newpackage.classes.Patient;
public class Patient_control {
     /*void addNewuser(adduser a){
        try{
            Statement s1= databaseconnector.getStatement();
            String qu="INSERT INTO employee (EID,EName,Gender,DOB,CivilStatus,Email,Address,WorkStartedDate) VALUES('"+a.getEID()+"','"+a.getEname()+"','"+a.getGender()+"','"+a.getDOB()+"','"+a.getCivilStatus()+"','"+a.getEmail()+"','"+a.getAddress()+"','"+a.getWorkStarted()+"')";
            String q="INSERT INTO user(EID,useName,password,UserType) VALUES ('"+a.getEID()+"','"+a.getUserName()+"','"+a.getPasword()+"','"+a.getUserType()+"')";
            
            s1.executeUpdate(qu);
            s1.executeUpdate(q);
        }catch(Exception e){
            e.printStackTrace();
        }
     }*/
    public static Patient save(Patient a){
        Patient add = new Patient();
        try{
            //System.out.println(a.getPName());
            String q2="INSERT INTO patient (Pname,age,gender,disease,blood_group,fod,allergies,condoctor,recdoctor,consult) VALUES('"+a.getPName()+"','"+a.getAge()+"','"+a.getGender()+"','"+a.getDisease()+"','"+a.getBlood_group()+"','"+a.getFod()+"','"+a.getAllergies()+"','"+a.getCondoctor()+"','"+a.getRecdoctor()+"','"+a.getConsult()+"')";
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
/*   void loging(login1 k){
        try{
           Hrmuser h=new Hrmuser();
           login lg=new login();
           Statement s3=databaseconnector.getStatement();
           ResultSet rs=s3.executeQuery("SELECT * FROM user WHERE useName ='"+k.getUserName()+"' AND password='"+k.getPassword()+"'");
           while(rs.next()){
               if(rs.getString("UserType").equals("admine")){
                   lg.setVisible(false);
                   h.setVisible(true);
                   
               }
           }
        }catch(Exception e3){
           e3.printStackTrace();
       }
   }*/
 
   public static Patient search(int id){
        Patient patient = new Patient();
        try {
            
            String sql = "SELECT * FROM patient WHERE PID = '"+id+"'";
            Connection con = Databaseconnector.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             	

            while(rs.next()){
                patient.setPName(rs.getString("Pname"));
                patient.setAge(Integer.parseInt(rs.getString("age")));
                patient.setGender(rs.getString("gender"));
                patient.setDisease(rs.getString("disease"));
                patient.setBlood_group(rs.getString("blood_group"));
                
                patient.setFod(rs.getString("fod"));
                patient.setAllergies(rs.getString("allergies"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error when data retrieving from database");
        }
        
        return patient;
    }
    
    /*public static void update(Employee employee){
        try {
            String sql = "UPDATE employee SET name=?,address=?,position=?,nic=?,age=?, gender=?,date_of_admission=?  WHERE id=?";
            Connection con = Db.getcon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,employee.geteName());
            ps.setString(2,employee.geteAddress());
            ps.setString(3,employee.getePosition());
            ps.setString(4,employee.geteNic());
            ps.setInt(5,employee.geteAge());
            ps.setString(6,employee.geteGender());
            ps.setString(7,employee.getDateOfAddmission());
            ps.setInt(8,employee.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update successfully");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Your details are incorrect please chek before submit.date must be yyyy-mm-dd format.age must be number");
        }
    }*/
}
