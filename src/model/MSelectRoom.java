/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MSelectRoom {
    ResultSet rst;
    public ResultSet getAvailableRoomNumbers(String roomType){
         try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select roomNo,roomType,status from room where roomType = ? AND availability ='Available' AND status='Cleaned'";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1, roomType);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void StoreRoomBooking(String resID, String id, String number, String roomNumber, String roomType){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO roombooking (roomNo, roomType, id, number, resid) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, roomNumber);
            pst.setString(2, roomType);
            pst.setString(3, id);
            pst.setString(4, number);
            pst.setString(5,resID);
            
            int count = pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void UpdateRoomAvailability(String roomNumber){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE room SET availability='Occupide' WHERE roomNo = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, roomNumber);
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
