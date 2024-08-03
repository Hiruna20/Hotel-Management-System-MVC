/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MAddEmployee {
    public void AddEmployee(String id, String name, String age, String gender, String position, String salary, String phone, String email, String password){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO employee (empid, name, age, gender, position, salary, phone, email, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5,position);
            pst.setString(6, salary);
            pst.setString(7, phone);
            pst.setString(8, email);
            pst.setString(9, password);
            
            int count = pst.executeUpdate();
            
            if (count > 0){
                JOptionPane.showMessageDialog(null, "Register successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    ResultSet rst;
    public ResultSet SearchEmployee(String id){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String quary = "select empid, name, gender, position, phone, email from employee where empid = ?";
            PreparedStatement pstmt = con.prepareStatement(quary);
            pstmt.setString(1,id);
            
            rst = pstmt.executeQuery();
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
    public void RemoveEmployee(String id){
        
    }
}
