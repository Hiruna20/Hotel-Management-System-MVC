/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MLogin;
import java.sql.*;

public class CLogin {
    public boolean LoginGuest(String username, String password, String type) throws SQLException {
        try{
            MLogin mgl = new MLogin();
            ResultSet rst = mgl.LoginGuest(username, type);

            if (rst.next()) {
                String dbPassword = rst.getString("password"); // Retrieve the password from the ResultSet
                return password.equals(dbPassword);
            } else {
                return false; // Username not found
            }
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return false; // Login failed due to an exception
        }
    }
    public void SaveLogin(String username, String type){
        MLogin login = new MLogin();
        login.SaveLogin(username, type);
    }
    public void SaveLogOut(String username, String type){
        MLogin login = new MLogin();
        login.SaveLogOut(username, type);
    }
}
