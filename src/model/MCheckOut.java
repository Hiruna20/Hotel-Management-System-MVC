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

public class MCheckOut {
    ResultSet rst;
    public ResultSet SearchCheckIn(String id, String number){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select resid, adult, children, roomtype, noofrooms, checkin from checkin where id = ? AND number = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,id);
            pstmt.setString(2, number);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void StoreCheckOut(String id, String number, String roomType, int noOfRoom, int adult, int Childern, String checkin, String Checkout){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO checkout (id, no, roomtype, noofrooms, adult, children, checkin, checkout) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, id);
            pst.setString(2, number);
            pst.setString(3, roomType);
            pst.setInt(4, noOfRoom);
            pst.setInt(5,adult );
            pst.setInt(6, Childern);
            pst.setString(7, checkin);
            pst.setString(8, Checkout);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "CheckOut successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public ResultSet SelectRoom(String resid, String id, String number){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select roomNo from roombooking where id = ? AND number = ? AND resid = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,id);
            pstmt.setString(2, number);
            pstmt.setString(3, resid);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void UpdateRoom(String roomNo){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE room SET availability = 'Available', Status = 'Dirty' WHERE roomNo = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, roomNo);
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void DeleteCheckIn(String id, String number){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "DELETE FROM checkin WHERE id = ? AND number = ?";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, id);
            pst.setString(2, number);
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
