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
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class CRUD_ADMIN_CITAS extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_ADMIN_CITAS
     */
     FondoPanel fondo = new FondoPanel();
    public CRUD_ADMIN_CITAS() {
        this.setContentPane(fondo);
        initComponents();
    }
    
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
        jLabel1 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCedul = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 1500));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Nombre", "Cédula"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(15, 42, 438, 360);

        jLabel1.setText("Paciente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(536, 61, 64, 20);
        getContentPane().add(txtPaciente);
        txtPaciente.setBounds(626, 58, 219, 26);

        jLabel2.setText("Cédula: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(536, 110, 59, 20);
        getContentPane().add(txtCedul);
        txtCedul.setBounds(626, 107, 219, 26);

        Fecha.setText("Fecha:");
        getContentPane().add(Fecha);
        Fecha.setBounds(536, 161, 72, 20);

        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(536, 237, 40, 20);
        getContentPane().add(txtHora);
        txtHora.setBounds(626, 234, 219, 26);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(670, 299, 97, 29);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(776, 299, 91, 29);

        btnShow.setText("Mostrar Citas");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        getContentPane().add(btnShow);
        btnShow.setBounds(536, 299, 125, 29);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(626, 155, 219, 26);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salida.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 123, 33);
        getContentPane().add(txtFecha);
        txtFecha.setBounds(626, 197, 97, 26);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int seleccion = jTable3.getSelectedRow();
        txtFecha.setText(jTable3.getValueAt(seleccion, 0).toString());
        txtHora.setText(jTable3.getValueAt(seleccion, 1).toString());
        txtPaciente.setText(jTable3.getValueAt(seleccion, 2).toString());
        txtCedul.setText(jTable3.getValueAt(seleccion, 3).toString());
       // jDateChooser1.setDateFormatString(jTable3.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_jTable3MouseClicked
    
        public void mostrarCitas(){
        Logic lC = new Logic();
        ArrayList<Cita> array = new ArrayList();
        
        Cita tempCountries[] = lC.readRegistersFilesCita();
        
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
       
       String matriz[][]= new String[array.size()][4];
       
         for (int i = 0; i < array.size(); i++) {
        matriz[i][0]= array.get(i).getFecha();
        matriz[i][1]= array.get(i).getHora();
        matriz[i][2]= array.get(i).getNombre();
        matriz[i][3]= array.get(i).getCedula();
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Fecha","Hora", "Nombre", "Cédula"
            }
        ));
         } } 
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        mostrarCitas();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          
            String dia=Integer.toString(jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes=Integer.toString(jDateChooser1.getCalendar().get(Calendar.MONTH)+1);
            String year=Integer.toString(jDateChooser1.getCalendar().get(Calendar.YEAR));
            String fecha=(year+"-"+mes+"-"+dia);
        
        try {
                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar la cita de " + txtPaciente.getText() + " ?");
                if(edit == 0){
                    if(Stack.searchCita(fecha, txtHora.getText()) == false){
                    em.actualizarCita(fecha, txtHora.getText(), txtPaciente.getText(), txtCedul.getText());
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                    mostrarCitas();
                    txtCedul.setText("");
                    txtPaciente.setText("");
                    txtHora.setText("");
                   } else {
                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
            }
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Administrator sA=new Administrator();
        dispose();
        sA.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      try {
                Delete stack = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la cita de " + txtPaciente.getText() + " de este archivo?");
                if(d == 0){
                    stack.borrarCita("citas.txt", txtCedul.getText());
                    JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                    mostrarCitas();
                    txtCedul.setText("");
                    txtFecha.setText("");
                    txtHora.setText("");
                    txtPaciente.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }   
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_ADMIN_CITAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_ADMIN_CITAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_ADMIN_CITAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_ADMIN_CITAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_ADMIN_CITAS().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTextField txtCedul;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
    private Image imagen;
    
    public void paint(Graphics g){
    
        imagen = new ImageIcon(getClass().getResource("/Images/fondo1.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        
        super.paint(g);
    }
    
    
    }
}