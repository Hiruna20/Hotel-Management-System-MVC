/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.MResetPassword;

public class CResetPassword {
   public void ResetPassword(String username, String type, String password, String cpassword){
        if (password == null) {
            JOptionPane.showMessageDialog(null, "Password cannot be null!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (password.length() < 8 || password.length() > 32) {
            JOptionPane.showMessageDialog(null, "Password must be between 8 and 32 characters!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!password.matches(".*[a-z].*")) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one lowercase letter!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!password.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one uppercase letter!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!password.matches(".*[0-9].*") && !password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one number (0-9) or one special character!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(password.equals(cpassword)){
            MResetPassword crp = new MResetPassword();
            crp.ResetPassword(username, type, password);
        }
        else{
            JOptionPane.showMessageDialog(null, "Password must match!", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
   } 
}
