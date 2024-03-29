/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Cita;
import Logic.Logic;
import Logic.Roles;
import Logic.FileStacks;
import Logic.NodeStacks;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class CustomerDate extends javax.swing.JFrame {

    /**
     * Creates new form CitaCliente
     */
    FondoPanel fondo = new FondoPanel();

    public CustomerDate() {
        this.setContentPane(fondo);

        initComponents();
        this.setExtendedState(CustomerDate.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfID = new javax.swing.JTextField();
        lbTime = new javax.swing.JLabel();
        cbmHora = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbDate = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbClickHere = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfID.setEditable(false);
        getContentPane().add(tfID);
        tfID.setBounds(960, 410, 171, 40);

        lbTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(820, 530, 90, 20);

        cbmHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cbmHora);
        cbmHora.setBounds(970, 520, 90, 40);

        btnRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnRequest.setText("REQUEST");
        btnRequest.setBorderPainted(false);
        btnRequest.setContentAreaFilled(false);
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequest);
        btnRequest.setBounds(900, 610, 240, 60);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(960, 460, 160, 50);

        lbDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(820, 480, 80, 20);

        lbName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(820, 350, 90, 30);

        lbID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(820, 420, 80, 20);

        tfName.setEditable(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(960, 350, 170, 40);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(150, 300, 310, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 720, 1300, 360);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1300, 720, 740, 360);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1300, 320);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1300, 0, 750, 320);

        lbClickHere.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbClickHere.setText("CLICK HERE");
        getContentPane().add(lbClickHere);
        lbClickHere.setBounds(1160, 350, 140, 24);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Main uR = new Main();
    FileStacks stack = new FileStacks();
    Logic Stack = new Logic();

    public void mostrarNombre() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            tfID.setText(array.get(j).getCedula().trim());
            tfName.setText(array.get(j).getNombre().trim());

        }
    }


    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed

//Campos vacios validacion
        String dia = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes + "-" + dia);

        if (tfID.getText().equals("") || tfName.getText().equals("") || cbmHora.getSelectedItem().equals("") || dateChooser.getDate().equals("")) {
            lbMessages.setText("FILL THE DATA!");
        }//End if
        else {
            if (Stack.searchCita(fecha, cbmHora.getSelectedItem().toString()) == false) {
                NodeStacks pila = new NodeStacks();
                Cita cita = new Cita(fecha, cbmHora.getSelectedItem().toString(), tfID.getText(), tfName.getText());

                //pila.push(fecha,cbmHora.getSelectedItem().toString(), tfName.getText(), tfID.getText());
                stack.insertCita(cita);
                JOptionPane.showMessageDialog(null,"REGISTRATED DATE!");
            } else {
                JOptionPane.showMessageDialog(null,"THE DATE AND TIME AREN'T AVAILABLE!");
            }
        }

        //else
        //           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        mostrarNombre();
        Logic lC = new Logic();
        String tempCountries[] = lC.readRegistersFilesHoras();

        for (String num : tempCountries) {
            cbmHora.addItem(num);
        }
    }//GEN-LAST:event_tfNameMouseClicked

    private void cbmHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmHoraActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cbmHora;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbClickHere;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
