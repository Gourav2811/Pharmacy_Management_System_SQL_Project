/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author saini
 */
public class Tables {
    public static void main(String []args){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
//            st.executeUpdate("CREATE TABLE appuser ("
//            + "appuser_ID INT AUTO_INCREMENT PRIMARY KEY, "
//            + "userRole VARCHAR(200), "
//            + "name varchar(200),"
//            + "dob VARCHAR(200), "
//            + "mobileNumber VARCHAR(50), "  // Corrected spelling
//            + "email VARCHAR(200), "
//            + "username VARCHAR(200), "
//            + "password VARCHAR(200), "
//            + "address VARCHAR(200)" // Added closing parenthesis
//            + ")");
//           st.executeUpdate("INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) "
//            + "VALUES ('Admin', 'Gourav', '11-01-2004', '7056185525', 'saini11gaurav@gmail.com', 'Admin', '123456', 'India')");
//           st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueID varchar(200), name varchar(200), companyName varchar(200), quantity bigint, price bigint)");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key, billId varchar(200), billDate varchar(50), totalPaid bigint, generatedBy varchar(50))");
             JOptionPane.showMessageDialog(null, "Table Created Successfully");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
