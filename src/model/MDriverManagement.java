/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MDriverManagement {
    public void AddDriver(String id, String name, String age, String gender, String carCompany, String carModel, String availability, String location, int capasity){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO driver (driverid, name, age, gender, carCampany, carModel, availability, capacity, location) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5,carCompany);
            pst.setString(6,carModel);
            pst.setString(7,availability);
            pst.setInt(8,capasity);
            pst.setString(9,location);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Driver added successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Driver ID!", "Info", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    ResultSet rst;
    public ResultSet SearchDriver(String id){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();

            String queary = "SELECT name, carCampany, carModel, availability, location FROM driver WHERE driverid = ?";
            PreparedStatement pst = con.prepareStatement(queary);
            
            pst.setString(1, id);
            
            rst = pst.executeQuery();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void RemoveDriver(String id){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "DELETE * FROME driver WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, id);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Removed successfully!", "Info", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void UpdateDriver(String id, String availability){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE driver SET availability = ? WHERE driverid = ?";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, availability);
            pst.setString(2, id);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Driver availability updated successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
