/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.MReservation;

public class CReservation {
    public void Reservation(String name, String roomtype, int adult, int children, Date checkin, Date checkout){
        SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd");
        String ckinnew = x.format(checkin);
        String ckoutnew = x.format(checkout);
        
        MReservation mr = new MReservation();
        mr.Reservation(name, roomtype, adult, children, ckinnew, ckoutnew);
    }
}
