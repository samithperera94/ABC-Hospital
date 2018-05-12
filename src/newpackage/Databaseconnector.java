/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Databaseconnector {
    public static Connection getcon() throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","1234");
        Statement stat= con.createStatement();
        return con;
    }
    
}