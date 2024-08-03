/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

public class MReservation {
    public void Reservation(String name, String roomtype, int adult, int children, String checkin, String checkout){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection con = dbConnection.createConnection();
            
            String query = "INSERT INTO reservation (name ,roomtype ,adult ,children ,checkin ,checkout) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, name);
            pst.setString(2, roomtype);
            pst.setInt(3, adult);
            pst.setInt(4,children );
            pst.setString(5, checkin);
            pst.setString(6, checkout);
            
            int count = pst.executeUpdate();
            
            if (count > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int lastInsertedId = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, "Reserved successfully! Reservation ID: " + lastInsertedId, "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
