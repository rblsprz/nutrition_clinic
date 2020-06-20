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
 * @author David Robles
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    FondoPanel fondo = new FondoPanel();

    public Administrator() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(Administrator.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdd = new javax.swing.JMenu();
        menuItemNewDate = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuCRUD = new javax.swing.JMenu();
        menuItemCRUDDates = new javax.swing.JMenuItem();
        menuInformation = new javax.swing.JMenu();
        menuItemAdvances = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuItemSignOff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        menuAdd.setText("ADD");

        menuItemNewDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user2.png"))); // NOI18N
        menuItemNewDate.setText("NEW DATE");
        menuItemNewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewDateActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewDate);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jMenuItem1.setText("NEW DATA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAdd.add(jMenuItem1);

        jMenuBar1.add(menuAdd);

        menuCRUD.setText("CRUD");

        menuItemCRUDDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configure_user_16726.png"))); // NOI18N
        menuItemCRUDDates.setText("CRUD DATES");
        menuItemCRUDDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDDatesActionPerformed(evt);
            }
        });
        menuCRUD.add(menuItemCRUDDates);

        jMenuBar1.add(menuCRUD);

        menuInformation.setText("INFORMATION");

        menuItemAdvances.setText("ADVANCES");
        menuItemAdvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdvancesActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemAdvances);

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
        dispose();
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

    private void menuItemCRUDDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDDatesActionPerformed
        CRUDAdministratorDates cR = new CRUDAdministratorDates();
        cR.show();
        cR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemCRUDDatesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        AdministratorNotes nC = new AdministratorNotes();
//        nC.show();
//        nC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemAdvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdvancesActionPerformed
        AdministratorNotes nC = new AdministratorNotes();
        nC.show();
        nC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemAdvancesActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenu menuCRUD;
    private javax.swing.JMenu menuInformation;
    private javax.swing.JMenuItem menuItemAdvances;
    private javax.swing.JMenuItem menuItemCRUDDates;
    private javax.swing.JMenuItem menuItemNewDate;
    private javax.swing.JMenuItem menuItemSignOff;
    private javax.swing.JMenu menuOptions;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/frutas2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }

}
