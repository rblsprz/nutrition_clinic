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
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author pc
 */
public class AdministratorNotes extends javax.swing.JFrame {

    /**
     * Creates new form NotasAdmin
     */
     FondoPanel fondo = new FondoPanel();

       
    
        
    public AdministratorNotes() {
         this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(AdministratorNotes.MAXIMIZED_BOTH);
       
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
        getContentPane().setLayout(null);

        lbName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(110, 190, 60, 24);

        lbID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(150, 280, 25, 24);

        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(190, 270, 189, 50);
        getContentPane().add(tfID);
        tfID.setBounds(190, 360, 189, 50);

        lbWeight.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbWeight.setText("WEIGHT:");
        getContentPane().add(lbWeight);
        lbWeight.setBounds(750, 190, 140, 24);

        lbGrease.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGrease.setText("% GREASE:");
        getContentPane().add(lbGrease);
        lbGrease.setBounds(730, 340, 150, 24);

        lbMuscleMass.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbMuscleMass.setText("MUSCLE MASS:");
        getContentPane().add(lbMuscleMass);
        lbMuscleMass.setBounds(690, 550, 180, 24);

        lbHeight.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbHeight.setText("HEIGHT:");
        getContentPane().add(lbHeight);
        lbHeight.setBounds(760, 270, 130, 24);

        lbCustomerNotes.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes.setText("NEW DATA");
        getContentPane().add(lbCustomerNotes);
        lbCustomerNotes.setBounds(446, 35, 106, 37);
        getContentPane().add(txtPeso);
        txtPeso.setBounds(840, 180, 137, 40);

        tfHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHeightActionPerformed(evt);
            }
        });
        getContentPane().add(tfHeight);
        tfHeight.setBounds(840, 260, 137, 40);
        getContentPane().add(tfGrease);
        tfGrease.setBounds(840, 330, 137, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("AGE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 370, 46, 24);
        getContentPane().add(tfAge);
        tfAge.setBounds(190, 440, 189, 50);

        btnAddNutritionalInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnAddNutritionalInformation.setText("ADD NUTRITIONAL INFORMATION");
        btnAddNutritionalInformation.setBorderPainted(false);
        btnAddNutritionalInformation.setContentAreaFilled(false);
        btnAddNutritionalInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNutritionalInformationActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNutritionalInformation);
        btnAddNutritionalInformation.setBounds(740, 610, 251, 48);

        lbNotes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNotes.setText("NOTES:");
        getContentPane().add(lbNotes);
        lbNotes.setBounds(100, 560, 69, 24);

        tANotes.setColumns(20);
        tANotes.setRows(5);
        jScrollPane1.setViewportView(tANotes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 530, 268, 123);

        lbDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(120, 450, 56, 24);

        tfDate.setEditable(false);
        getContentPane().add(tfDate);
        tfDate.setBounds(186, 179, 189, 50);
        getContentPane().add(tfBodyMassIndex);
        tfBodyMassIndex.setBounds(840, 470, 137, 40);

        lbBodyMassIndex.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbBodyMassIndex.setText("BODY MASS INDEX:");
        getContentPane().add(lbBodyMassIndex);
        lbBodyMassIndex.setBounds(660, 480, 200, 24);
        getContentPane().add(tfBodyWater);
        tfBodyWater.setBounds(840, 400, 137, 40);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("% BODY WATER:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(680, 410, 180, 24);
        getContentPane().add(tfMuscleMass);
        tfMuscleMass.setBounds(840, 540, 145, 40);

        lbCustomerNotes1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes1.setText("CUSTOMER NUTRITIONAL INFORMATION");
        getContentPane().add(lbCustomerNotes1);
        lbCustomerNotes1.setBounds(664, 107, 371, 37);

        lbCustomerNotes2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbCustomerNotes2.setText("CUSTOMER DATA");
        getContentPane().add(lbCustomerNotes2);
        lbCustomerNotes2.setBounds(229, 107, 204, 37);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(412, 888, 1241, 0);

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

     class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos16.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
