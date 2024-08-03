/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MSelectRoom;

public class CSelectRoom {
    public ResultSet getAvailableRoomNumbers(String roomType){
        MSelectRoom msr = new MSelectRoom();
        return msr.getAvailableRoomNumbers(roomType);
    }

    public void UpdateRoomAvailability(String roomNumbers){
        MSelectRoom msr = new MSelectRoom();
        msr.UpdateRoomAvailability(roomNumbers);
    }

    public void SroreRoomBooking(String resID, String id, String number, String roomNumber, String roomType) {
        MSelectRoom msr = new MSelectRoom();
        msr.StoreRoomBooking(resID, id, number, roomNumber, roomType);
    }
}
