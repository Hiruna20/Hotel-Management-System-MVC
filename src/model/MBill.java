/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class MBill {
    ResultSet rst = null;
    public ResultSet SearchName(String id, String no){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select name  from guest where id = ? AND no = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,id);
            pstmt.setString(2, no);
            
            rst = pstmt.executeQuery();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    ResultSet pst = null;
    public ResultSet SearchBill(String id, String number){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select coid  from checkout where id = ? AND no = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,id);
            pstmt.setString(2, number);
            
            pst = pstmt.executeQuery();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return pst;
    }
    public void SaveBill(int coid, String id, String no, String name,String roomtype,int noofroom, int noofdays, int price){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO payment (checkoutId, id, number, name, roomtype, noOfRooms, noOfDays, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setInt(1, coid);
            pst.setString(2, id);
            pst.setString(3, no);
            pst.setString(4, name);
            pst.setString(5,roomtype);
            pst.setInt(6, noofroom);
            pst.setInt(7, noofdays);
            pst.setInt(8, price);
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
