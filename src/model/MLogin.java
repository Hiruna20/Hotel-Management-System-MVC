/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
public class MLogin {
    ResultSet rst;
    public ResultSet LoginGuest(String username, String type){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String sql = "SELECT password FROM employee WHERE empid = ? AND position = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, type);

            rst = pstmt.executeQuery();
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void SaveLogin(String username, String type){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO login (empid, position,date, logintime, logouttime) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
             // Getting current date and time
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            
            pst.setString(1, username);
            pst.setString(2, type);
            pst.setDate(3, Date.valueOf(currentDate));
            pst.setTime(4, Time.valueOf(currentTime));
            pst.setTime(5,new Time(0, 0, 0));
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void SaveLogOut(String username, String type){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "UPDATE login SET logouttime = ? Where empid = ? AND position = ? AND date = ?";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
             // Getting current date and time
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            
            pst.setTime(1, Time.valueOf(currentTime));
            pst.setString(2, username);
            pst.setString(3, type);
            pst.setDate(4, Date.valueOf(currentDate));
            
            
            pst.executeUpdate();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
