/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MRoomAdd {
    public void AddRoom(String RoomNo, String availability, String cleaningStatus, String roomType){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO room (roomNo, availability, status, roomType, price) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, RoomNo);
            pst.setString(2, availability);
            pst.setString(3, cleaningStatus);
            pst.setString(4, roomType);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Room added successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    ResultSet rst;
    public ResultSet SearchRoom(String RoomNo){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select roomNo, availability, status, roomType from room where roomNo = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,RoomNo);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
     public void UpdateRoom(String roomNo, String status){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE room SET Status = ? WHERE roomNo = ?";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, status);
            pst.setString(2, roomNo);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Room Cleaning Status updated successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
