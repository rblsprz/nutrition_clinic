/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Customer;
import Logic.Cita;
import Logic.Delete;
import Logic.FileStacks;
import Logic.Logic;
import Logic.Roles;
import Logic.Update;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author pc
 */
public class CRUDCustomerDates extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_CLIENTE_CITAS
     */
    FondoPanel fondo = new FondoPanel();
    public CRUDCustomerDates() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(CRUDCustomerDates.MAXIMIZED_BOTH);
    }
    Delete stack = new Delete();
    
    FileStacks stack1=new FileStacks();
    Logic Stack = new Logic();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnShowDates = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbDatesRegisters = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbMessages = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        comboHoras3 = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "NAME", "ID"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(28, 91, 438, 164);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(152, 301, 89, 29);

        btnShowDates.setText("SHOW DATES");
        btnShowDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDatesActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowDates);
        btnShowDates.setBounds(293, 301, 133, 29);

        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(556, 94, 49, 20);
        getContentPane().add(tfDate);
        tfDate.setBounds(556, 287, 178, 26);

        tfName.setEditable(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(623, 91, 181, 26);

        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(556, 143, 23, 20);

        tfID.setEditable(false);
        getContentPane().add(tfID);
        tfID.setBounds(623, 140, 181, 26);

        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(556, 191, 45, 20);

        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(556, 238, 43, 20);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(28, 301, 93, 29);

        lbDatesRegisters.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbDatesRegisters.setText("DATES REGISTERS");
        getContentPane().add(lbDatesRegisters);
        lbDatesRegisters.setBounds(590, 20, 215, 37);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(627, 194, 178, 26);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(144, 348, 282, 22);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(546, 348, 0, 0);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(637, 16, 0, 0);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2);
        jButton2.setBounds(462, 398, 194, 193);

        comboHoras3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboHoras3MouseClicked(evt);
            }
        });
        getContentPane().add(comboHoras3);
        comboHoras3.setBounds(620, 240, 120, 26);

        jToggleButton1.setText("PDF");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(30, 380, 61, 29);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int seleccion = jTable3.getSelectedRow();
       // tfTime.setText(jTable3.getValueAt(seleccion, 1).toString());
        tfID.setText(jTable3.getValueAt(seleccion, 3).toString());
        tfName.setText(jTable3.getValueAt(seleccion, 2).toString());
       // tfDate.setText(jTable3.getValueAt(seleccion, 0).toString());
        // jDateChooser1.setDateFormatString(jTable3.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_jTable3MouseClicked
    
      public void mostrarNombre(){
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();
        
        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
        tfID.setText(array.get(j).getCedula());
        tfName.setText(array.get(j).getNombre());
        }
    }
    
      //Busca al cliente en los registros si lo encuentra lo va a mostra en la tabla
    public void searchClienteIndividual(String cedula) throws FileNotFoundException{
         Logic lC = new Logic();
        ArrayList <Cita> individual = new ArrayList();
        Cita[] c = lC.readRegistersFilesCita();
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(c[i]);
            } 
        }
        
        String matriz[][]= new String[individual.size()][4];
        
        for (int i = 0; i < individual.size(); i++) {
        matriz[i][0]= individual.get(i).getFecha();
        matriz[i][1]= individual.get(i).getHora();
        matriz[i][2]= individual.get(i).getNombre();
        matriz[i][3]= individual.get(i).getCedula();
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "DATE","TIME", "NAME", "ID"
            }
        ));
        }   
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          int seleccion = jTable3.getSelectedRow();
        try {
            int d = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE " + tfID.getText()+ " ?");
            if(d == 0){
                stack.removeLinesPila(jTable3.getValueAt(seleccion, 0).toString(), jTable3.getValueAt(seleccion, 1).toString());
                searchClienteIndividual(tfID.getText());
                JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                tfID.setText("");
                tfName.setText("");
            }
        }catch (IOException ex) {
            lbMessages.setText("DELETE ERROR!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnShowDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDatesActionPerformed
        try {
            mostrarNombre();
            searchClienteIndividual(tfID.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CRUDCustomerDates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowDatesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int seleccion = jTable3.getSelectedRow();
        String dia=Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes=Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
        String year=Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
        String fecha=(year+"-"+mes+"-"+dia);

        try {
            Update em = new Update();
            int edit = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO UPDATE " + tfID.getText()+ " ?");
            if(edit == 0){
                 if(Stack.searchCita(fecha, jTable3.getValueAt(seleccion, 1).toString()) == false){
                    Cita cita1 = new Cita(jTable3.getValueAt(seleccion, 0).toString(), jTable3.getValueAt(seleccion, 1).toString(), tfID.getText(), tfName.getText());
                    Cita cita2 = new Cita(fecha, comboHoras3.getSelectedItem().toString(), tfID.getText(), tfName.getText());
                    stack1.insertCita(cita2);
                    em.ModifuUse(cita1, fecha, comboHoras3.getSelectedItem().toString());
                    stack.removeLinesPila(tfDate.getText(), jTable3.getValueAt(seleccion, 1).toString());
                    //em.actualizarCita2(fecha, txtHora.getText(), txtPaciente.getText(), txtCedul.getText());
                    searchClienteIndividual(tfID.getText());
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO"); 
                    lbMessages.setText("SUCCESSFULLY UPDATED!");
                    tfID.setText("");
                    tfName.setText("");
//                    tfTime.setText("");
//                    tfDate.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "THE DATA AND TIME AREN'T AVAILABLE!");
                }
            }
        }catch (IOException ex) {
            lbMessages.setText("UPDATE ERROR!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        mostrarNombre();
    }//GEN-LAST:event_tfNameMouseClicked

    private void comboHoras3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboHoras3MouseClicked

    }//GEN-LAST:event_comboHoras3MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
MessageFormat header=new MessageFormat("Citas personal");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            jTable3.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
        System.err.format("error de impresion", ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(CRUDCustomerDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDCustomerDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDCustomerDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDCustomerDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDCustomerDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowDates;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboHoras3;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDatesRegisters;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfDate;
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
