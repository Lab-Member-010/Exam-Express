/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITEP;
import javax.swing.*;
/**
 *
 * @author mohit
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Student() {
        initComponents();
        setExtendedState(Student.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SheelaPanel = new javax.swing.JPanel();
        CheckSchedule = new javax.swing.JButton();
        CheckResult = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        logoutButton = new javax.swing.JLabel();
        LabelTop = new javax.swing.JLabel();
        ShowClass = new javax.swing.JButton();
        Sheela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        SheelaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckSchedule.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        CheckSchedule.setText("Check Schedule");
        CheckSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckScheduleMouseClicked(evt);
            }
        });
        SheelaPanel.add(CheckSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, -1, 80));

        CheckResult.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        CheckResult.setText("Check Result");
        CheckResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckResultMouseClicked(evt);
            }
        });
        SheelaPanel.add(CheckResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 290, 90));

        registration.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        registration.setText("Registration");
        registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationMouseClicked(evt);
            }
        });
        SheelaPanel.add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 290, 80));

        logoutButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoutfinal.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        SheelaPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 30, -1, -1));

        LabelTop.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        LabelTop.setForeground(new java.awt.Color(255, 255, 255));
        LabelTop.setText("STUDENT");
        SheelaPanel.add(LabelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 330, 90));

        ShowClass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        ShowClass.setText("Show Class");
        ShowClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowClassMouseClicked(evt);
            }
        });
        ShowClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowClassActionPerformed(evt);
            }
        });
        SheelaPanel.add(ShowClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, 280, 80));

        Sheela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sheela.jpg"))); // NOI18N
        Sheela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        SheelaPanel.add(Sheela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 1160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SheelaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SheelaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationMouseClicked
        // TODO add your handling code here:
        new Apply().setVisible(true);
    }//GEN-LAST:event_registrationMouseClicked

    private void CheckResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckResultMouseClicked
        // TODO add your handling code here:
        new Check_Result().setVisible(true);
    }//GEN-LAST:event_CheckResultMouseClicked

    private void CheckScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckScheduleMouseClicked
        // TODO add your handling code here:
        new Chech_Schedule().setVisible(true);
    }//GEN-LAST:event_CheckScheduleMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void ShowClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowClassActionPerformed

    private void ShowClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowClassMouseClicked
        // TODO add your handling code here:
        new FatchData4();
    }//GEN-LAST:event_ShowClassMouseClicked

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckResult;
    private javax.swing.JButton CheckSchedule;
    private javax.swing.JLabel LabelTop;
    private javax.swing.JLabel Sheela;
    private javax.swing.JPanel SheelaPanel;
    private javax.swing.JButton ShowClass;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JButton registration;
    // End of variables declaration//GEN-END:variables
}