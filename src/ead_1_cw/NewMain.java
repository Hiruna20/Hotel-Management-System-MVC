/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ead_1_cw;

import javax.swing.SwingUtilities;
import view.VLogin;

public class NewMain {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of the VGLogin JFrame and set it visible
                VLogin loginFrame = new VLogin();
                loginFrame.setVisible(true);
            }
        });
    }
}
