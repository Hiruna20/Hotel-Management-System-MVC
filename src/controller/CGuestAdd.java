/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.MGuestAdd;

public class CGuestAdd {
    public void RegisterGuest(String id,String no,String name,int tel,String email,String country,String address,String city,int pcode){
        if("".equals(name)){
            JOptionPane.showMessageDialog(null, "Please enter name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if("".equals(tel)){
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        MGuestAdd mgr = new MGuestAdd();
        mgr.RegisterGuest(id, no, name, tel, email, country, address, city, pcode);
    }
}
