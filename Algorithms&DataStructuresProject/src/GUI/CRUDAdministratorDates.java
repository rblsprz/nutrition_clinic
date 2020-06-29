/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import Logic.Update;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Logic.Cita;
import Logic.Delete;
import Logic.ExportarExcel;
import Logic.FileStacks;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTable;
import Logic.History;

import static GUI.CRUD.JTable1;
import Logic.Roles;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class CRUDAdministratorDates extends javax.swing.JFrame {

    /**
     * Creates new form CRUDAdministratorDates
     */
    FondoPanel fondo = new FondoPanel();

    public CRUDAdministratorDates() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(CRUD.MAXIMIZED_BOTH);
    }

    Logic Stack = new Logic();
    Delete stack = new Delete();
    FileStacks stack1 = new FileStacks();
    //ExportExcel obj;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShowDates = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbMessages = new javax.swing.JLabel();
        comboHoras = new javax.swing.JComboBox<>();
        jToggleButton2 = new javax.swing.JToggleButton();
        btnPDF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "NAME", "ID"
            }
        ));
        jTableAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAdmin);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(80, 40, 438, 360);

        lbName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(560, 70, 70, 24);

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNameKeyTyped(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(620, 60, 219, 40);

        lbID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(580, 140, 50, 24);

        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIDKeyTyped(evt);
            }
        });
        getContentPane().add(tfID);
        tfID.setBounds(620, 130, 219, 40);

        lbDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(560, 210, 110, 24);

        lbTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(560, 270, 110, 24);

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(720, 420, 150, 41);

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(910, 420, 140, 41);

        btnShowDates.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnShowDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnShowDates.setText("SHOW DATES");
        btnShowDates.setBorderPainted(false);
        btnShowDates.setContentAreaFilled(false);
        btnShowDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDatesActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowDates);
        btnShowDates.setBounds(440, 420, 250, 41);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(620, 200, 219, 40);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(560, 370, 290, 0);

        comboHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboHorasMouseClicked(evt);
            }
        });
        comboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHorasActionPerformed(evt);
            }
        });
        getContentPane().add(comboHoras);
        comboHoras.setBounds(620, 270, 90, 40);

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Excel_2013_23480.png"))); // NOI18N
        jToggleButton2.setText("Excel");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(820, 490, 160, 50);

        btnPDF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnPDF.setText("PDF");
        btnPDF.setBorderPainted(false);
        btnPDF.setContentAreaFilled(false);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnPDF);
        btnPDF.setBounds(630, 490, 120, 41);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setText("DATES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(950, 10, 61, 24);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTableAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdminMouseClicked
        int seleccion = jTableAdmin.getSelectedRow();
//        tfDate.setText(jTable3.getValueAt(seleccion, 0).toString());
//        tfTime.setText(jTable3.getValueAt(seleccion, 1).toString());
        tfName.setText(jTableAdmin.getValueAt(seleccion, 2).toString());
        tfID.setText(jTableAdmin.getValueAt(seleccion, 3).toString());
        // jDateChooser1.setDateFormatString(jTable3.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_jTableAdminMouseClicked

     public String getPersona() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();
        String persona = "";

        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            persona = array.get(j).getNombre() + " - " + array.get(j).getCedula(); //Obtengo la cedula del usuario activo
        }
        return persona;
    }

    public void mostrarCitas() {
        Logic lC = new Logic();
        ArrayList<Cita> array = new ArrayList();

        Cita tempCountries[] = lC.readRegistersFilesCita();

        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor

        String matriz[][] = new String[array.size()][4];

        for (int i = 0; i < array.size(); i++) {
            matriz[i][0] = array.get(i).getFecha();
            matriz[i][1] = array.get(i).getHora();
            matriz[i][2] = array.get(i).getNombre();
            matriz[i][3] = array.get(i).getCedula();


            jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(

                    matriz,
                    new String[]{
                        "DATE", "TIME", "NAME", "ID"
                    }
            ));
        }
    }
    private void btnShowDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDatesActionPerformed
        mostrarCitas();
        String tempCountries[] = Stack.readRegistersFilesHoras();

        for (String num : tempCountries) {
            comboHoras.addItem(num);
        }
    }//GEN-LAST:event_btnShowDatesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
  int seleccion = jTableAdmin.getSelectedRow();
            String dia=Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes=Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
            String year=Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
            String fecha=(year+"-"+mes+"-"+dia); 
        try {
                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar la cita de " + tfName.getText() + " ?");
                if(edit == 0){
                    if(Stack.searchCita(fecha, comboHoras.getSelectedItem().toString()) == false){
                    Cita cita1 = new Cita(jTableAdmin.getValueAt(seleccion, 0).toString(), jTableAdmin.getValueAt(seleccion, 1).toString(), tfID.getText(), tfName.getText());
                    Cita cita2 = new Cita(fecha, comboHoras.getSelectedItem().toString(), tfID.getText(), tfName.getText());
                    stack1.insertCita(cita2);
                    em.ModifuUse(cita1, fecha, comboHoras.getSelectedItem().toString());
                    stack.removeLinesPila(jTableAdmin.getValueAt(seleccion, 0).toString(), jTableAdmin.getValueAt(seleccion, 1).toString());
                    //em.actualizarCita(fecha, txtHora.getText(), txtPaciente.getText(), txtCedul.getText());
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                    mostrarCitas();
                    
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Modifico la cita de "+tfID.getText() , getPersona());
                    Stack.insertHistorialAcciones(c);
                    
                    tfID.setText("");
                    tfName.setText("");
//                    txtHora.setText("");
                   } else {
                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
            }
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

              int seleccion = jTableAdmin.getSelectedRow();
        try {
                Delete stack = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la cita de " + tfName.getText() + " de este archivo?");
                if(d == 0){
                    stack.removeLinesPila(jTableAdmin.getValueAt(seleccion, 0).toString(), jTableAdmin.getValueAt(seleccion, 1).toString()); //FECHA - HORA
                    //stack.borrarCita("citas.txt", txtFecha.getText(), txtHora.getText());
                    JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                    mostrarCitas();
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Elimino la cita de " + tfID.getText() , getPersona());
                    Stack.insertHistorialAcciones(c);
                    
                    tfID.setText("");
//                    txtFecha.setText("");
//                    txtHora.setText("");
                    tfName.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void comboHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboHorasMouseClicked

    }//GEN-LAST:event_comboHorasMouseClicked


    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        MessageFormat header=new MessageFormat("Registro de citas");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            jTableAdmin.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (PrinterException ex) {
            System.err.format("error de impresion", ex.getMessage());
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed
void impresion() {
        JFileChooser seleccionar = new JFileChooser();
        File archivo;
        if (seleccionar.showDialog(null, "Exportar Excel") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            String imagen = archivo + ".xls";
            File file = new File(imagen);
            ExportarExcel excel = new ExportarExcel(jTableAdmin, file, "" + "tablaimporte");
            excel.export(); 
        }
    }
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        impresion();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
       MessageFormat header=new MessageFormat("Registro de citas");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            jTableAdmin.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("error de impresion", ex.getMessage());
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void tfIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_tfIDKeyTyped

    private void tfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyTyped

        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z')) evt.consume();
    }//GEN-LAST:event_tfNameKeyTyped

    private void comboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHorasActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDAdministratorDates().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnShowDates;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboHoras;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTableAdmin;
    private javax.swing.JToggleButton jToggleButton2;
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

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos5.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
