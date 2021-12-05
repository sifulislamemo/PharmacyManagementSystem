/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SalesReportApp extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public SalesReportApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserPanelBeanInfo1 = new com.toedter.calendar.demo.DateChooserPanelBeanInfo();
        jCalendarBeanInfo1 = new com.toedter.calendar.JCalendarBeanInfo();
        dateUtil1 = new com.toedter.calendar.DateUtil();
        jDayChooserBeanInfo1 = new com.toedter.calendar.JDayChooserBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        telemedicineMenu = new javax.swing.JButton();
        medicineReportMenu = new javax.swing.JButton();
        medicineMenu = new javax.swing.JButton();
        salesMenu = new javax.swing.JButton();
        salesReportMenu = new javax.swing.JButton();
        stockReportMenu = new javax.swing.JButton();
        homeDeliveryMenu = new javax.swing.JButton();
        medicineItemMenu = new javax.swing.JButton();
        branchMenu = new javax.swing.JButton();
        companyMenu = new javax.swing.JButton();
        logoutMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 240, 244));

        telemedicineMenu.setBackground(new java.awt.Color(0, 0, 0));
        telemedicineMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telemedicineMenu.setForeground(new java.awt.Color(248, 200, 41));
        telemedicineMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/telemedicine.png"))); // NOI18N
        telemedicineMenu.setText("Telemedicine");
        telemedicineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telemedicineMenuActionPerformed(evt);
            }
        });

        medicineReportMenu.setBackground(new java.awt.Color(0, 0, 0));
        medicineReportMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicineReportMenu.setForeground(new java.awt.Color(248, 200, 41));
        medicineReportMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/medicine report.png"))); // NOI18N
        medicineReportMenu.setText("Medicine Report");
        medicineReportMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineReportMenuActionPerformed(evt);
            }
        });

        medicineMenu.setBackground(new java.awt.Color(0, 0, 0));
        medicineMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicineMenu.setForeground(new java.awt.Color(248, 200, 41));
        medicineMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/medicine.png"))); // NOI18N
        medicineMenu.setText("Medicine");
        medicineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineMenuActionPerformed(evt);
            }
        });

        salesMenu.setBackground(new java.awt.Color(0, 0, 0));
        salesMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salesMenu.setForeground(new java.awt.Color(248, 200, 41));
        salesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/sales.png"))); // NOI18N
        salesMenu.setText("Sales");
        salesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesMenuActionPerformed(evt);
            }
        });

        salesReportMenu.setBackground(new java.awt.Color(0, 0, 0));
        salesReportMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salesReportMenu.setForeground(new java.awt.Color(248, 200, 41));
        salesReportMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/sales report.png"))); // NOI18N
        salesReportMenu.setText("Sales Report");
        salesReportMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportMenuActionPerformed(evt);
            }
        });

        stockReportMenu.setBackground(new java.awt.Color(0, 0, 0));
        stockReportMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stockReportMenu.setForeground(new java.awt.Color(248, 200, 41));
        stockReportMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/stock report.png"))); // NOI18N
        stockReportMenu.setText("Stock Report");
        stockReportMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockReportMenuActionPerformed(evt);
            }
        });

        homeDeliveryMenu.setBackground(new java.awt.Color(0, 0, 0));
        homeDeliveryMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homeDeliveryMenu.setForeground(new java.awt.Color(248, 200, 41));
        homeDeliveryMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/Home Delivery.png"))); // NOI18N
        homeDeliveryMenu.setText("Home Delivery");
        homeDeliveryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeDeliveryMenuActionPerformed(evt);
            }
        });

        medicineItemMenu.setBackground(new java.awt.Color(0, 0, 0));
        medicineItemMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicineItemMenu.setForeground(new java.awt.Color(248, 200, 41));
        medicineItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/medicine item.png"))); // NOI18N
        medicineItemMenu.setText("Medicine Item ");
        medicineItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineItemMenuActionPerformed(evt);
            }
        });

        branchMenu.setBackground(new java.awt.Color(0, 0, 0));
        branchMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        branchMenu.setForeground(new java.awt.Color(248, 200, 41));
        branchMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/branch.png"))); // NOI18N
        branchMenu.setText("Branch");
        branchMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchMenuActionPerformed(evt);
            }
        });

        companyMenu.setBackground(new java.awt.Color(0, 0, 0));
        companyMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        companyMenu.setForeground(new java.awt.Color(248, 200, 41));
        companyMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/medicine company.png"))); // NOI18N
        companyMenu.setText("Company");
        companyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyMenuActionPerformed(evt);
            }
        });

        logoutMenu.setBackground(new java.awt.Color(0, 0, 0));
        logoutMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutMenu.setForeground(new java.awt.Color(248, 200, 41));
        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pharmacy/picture/logout.png"))); // NOI18N
        logoutMenu.setText("Logout");
        logoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicineReportMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(medicineMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salesMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salesReportMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stockReportMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(telemedicineMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeDeliveryMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
            .addComponent(medicineItemMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(branchMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(companyMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(medicineMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineReportMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(salesMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salesReportMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(stockReportMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeDeliveryMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telemedicineMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineItemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sales Report");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(btnUpdate)
                .addGap(56, 56, 56)
                .addComponent(btnDelete)
                .addGap(49, 49, 49)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telemedicineMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telemedicineMenuActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new TelemedicineApp().setVisible(true);
    }//GEN-LAST:event_telemedicineMenuActionPerformed

    private void medicineReportMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineReportMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MedicineReportApp().setVisible(true);
    }//GEN-LAST:event_medicineReportMenuActionPerformed

    private void salesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SalesApp().setVisible(true);
    }//GEN-LAST:event_salesMenuActionPerformed

    private void salesReportMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SalesReportApp().setVisible(true);
    }//GEN-LAST:event_salesReportMenuActionPerformed

    private void stockReportMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockReportMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new StockReportApp().setVisible(true);
    }//GEN-LAST:event_stockReportMenuActionPerformed

    private void homeDeliveryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeDeliveryMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeDeliveryApp().setVisible(true);
    }//GEN-LAST:event_homeDeliveryMenuActionPerformed

    private void medicineItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineItemMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MedicineItemApp().setVisible(true);
    }//GEN-LAST:event_medicineItemMenuActionPerformed

    private void branchMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BranchApp().setVisible(true);
    }//GEN-LAST:event_branchMenuActionPerformed

    private void companyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CompanyApp().setVisible(true);
    }//GEN-LAST:event_companyMenuActionPerformed

    private void logoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuActionPerformed
        // TODO add your handling code here:
        int logOut = JOptionPane.showConfirmDialog(null,"Do you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(logOut == 0){
            this.setVisible(false);
        new LoginApp().setVisible(true);
        }
    }//GEN-LAST:event_logoutMenuActionPerformed

    private void medicineMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MedicineApp().setVisible(true);

    }//GEN-LAST:event_medicineMenuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(SalesReportApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReportApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReportApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReportApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReportApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton branchMenu;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton companyMenu;
    private com.toedter.calendar.demo.DateChooserPanelBeanInfo dateChooserPanelBeanInfo1;
    private com.toedter.calendar.DateUtil dateUtil1;
    private javax.swing.JButton homeDeliveryMenu;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo1;
    private com.toedter.calendar.JDayChooserBeanInfo jDayChooserBeanInfo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutMenu;
    private javax.swing.JButton medicineItemMenu;
    private javax.swing.JButton medicineMenu;
    private javax.swing.JButton medicineReportMenu;
    private javax.swing.JButton salesMenu;
    private javax.swing.JButton salesReportMenu;
    private javax.swing.JButton stockReportMenu;
    private javax.swing.JButton telemedicineMenu;
    // End of variables declaration//GEN-END:variables
}
