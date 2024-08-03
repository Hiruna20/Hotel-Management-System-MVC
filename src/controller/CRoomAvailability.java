/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MRoomAvailability;

public class CRoomAvailability {
    public ResultSet CheckRoomAvailability(String roomType){
        MRoomAvailability mra = new MRoomAvailability();
        return mra.CheckRoomAvailability(roomType);
    }
}
