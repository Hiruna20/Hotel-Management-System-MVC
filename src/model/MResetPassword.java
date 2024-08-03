/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class MResetPassword {
    public void ResetPassword(String username, String type, String password){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();

            String query = "UPDATE employee SET password = ? WHERE empid = ? AND position = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,password);
            pst.setString(2, username);
            pst.setString(3, type);
            
            int count = pst.executeUpdate();
            
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Password changed successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "No matching record found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }       
    }
}
