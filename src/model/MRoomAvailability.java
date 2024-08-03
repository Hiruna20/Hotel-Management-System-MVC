/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;

public class MRoomAvailability {
    ResultSet rst;
    public ResultSet CheckRoomAvailability(String roomType){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select roomNo, status, roomType from room where roomType = ? AND availability = 'Available'";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,roomType);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }

}
