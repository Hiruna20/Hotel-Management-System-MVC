/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MBill;

public class CBill {
    public ResultSet SearchName(String id, String no){
        MBill bill = new MBill();
        return bill.SearchName(id, no);
    }
    public ResultSet SearchBill(String id, String number){
        MBill bill = new MBill();
        return bill.SearchBill(id, number);
    }
    public int CalculateTotal(int noOfRoom, int price, int adult, int childern, int diffInDays){
        int total;
        
        total = (noOfRoom*price + adult*2000 + childern* 1000)*diffInDays;
        
        return total;
    }
    public void SaveBill(int coid, String id, String no, String name,String roomtype,int noofroom, int noofdays, int price) {
        MBill bill = new MBill();
        bill.SaveBill(coid, id, no, name, roomtype, noofroom, noofdays, price);
    }
}
