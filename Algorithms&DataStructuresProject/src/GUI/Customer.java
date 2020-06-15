/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author HELLO
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
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

        lbCustomer = new javax.swing.JLabel();

        jMenuBar1 = new javax.swing.JMenuBar();
        menuMyProfile = new javax.swing.JMenu();
        menuItemMyAdvances = new javax.swing.JMenuItem();
        menuItemMyDatingHistory = new javax.swing.JMenuItem();
        menuItemMyFoodPlans = new javax.swing.JMenuItem();
        menuAdd = new javax.swing.JMenu();
        menuItemNewDate = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuItemSignOff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setPreferredSize(new java.awt.Dimension(1500, 1500));

        getContentPane().setLayout(null);

        lbCustomer.setText("CUSTOMER");
        getContentPane().add(lbCustomer);
        lbCustomer.setBounds(164, 120, 55, 14);

        menuMyProfile.setText("MY PROFILE");

        menuItemMyAdvances.setText("MY ADVANCES");
        menuItemMyAdvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyAdvancesActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyAdvances);

        menuItemMyDatingHistory.setText("MY DATING HISTORY");
        menuItemMyDatingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyDatingHistoryActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyDatingHistory);

        menuItemMyFoodPlans.setText("MY FOOD PLANS");
        menuItemMyFoodPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyFoodPlansActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyFoodPlans);

        jMenuBar1.add(menuMyProfile);

        menuAdd.setText("ADD");

        menuItemNewDate.setText("NEW DATE");
        menuItemNewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewDateActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewDate);

        jMenuBar1.add(menuAdd);

        menuOptions.setText("OPTIONS");
        menuOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsActionPerformed(evt);
            }
        });

        menuItemSignOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSignOff.setText("SIGN OFF");
        menuItemSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSignOffActionPerformed(evt);
            }
        });
        menuOptions.add(menuItemSignOff);

        jMenuBar1.add(menuOptions);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsActionPerformed

    }//GEN-LAST:event_menuOptionsActionPerformed

    private void menuItemSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOffActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSignOffActionPerformed

    private void menuItemNewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewDateActionPerformed
        AdministratorDates aD = new AdministratorDates();
        aD.show();
        aD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemNewDateActionPerformed

    private void menuItemMyDatingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyDatingHistoryActionPerformed
        MyDatingHistory mD = new MyDatingHistory();
        mD.show();
        mD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyDatingHistoryActionPerformed

    private void menuItemMyAdvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyAdvancesActionPerformed
        MyAdvances mA = new MyAdvances();
        mA.show();
        mA.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyAdvancesActionPerformed

    private void menuItemMyFoodPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyFoodPlansActionPerformed
        MyFoodPlans mF = new MyFoodPlans();
        mF.show();
        mF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyFoodPlansActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      CRUD_CLIENTE_CITAS ccc=new CRUD_CLIENTE_CITAS();
      ccc.setVisible(true);
      dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbCustomer;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenuItem menuItemMyAdvances;
    private javax.swing.JMenuItem menuItemMyDatingHistory;
    private javax.swing.JMenuItem menuItemMyFoodPlans;
    private javax.swing.JMenuItem menuItemNewDate;
    private javax.swing.JMenuItem menuItemSignOff;
    private javax.swing.JMenu menuMyProfile;
    private javax.swing.JMenu menuOptions;
    // End of variables declaration//GEN-END:variables
}
