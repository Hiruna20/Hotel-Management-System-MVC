/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import model.MCheckIn;

public class CCheckIn {
    public ResultSet SearchCheckIn(String resID){
        MCheckIn mcis = new MCheckIn();
        return mcis.SearchCheckIn(resID);
    }
    public void SaveCheckIn(String resid, String id, String number, String name, int adult, int chidern, String roomType, int noOfRoom, Date checkin, Date checkout){
        SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd");
        String ckinnew = x.format(checkin);
        String ckoutnew = x.format(checkout);
        
        MCheckIn mci = new MCheckIn();
        mci.SaveCheckIn(resid, id, number, name, adult, chidern, roomType, noOfRoom, ckinnew, ckoutnew);
    }
}
