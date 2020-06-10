package GUI;

import Logic.Customers;
import Logic.Logic;
import Logic.Files;
import Logic.Roles;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class NewRol extends javax.swing.JFrame {

    /**
     * Creates new form nuevoUsuario
     */
    public NewRol() {
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

        lbName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        cbRoles = new javax.swing.JComboBox<>();
        lbRoles = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lbLastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        lbUserName = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbName.setText("NAME:");

        lbPassword.setText("PASSWORD:");

        cbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "CUSTOMER" }));
        cbRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRolesMouseClicked(evt);
            }
        });
        cbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolesActionPerformed(evt);
            }
        });

        lbRoles.setText("ROLES:");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnRegistrar.setText("   Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbLastName.setText("LAST NAME:");

        lbPhone.setText("PHONE:");

        lbID.setText("ID:");

        lbUserName.setText("USERNAME:");

        lbAge.setText("AGE:");

        lbEmail.setText("EMAIL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(lbName)
                            .addComponent(lbLastName)
                            .addComponent(lbUserName)
                            .addComponent(lbPassword)
                            .addComponent(lbAge)
                            .addComponent(lbPhone)
                            .addComponent(lbEmail)
                            .addComponent(lbRoles))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbRoles, javax.swing.GroupLayout.Alignment.LEADING, 0, 293, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName)
                            .addComponent(tfLastName))
                        .addGap(18, 18, 18)
                        .addComponent(lbMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLastName)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUserName)
                            .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPassword)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAge)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPhone)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(lbEmail))
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRoles)
                    .addComponent(cbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lbMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (tfID.getText().equals("") || tfName.getText().equals("") || tfLastName.getText().equals("") || tfUserName.getText().equals("") || tfPassword.getText().equals("") || tfEmail.getText().equals("")) {
            lbMensajes.setText("FILL THE DATA!");
        }//End if
        else{
            int rol = 0;
            if (cbRoles.getSelectedItem().toString() == "ADMINISTRATOR") {
                rol = 2;
            }//End if 
            else {
                rol = 3;
            }//End else

            Customers cU = new Customers();
            Logic l = new Logic();
            Roles r = new Roles(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol);
            cU.add(r);
            try {
                if (cU.createCliente(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol) == true) {
                    l.insertCustomer(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol);
                    lbMensajes.setText("SUCCESFUL PROCEDURE!");
                    tfID.setText("");
                    tfName.setText("");
                    tfLastName.setText("");
                    tfUserName.setText("");
                    tfPassword.setText("");
                    tfAge.setText("");
                    tfPhone.setText("");
                    tfEmail.setText("");

                } else if (cU.createCliente(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol) == false) {

                    lbMensajes.setText("USER ALREADY EXISTS!");
                }

            } catch (FileNotFoundException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }//end try/catch
        }//End else
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRolesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolesMouseClicked

    private void cbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolesActionPerformed

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
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbRoles;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMensajes;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRoles;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
