package GUI;

import Logic.QueueMethods;
import Logic.CustomerNotes;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import Logic.UserNotes;
import java.awt.Color;


/**
 *
 * @author pc
 */
public class AdministratorNotes extends javax.swing.JFrame {

    /**
     * Creates new form NotasAdmin
     */
    public AdministratorNotes() {
        initComponents();
        this.setExtendedState(AdministratorNotes.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.cyan);
    }

    UserNotes queue = new UserNotes();
    QueueMethods queueQ = new QueueMethods();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        lbWeight = new javax.swing.JLabel();
        lbGrease = new javax.swing.JLabel();
        lbMuscleMass = new javax.swing.JLabel();
        lbHeight = new javax.swing.JLabel();
        lbCustomerNotes = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        tfHeight = new javax.swing.JTextField();
        tfGrease = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        btnAddNutritionalInformation = new javax.swing.JButton();
        lbNotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tANotes = new javax.swing.JTextArea();
        lbDate = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfBodyMassIndex = new javax.swing.JTextField();
        lbBodyMassIndex = new javax.swing.JLabel();
        tfBodyWater = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfMuscleMass = new javax.swing.JTextField();
        lbCustomerNotes1 = new javax.swing.JLabel();
        lbCustomerNotes2 = new javax.swing.JLabel();
        lbMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbName.setText("NAME:");

        lbID.setText("ID:");

        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });

        lbWeight.setText("WEIGHT:");

        lbGrease.setText("% GREASE:");

        lbMuscleMass.setText("MUSCLE MASS:");

        lbHeight.setText("HEIGHT:");

        lbCustomerNotes.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes.setText("ADVANCES");

        tfHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHeightActionPerformed(evt);
            }
        });

        jLabel8.setText("AGE:");

        btnAddNutritionalInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnAddNutritionalInformation.setText("ADD NUTRITIONAL INFORMATION");
        btnAddNutritionalInformation.setBorderPainted(false);
        btnAddNutritionalInformation.setContentAreaFilled(false);
        btnAddNutritionalInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNutritionalInformationActionPerformed(evt);
            }
        });

        lbNotes.setText("NOTES:");

        tANotes.setColumns(20);
        tANotes.setRows(5);
        jScrollPane1.setViewportView(tANotes);

        lbDate.setText("DATE:");

        tfDate.setEditable(false);

        lbBodyMassIndex.setText("BODY MASS INDEX:");

        jLabel14.setText("% BODY WATER:");

        lbCustomerNotes1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes1.setText("CUSTOMER NUTRITIONAL INFORMATION");

        lbCustomerNotes2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes2.setText("CUSTOMER DATES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(lbMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                .addGap(347, 347, 347))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCustomerNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(689, 689, 689))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCustomerNotes2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNotes)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbID)
                                        .addComponent(jLabel8))
                                    .addComponent(lbDate))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHeight)
                    .addComponent(lbWeight)
                    .addComponent(lbCustomerNotes1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAddNutritionalInformation))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbBodyMassIndex)
                                            .addComponent(lbMuscleMass)))
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMuscleMass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfBodyWater, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfGrease, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfBodyMassIndex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfHeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbGrease)
                            .addGap(214, 214, 214))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbCustomerNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCustomerNotes1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbWeight)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHeight))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbGrease)
                                    .addComponent(tfGrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfBodyWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfBodyMassIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBodyMassIndex))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMuscleMass)
                                    .addComponent(tfMuscleMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCustomerNotes2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbID))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbName)))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(lbNotes)))))))
                .addGap(14, 14, 14)
                .addComponent(btnAddNutritionalInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(lbMessages)
                .addGap(66, 66, 66))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNutritionalInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNutritionalInformationActionPerformed

        if (tfID.getText().equals("") || tfName.getText().equals("") || tfHeight.getText().equals("") || tfAge.getText().equals("") || tfGrease.getText().equals("") || tfBodyMassIndex.getText().equals("") || txtPeso.getText().equals("") || tfBodyWater.getText().equals("")) {
            lbMessages.setText("PLEASE FILL THE DATA!");
        }//End if
        else {
            try {

                CustomerNotes cita = new CustomerNotes(tfID.getText(), tfName.getText(), tANotes.getText(), Double.parseDouble(txtPeso.getText()), Double.parseDouble(tfMuscleMass.getText()), Double.parseDouble(tfGrease.getText()), Double.parseDouble(tfHeight.getText()), Integer.parseInt(tfAge.getText()) , Double.parseDouble(tfBodyMassIndex.getText()), Double.parseDouble(tfBodyWater.getText()) , tfDate.getText());
                    //queueQ.Enqueue(cita, 1);
                    queue.notasPacienteInsertar(tfID.getText(), tfName.getText(), tANotes.getText(), Double.parseDouble(txtPeso.getText()), Double.parseDouble(tfMuscleMass.getText()), Double.parseDouble(tfGrease.getText()), Double.parseDouble(tfHeight.getText()), Integer.parseInt(tfAge.getText()), Double.parseDouble(tfBodyMassIndex.getText()), Double.parseDouble(tfBodyWater.getText()), tfDate.getText());

                tANotes.setText("");
                tfHeight.setText("");
                tfID.setText("");
                tfAge.setText("");
                tfGrease.setText("");
                tfName.setText("");
                txtPeso.setText("");
                tfDate.setText("");
                tfBodyWater.setText("");
                tfBodyMassIndex.setText("");
                tfMuscleMass.setText("");
            } catch (FileNotFoundException ex) {
                lbMessages.setText("¡ERROR! WE CAN'T SAVE THE INFORMATION!");
            }
            lbMessages.setText("SUCCESSFULLY PROCEDURE!");

        }
    }//GEN-LAST:event_btnAddNutritionalInformationActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate
        String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto
        tfDate.setText(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHeightActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNutritionalInformation;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBodyMassIndex;
    private javax.swing.JLabel lbCustomerNotes;
    private javax.swing.JLabel lbCustomerNotes1;
    private javax.swing.JLabel lbCustomerNotes2;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbGrease;
    private javax.swing.JLabel lbHeight;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbMuscleMass;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNotes;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JTextArea tANotes;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBodyMassIndex;
    private javax.swing.JTextField tfBodyWater;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfGrease;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMuscleMass;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
