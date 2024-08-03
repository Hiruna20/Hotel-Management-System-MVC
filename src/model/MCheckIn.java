/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;


public class MCheckIn {
    ResultSet rst;
    public ResultSet SearchCheckIn(String resID){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String sql = "SELECT name, roomtype, adult, children, checkin, checkout FROM reservation WHERE resid = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, resID);

            rst = pstmt.executeQuery();
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void SaveCheckIn(String resid, String id, String number, String name, int adult, int children, String roomType, int noOfRoom, String checkin, String checkout){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO checkin (resid, id, number, name, adult, children, roomtype, noofrooms, checkin,checkout) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, resid);
            pst.setString(2, id);
            pst.setString(3, number);
            pst.setString(4, name);
            pst.setInt(5, adult);
            pst.setInt(6,children );
            pst.setString(7, roomType);
            pst.setInt(8, noOfRoom);
            pst.setString(9, checkin);
            pst.setString(10, checkout);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "CheckIn successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
