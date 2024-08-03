/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MUser;
public class CUser {
    public ResultSet SelectUser(String empid){
        MUser user = new MUser();
        return user.SelectUser(empid);
    }
}
