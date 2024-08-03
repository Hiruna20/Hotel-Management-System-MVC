/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MDriverManagement;
import java.sql.ResultSet;

public class CDriverManagement {
    public void AddDriver(String id, String name, String age, String gender, String carCompany, String carModel, String availability, String location, int capasity){
        MDriverManagement mdm = new MDriverManagement();
        mdm.AddDriver(id, name, age, gender, carCompany, carModel, availability, location, capasity);
    }
    public ResultSet SearchDriver(String id){
        MDriverManagement mdm = new MDriverManagement();
        return mdm.SearchDriver(id);
    }
    public void RemoveDriver(String id){
        MDriverManagement mdm = new MDriverManagement();
        mdm.RemoveDriver(id);
    }
    public void UpdateDriver(String id, String availability){
        MDriverManagement mdm = new MDriverManagement();
        mdm.UpdateDriver(id, availability);
    }
}
