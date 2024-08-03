/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CLogin;
import controller.CReportCustomer;
import javax.swing.JFrame;

/**
 *
 * @author acer
 */
public class VAdminDashboard extends javax.swing.JFrame {

    private String empid;
    private String type;
    public VAdminDashboard(String empid, String type) {
        this.empid = empid;
        this.type =type;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbl_LogOut2 = new javax.swing.JLabel();
        lbl_User2 = new javax.swing.JLabel();
        lbl_Home2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_RoomManagment = new javax.swing.JButton();
        btn_DriverManagment = new javax.swing.JButton();
        btn_EmployeeManagment = new javax.swing.JButton();
        btn_CustomerReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cooltext459686165626074.png"))); // NOI18N

        lbl_LogOut2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_LogOut2.setForeground(new java.awt.Color(255, 204, 0));
        lbl_LogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/210121 (1).png"))); // NOI18N
        lbl_LogOut2.setText("Log Out");
        lbl_LogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_LogOut2MousePressed(evt);
            }
        });

        lbl_User2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        lbl_User2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_User2MousePressed(evt);
            }
        });

        lbl_Home2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Home2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-hotel-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_Home2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342)
                .addComponent(lbl_LogOut2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_User2)
                .addGap(11, 11, 11))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_User2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_LogOut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Home2)
                .addGap(20, 20, 20))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cooltext459915817729506.png"))); // NOI18N

        btn_RoomManagment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_RoomManagment.setForeground(new java.awt.Color(0, 0, 102));
        btn_RoomManagment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-bedroom-64.png"))); // NOI18N
        btn_RoomManagment.setText("Room  Managment");
        btn_RoomManagment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RoomManagmentActionPerformed(evt);
            }
        });

        btn_DriverManagment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_DriverManagment.setForeground(new java.awt.Color(0, 0, 102));
        btn_DriverManagment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-valet-parking-64.png"))); // NOI18N
        btn_DriverManagment.setText("Driver  Managment");
        btn_DriverManagment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DriverManagmentActionPerformed(evt);
            }
        });

        btn_EmployeeManagment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_EmployeeManagment.setForeground(new java.awt.Color(0, 0, 102));
        btn_EmployeeManagment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-conference-64.png"))); // NOI18N
        btn_EmployeeManagment.setText("Employee \nManagment");
        btn_EmployeeManagment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeManagmentActionPerformed(evt);
            }
        });

        btn_CustomerReport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_CustomerReport.setForeground(new java.awt.Color(0, 0, 102));
        btn_CustomerReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-conference-64.png"))); // NOI18N
        btn_CustomerReport.setText("Customer Report");
        btn_CustomerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CustomerReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_CustomerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_EmployeeManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_RoomManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_DriverManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btn_CustomerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RoomManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DriverManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EmployeeManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RoomManagmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RoomManagmentActionPerformed
        // TODO add your handling code here:
        VAddRoom var = new VAddRoom(empid, type);
        var.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_RoomManagmentActionPerformed

    private void btn_DriverManagmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DriverManagmentActionPerformed
        // TODO add your handling code here:
        VDriversManagement vdm = new VDriversManagement(empid, type);
        vdm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DriverManagmentActionPerformed

    private void btn_EmployeeManagmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeManagmentActionPerformed
        // TODO add your handling code here:
        VAddEmployee vae = new VAddEmployee(empid, type);
        vae.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_EmployeeManagmentActionPerformed

    private void lbl_LogOut2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LogOut2MousePressed
        // TODO add your handling code here:
        CLogin login = new CLogin();
        login.SaveLogOut(empid, type);
        this.dispose();
        VLogin vlogin = new VLogin();
        vlogin.setVisible(true);
    }//GEN-LAST:event_lbl_LogOut2MousePressed

    private void lbl_User2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_User2MousePressed
        // TODO add your handling code here:
        VUser user = new VUser(empid);
        user.setVisible(true);
    }//GEN-LAST:event_lbl_User2MousePressed

    private void btn_CustomerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CustomerReportActionPerformed
        // TODO add your handling code here:
        CReportCustomer report = new CReportCustomer();
        report.GetCustomerReport();
    }//GEN-LAST:event_btn_CustomerReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdminDashboard("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CustomerReport;
    private javax.swing.JButton btn_DriverManagment;
    private javax.swing.JButton btn_EmployeeManagment;
    private javax.swing.JButton btn_RoomManagment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_Home2;
    private javax.swing.JLabel lbl_LogOut2;
    private javax.swing.JLabel lbl_User2;
    // End of variables declaration//GEN-END:variables
}
