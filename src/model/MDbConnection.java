/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MDbConnection {
   private static Connection con;
    public Connection createConnection(){
        try{
            String dbpath = "jdbc:mysql://localhost:3306/hotel";
            con = DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e){
        System.err.println(e.getMessage());
        }
        return con;
    }
}
