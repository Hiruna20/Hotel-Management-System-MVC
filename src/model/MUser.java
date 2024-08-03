/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MUser {
    ResultSet rst;
    public ResultSet SelectUser(String empid){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String sql = "SELECT empid, name, position, email FROM employee WHERE empid = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, empid);

            rst = pstmt.executeQuery();
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rst;
    }
}
