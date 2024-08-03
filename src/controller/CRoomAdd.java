/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;

import model.MRoomAdd;
public class CRoomAdd {
    public void AddRoom(String RoomNo, String availability, String cleaningStatus, String roomType){
        MRoomAdd mar = new MRoomAdd();
        mar.AddRoom(RoomNo, availability, cleaningStatus, roomType);
    }
    public ResultSet SearchRoom(String RoomNo){
        MRoomAdd mra = new MRoomAdd();
        return mra.SearchRoom(RoomNo);
    }
    public void UpdateRoom(String roomNo, String status){
        MRoomAdd mra = new MRoomAdd();
        mra.UpdateRoom(roomNo, status);
    }
}
