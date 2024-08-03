/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;

public class MDriverBooking {
    ResultSet rst;
    public  ResultSet SearchDriver(int capacity){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select driverid, name, carModel from driver where capacity = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setInt(1,capacity);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void UpdateDiver(String driverID){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE driver SET availability='Occupide' WHERE driverid = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, driverID);
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
