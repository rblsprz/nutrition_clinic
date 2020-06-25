/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.CRUDNotes;
import GUI.Customer;
import Logic.Roles;
import Logic.Plans;
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
public class FoodPlanCustomer extends javax.swing.JFrame {

    /**
     * Creates new form PlanAlimenCliente
     */
    FondoPanel fondo = new FondoPanel();

       
    public FoodPlanCustomer() {
         this.setContentPane(fondo);
        initComponents();
         this.setExtendedState(FoodPlanCustomer.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPersonalFoodPlan = new javax.swing.JLabel();
        lbBreakFast = new javax.swing.JLabel();
        tfBreakFast = new javax.swing.JTextField();
        lbLunch = new javax.swing.JLabel();
        tfLunch = new javax.swing.JTextField();
        lbDinner = new javax.swing.JLabel();
        tfDinner = new javax.swing.JTextField();
        lbSnacks = new javax.swing.JLabel();
        tfSnacks = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnShowPlans = new javax.swing.JButton();
        lbMessages = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPersonalFoodPlan.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbPersonalFoodPlan.setText("MY FOOD PLANS");

        lbBreakFast.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbBreakFast.setText("BREAKFAST");

        tfBreakFast.setEditable(false);

        lbLunch.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbLunch.setText("LUNCH");

        tfLunch.setEditable(false);

        lbDinner.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbDinner.setText("DINNER");

        tfDinner.setEditable(false);

        lbSnacks.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbSnacks.setText("SNACKS");

        tfSnacks.setEditable(false);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BREAKFAST", "LUNCH", "DINNER", "SNACKS"
            }
        ));
        jTable1.setFocusCycleRoot(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        btnShowPlans.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnShowPlans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnShowPlans.setText("SHOW FOOD PLAN");
        btnShowPlans.setBorderPainted(false);
        btnShowPlans.setContentAreaFilled(false);
        btnShowPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPlansActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbPersonalFoodPlan)
                                        .addGap(424, 424, 424))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(btnShowPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(367, 367, 367))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPersonalFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tfBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lbLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(lbDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShowPlans)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMessages)
                .addContainerGap(670, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccion = jTable1.getSelectedRow();
        //(jTable1.getValueAt(seleccion, 0).toString()); ESPACIO DE FECHA
//        txtCedula.setText(jTable1.getValueAt(seleccion, 1).toString());
        tfBreakFast.setText(jTable1.getValueAt(seleccion, 2).toString());
        tfLunch.setText(jTable1.getValueAt(seleccion, 3).toString());
        tfDinner.setText(jTable1.getValueAt(seleccion, 4).toString());
        tfSnacks.setText(jTable1.getValueAt(seleccion, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnShowPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPlansActionPerformed
        
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
            if(fl.readingFilesPlanes(cedula) == true){          
            try {
                searchClienteIndividual(cedula);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CRUDNotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
        lbMessages.setText("NOT FOUND!");
            }
    }//GEN-LAST:event_btnShowPlansActionPerformed
        //Busca al cliente en los registros si lo encuentra lo va a mostra en la tabla
    public void searchClienteIndividual(String cedula) throws FileNotFoundException{
        Logic lC = new Logic();
        ArrayList <Plans> individual = new ArrayList();
        
        Plans tempCountries[] = lC.readRegistersFilesPlanes();
        for (int i = 0; i < tempCountries.length; i++) {
            if (tempCountries[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempCountries[i]);
            } 
        }

        String matriz[][]= new String[individual.size()][6];
       
         for (int i = 0; i < individual.size(); i++) {
        
        matriz[i][0]= individual.get(i).getFecha();
        matriz[i][1]= individual.get(i).getCedula();
        matriz[i][2]= individual.get(i).getDesayuno();
        matriz[i][3]= individual.get(i).getAlmuerzo();
        matriz[i][4]= individual.get(i).getCena();
        matriz[i][5]= individual.get(i).getMeriendas();
       
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "DATE","ID","BREAKFAST", "LUNCH", "DINNER", "SNACKS"
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
            java.util.logging.Logger.getLogger(FoodPlanCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodPlanCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodPlanCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodPlanCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodPlanCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowPlans;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbBreakFast;
    private javax.swing.JLabel lbDinner;
    private javax.swing.JLabel lbLunch;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbPersonalFoodPlan;
    private javax.swing.JLabel lbSnacks;
    private javax.swing.JTextField tfBreakFast;
    private javax.swing.JTextField tfDinner;
    private javax.swing.JTextField tfLunch;
    private javax.swing.JTextField tfSnacks;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos17.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
