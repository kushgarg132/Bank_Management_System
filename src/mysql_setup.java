import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
public class mysql_setup {
    
    String mysql_password="kush";
    
    public static void main (String args[]){  
        
        mysql_setup a=new mysql_setup();
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/","root", a.mysql_password);
            Statement statement = con.createStatement();

            String sql1="CREATE DATABASE BankLogin;";
            String sql2="Use BankLogin;";
            String sql3="Create table details(Name char(20), Mobile_No double, Email_Id varchar(30), Password varchar(30), Balance double);";

            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            statement.executeUpdate(sql3);
            statement.close();

            JOptionPane.showMessageDialog(null,"BankLogin Database and Table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}