/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;
public class MGuestAdd {
    public void RegisterGuest(String id,String no,String name,int tel,String email,String country,String address,String city,int pcode){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO guest (id, no, name, phone, email, country, address, city, postcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, id);
            pst.setString(2, no);
            pst.setString(3, name);
            pst.setInt(4, tel);
            pst.setString(5, email);
            pst.setString(6, country);
            pst.setString(7, address);
            pst.setString(8, city);
            pst.setInt(9, pcode);
            
            
            int count = pst.executeUpdate();
            
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Registered successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
