/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.CustomerNotes;
import Logic.Roles;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Logic.ExportarExcel;
import Logic.Logic;
import Logic.FileQueuesLog;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class NotesCustomer extends javax.swing.JFrame {

    /**
     * Creates new form VerNotasCliente
     */
     FondoPanel fondo = new FondoPanel();

       
         
    public NotesCustomer() {
        this.setContentPane(fondo);
        initComponents();
         this.setExtendedState(NotesCustomer.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRegistratedNotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnShowNotes = new javax.swing.JButton();
        lbMessages = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRegistratedNotes.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbRegistratedNotes.setText("MY ADVANCES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "NOTES", "WEIGHT", "MUSCLE MASS", "% GREASE", "HEIGHT", "AGE", "BODY MASS INDEX", "% WATER", "DATE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnShowNotes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnShowNotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnShowNotes.setText("SHOW NOTES");
        btnShowNotes.setBorderPainted(false);
        btnShowNotes.setContentAreaFilled(false);
        btnShowNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNotesActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(852, 852, 852)
                .addComponent(lbRegistratedNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(803, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShowNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(774, 774, 774))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lbRegistratedNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMessages)
                .addGap(18, 18, 18)
                .addComponent(btnShowNotes)
                .addContainerGap(595, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNotesActionPerformed
        
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();
        String cedula = "";
        
        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            cedula = array.get(j).getCedula(); //Obtengo la cedula del usuario activo
        }
        
        FileQueuesLog fl = new FileQueuesLog();
        if(fl.readingFiles(cedula) == true){          
            try {
                searchClienteIndividual(cedula);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CRUDNotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
        lbMessages.setText("NOT FOUND!");
        }
    }//GEN-LAST:event_btnShowNotesActionPerformed
    
    public void searchClienteIndividual(String cedula) throws FileNotFoundException{
        Logic lC = new Logic();
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        CustomerNotes tempCountries[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempCountries.length; i++) {
            if (tempCountries[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempCountries[i]);
            } 
        }

        String matriz[][]= new String[individual.size()][11];
        
        for (int i = 0; i < individual.size(); i++) {
            
        int edad = individual.get(i).getEdad();
        double peso = individual.get(i).getPeso();
        double musculo = individual.get(i).getMusculo();
        double grasa = individual.get(i).getGrasa();
        double altura = individual.get(i).getAltura();
        double masaCorporal = individual.get(i).getMasaCorporal();
        double agua = individual.get(i).getAgua();
        
        matriz[i][0]= individual.get(i).getCedula();
        matriz[i][1]= individual.get(i).getNombre();
        matriz[i][2]= individual.get(i).getNotas();
        matriz[i][3]= String.valueOf(peso);
        matriz[i][4]= String.valueOf(musculo);
        matriz[i][5]= String.valueOf(grasa);
        matriz[i][6]= String.valueOf(altura);
        matriz[i][7]= String.valueOf(edad);
        matriz[i][8]= String.valueOf(masaCorporal);
        matriz[i][9]= String.valueOf(agua);
        matriz[i][10]= individual.get(i).getFecha();
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "ID","NAME", "NOTES", "WEIGHT", "MUSCLE MASS", "% GREASE", "HEIGHT", "AGE", "MUSCLE MASS INDEX", "% WATER", "DATE"
            }
        ));
        }   
    }
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
            java.util.logging.Logger.getLogger(NotesCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotesCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotesCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotesCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotesCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowNotes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbRegistratedNotes;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos11.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
