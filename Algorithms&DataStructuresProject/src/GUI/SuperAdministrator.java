/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HELLO
 */
public class SuperAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form SuperAdministrator
     */
    FondoPanel fondo = new FondoPanel();
    public SuperAdministrator() {
          this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(SuperAdministrator.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        lbSuperAdministrator = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdd = new javax.swing.JMenu();
        menuItemNewRol = new javax.swing.JMenuItem();
        menuItemNewDate = new javax.swing.JMenuItem();
        menuCrud = new javax.swing.JMenu();
        menuItemCRUDRoles = new javax.swing.JMenuItem();
        menuItemCRUDDates = new javax.swing.JMenuItem();
        menuInformation = new javax.swing.JMenu();
        menuItemAdvances = new javax.swing.JMenuItem();
        menuItemDatingHistory = new javax.swing.JMenuItem();
        menuItemFoodPlans = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuItemSignOff = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSuperAdministrator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSuperAdministrator.setText("SUPER ADMINISTRATOR");
        getContentPane().add(lbSuperAdministrator);
        lbSuperAdministrator.setBounds(880, 0, 248, 108);

        menuAdd.setText("ADD");

        menuItemNewRol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNewRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        menuItemNewRol.setText("NEW ROL");
        menuItemNewRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewRolActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewRol);

        menuItemNewDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configure_user_16726.png"))); // NOI18N
        menuItemNewDate.setText("NEW DATE");
        menuItemNewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewDateActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewDate);

        jMenuBar1.add(menuAdd);

        menuCrud.setText("CRUD");

        menuItemCRUDRoles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCRUDRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configure_user_16726.png"))); // NOI18N
        menuItemCRUDRoles.setText("CRUD ROLES");
        menuItemCRUDRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDRolesActionPerformed(evt);
            }
        });
        menuCrud.add(menuItemCRUDRoles);

        menuItemCRUDDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        menuItemCRUDDates.setText("CRUD DATES");
        menuItemCRUDDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDDatesActionPerformed(evt);
            }
        });
        menuCrud.add(menuItemCRUDDates);

        jMenuBar1.add(menuCrud);

        menuInformation.setText("INFORMATION");

        menuItemAdvances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food.png"))); // NOI18N
        menuItemAdvances.setText("ADVANCES");
        menuItemAdvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdvancesActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemAdvances);

        menuItemDatingHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ejercicio.png"))); // NOI18N
        menuItemDatingHistory.setText("DATING HISTORY");
        menuItemDatingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDatingHistoryActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemDatingHistory);

        menuItemFoodPlans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food2.png"))); // NOI18N
        menuItemFoodPlans.setText("FOOD PLANS");
        menuItemFoodPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFoodPlansActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemFoodPlans);

        jMenuBar1.add(menuInformation);

        menuOptions.setText("OPTIONS");
        menuOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsActionPerformed(evt);
            }
        });

        menuItemSignOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSignOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salida.png"))); // NOI18N
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
        Main m = new Main();
        m.setVisible(true);
        dispose();    }//GEN-LAST:event_menuOptionsActionPerformed

    private void menuItemSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOffActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSignOffActionPerformed

    private void menuItemNewRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewRolActionPerformed
        NewRol nR = new NewRol();
        nR.show();
        nR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemNewRolActionPerformed

    private void menuItemCRUDRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDRolesActionPerformed
        CRUD cR = new CRUD();
        cR.show();
        cR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemCRUDRolesActionPerformed

    private void menuItemNewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewDateActionPerformed
        AdministratorDates aD = new AdministratorDates();
        aD.show();
        aD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemNewDateActionPerformed

    private void menuItemCRUDDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDDatesActionPerformed
        CRUDAdministratorDates cA = new CRUDAdministratorDates();
        cA.show();
        cA.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemCRUDDatesActionPerformed

    private void menuItemFoodPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFoodPlansActionPerformed
        FoodPlans fP = new FoodPlans();
        fP.show();
        fP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    }//GEN-LAST:event_menuItemFoodPlansActionPerformed
 
    private void menuItemAdvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdvancesActionPerformed
        Advances aS = new Advances();
        aS.show();
        aS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemAdvancesActionPerformed

    private void menuItemDatingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDatingHistoryActionPerformed
        DatingHistory dH = new DatingHistory();
        dH.show();
        dH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuItemDatingHistoryActionPerformed


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
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lbSuperAdministrator;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenu menuCrud;
    private javax.swing.JMenu menuInformation;
    private javax.swing.JMenuItem menuItemAdvances;
    private javax.swing.JMenuItem menuItemCRUDDates;
    private javax.swing.JMenuItem menuItemCRUDRoles;
    private javax.swing.JMenuItem menuItemDatingHistory;
    private javax.swing.JMenuItem menuItemFoodPlans;
    private javax.swing.JMenuItem menuItemNewDate;
    private javax.swing.JMenuItem menuItemNewRol;
    private javax.swing.JMenuItem menuItemSignOff;
    private javax.swing.JMenu menuOptions;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/frutas13.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
