/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MAddEmployee;
import java.sql.ResultSet;

public class CAddEmployee {
    public void AddEmployee(String id, String name, String age, String gender, String position, String salary, String phone, String email, String password){
       MAddEmployee mae = new MAddEmployee();
       mae.AddEmployee(id, name, age, gender, position, salary, phone, email, password);
    }
    public ResultSet SearchEmployee(String id){
       MAddEmployee mae = new MAddEmployee();
       return mae.SearchEmployee(id);
    }
    public void RemoveEmployee(String id){
       MAddEmployee mae = new MAddEmployee();
       mae.RemoveEmployee(id);
    }
}
