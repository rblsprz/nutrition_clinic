/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import Logic.Cita;
import Logic.FileStacks;
import Logic.NodeStacks;

/**
 *
 * @author pc
 */
public class AdministratorDates extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_CITAS
     */
    public AdministratorDates() {
        initComponents();
        this.setExtendedState(AdministratorDates.MAXIMIZED_BOTH);
    }
    
    FileStacks stack = new FileStacks();
    Logic Stack = new Logic();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        lbTime = new javax.swing.JLabel();
        cBTime = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbDate = new javax.swing.JLabel();
        lbMessages = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(890, 410, 90, 24);

        lbID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(920, 340, 90, 24);

        tfName.setBackground(new java.awt.Color(0, 102, 102));
        tfName.setOpaque(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(950, 400, 170, 40);

        tfID.setBackground(new java.awt.Color(0, 102, 102));
        tfID.setOpaque(false);
        tfID.setSelectionColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(tfID);
        tfID.setBounds(950, 330, 171, 40);

        lbTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(900, 580, 80, 20);

        cBTime.setBackground(new java.awt.Color(204, 204, 204));
        cBTime.setEditable(true);
        cBTime.setToolTipText("");
        cBTime.setOpaque(false);
        cBTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTimeActionPerformed(evt);
            }
        });
        getContentPane().add(cBTime);
        cBTime.setBounds(950, 570, 120, 40);

        btnRequest.setBackground(new java.awt.Color(255, 255, 255));
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
        btnRequest.setBounds(940, 650, 150, 41);

        dateChooser.setBackground(new java.awt.Color(204, 204, 204));
        dateChooser.setForeground(new java.awt.Color(255, 255, 255));
        dateChooser.setOpaque(false);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(950, 480, 170, 50);

        lbDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(890, 490, 80, 24);

        lbMessages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(lbMessages);
        lbMessages.setBounds(0, 200, 2350, 560);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1300, 0, 780, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 760, 1300, 240);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frutas7.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1300, 760, 930, 240);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(830, 720, 240, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
//Campos vacios validacion
            String dia=Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes=Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
            String year=Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
            String fecha=(year+"-"+mes+"-"+dia);
            
        if (tfID.getText().equals("") || tfName.getText().equals("") || cBTime.getSelectedItem().equals("")) {
            lbMessages.setText("FILL THE DATA!");
        }//End if 
        else {
            if(Stack.searchCita(fecha, cBTime.getSelectedItem().toString()) == false){
            NodeStacks pila = new NodeStacks();  
            Cita cita = new Cita(fecha, cBTime.getSelectedItem().toString(), tfID.getText(), tfName.getText());            
//            pila.push(fecha,cbmHora.getSelectedItem().toString(), txtNombre.getText(), txtCedula.getText());
            stack.insertCita(cita);
            lbMessages.setText("REGISTRATED DATE!");
            } else {
                lbMessages.setText("THE DATA AND TIME AREN'T AVAILABLE!");
            }
        } 
        
        //else
//           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void cBTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBTimeActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
         Logic lC = new Logic();       
        String tempCountries[] = lC.readRegistersFilesHoras();

       for(String num : tempCountries){
           cBTime.addItem(num);
       }
    }//GEN-LAST:event_tfNameMouseClicked

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
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cBTime;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
