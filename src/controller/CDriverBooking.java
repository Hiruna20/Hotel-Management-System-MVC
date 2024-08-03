/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MDriverBooking;

public class CDriverBooking {
    public ResultSet SearchDriver(int capacity) {
        MDriverBooking mdb = new MDriverBooking();
        return mdb.SearchDriver(capacity);
    }
    public void UpdateDiver(String driverID){
        MDriverBooking mdb = new MDriverBooking();
        mdb.UpdateDiver(driverID);
    }
}
