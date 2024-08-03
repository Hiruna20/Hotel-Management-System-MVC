/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.MCheckOut;

public class CCheckOut {
    public ResultSet SearchCheckIn(String id, String number){
        MCheckOut mco = new MCheckOut();
        return mco.SearchCheckIn(id, number);
    }
    
    public void StoreCheckOut(String id, String number, String roomType, int noOfRoom, int adult, int Childern, Date checkin, Date checkout){
        SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd");
        String ckinnew = x.format(checkin);
        String ckoutnew = x.format(checkout);
        
        MCheckOut mco = new MCheckOut();
        mco.StoreCheckOut(id, number, roomType, noOfRoom, adult, Childern, ckinnew, ckoutnew);
    }
    
    public ResultSet SelectRoom(String resid, String id, String number){
        MCheckOut mco = new MCheckOut();
        return mco.SelectRoom(resid, id, number);
    }
    
    public void UpdateRoom(String roomNo){
        MCheckOut mco = new MCheckOut();
        mco.UpdateRoom(roomNo);
    }
    
    public void DeleteCheckIn(String id, String number){
        MCheckOut mco = new MCheckOut();
        mco.DeleteCheckIn(id, number);
    }
}

    