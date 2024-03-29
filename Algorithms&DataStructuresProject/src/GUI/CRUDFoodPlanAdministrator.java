package GUI;

import GUI.Administrator;
import static GUI.CRUDAdministratorDates.jTableAdmin;
import GUI.CRUDNotes;
import Logic.History;
import Logic.Roles;
import Logic.Plans;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Logic.ExportarExcel;
import Logic.Logic;
import Logic.PlanNotes;
import Logic.Delete;
import Logic.Update;
import Logic.FileQueuesLog;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class CRUDFoodPlanAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form PlanAlimenticioCRUD
     */
    
    FondoPanel fondo = new FondoPanel();
    public CRUDFoodPlanAdministrator() {
         this.setContentPane(fondo);
          initComponents();
        this.setExtendedState(CRUDFoodPlanAdministrator.MAXIMIZED_BOTH);
      
        
    }
    
    PlanNotes queue = new PlanNotes();
    Logic Fl = new Logic();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSnacks = new javax.swing.JLabel();
        lbFoodPlans = new javax.swing.JLabel();
        lbDinner = new javax.swing.JLabel();
        lbLunch = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbBreakFast = new javax.swing.JLabel();
        btnAddFoodPlan = new javax.swing.JButton();
        btnDeleteFoodPlan = new javax.swing.JButton();
        btnUpdateFoodPlan = new javax.swing.JButton();
        btnShowFoodPlans = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfSearch = new javax.swing.JTextField();
        tfSnacks = new javax.swing.JTextField();
        tfBreakFast = new javax.swing.JTextField();
        tfLunch = new javax.swing.JTextField();
        tfDinner = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSnacks.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbSnacks.setText("SNACKS");
        getContentPane().add(lbSnacks);
        lbSnacks.setBounds(570, 860, 104, 37);

        lbFoodPlans.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbFoodPlans.setText("NEW FOOD PLAN");
        getContentPane().add(lbFoodPlans);
        lbFoodPlans.setBounds(660, 6, 194, 37);

        lbDinner.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbDinner.setText("DINNER");
        getContentPane().add(lbDinner);
        lbDinner.setBounds(570, 750, 104, 37);

        lbLunch.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbLunch.setText("LUNCH");
        getContentPane().add(lbLunch);
        lbLunch.setBounds(570, 650, 104, 37);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BREAKFAST", "LUNCH", "DINNER", "SNACKS"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(940, 520, 835, 307);

        lbBreakFast.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbBreakFast.setText("BREAKFAST");
        getContentPane().add(lbBreakFast);
        lbBreakFast.setBounds(570, 550, 121, 37);

        btnAddFoodPlan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddFoodPlan.setText("ADD FOOD PLAN");
        btnAddFoodPlan.setBorderPainted(false);
        btnAddFoodPlan.setContentAreaFilled(false);
        btnAddFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodPlanActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddFoodPlan);
        btnAddFoodPlan.setBounds(950, 870, 200, 40);

        btnDeleteFoodPlan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDeleteFoodPlan.setText("DELETE FOOD PLAN");
        btnDeleteFoodPlan.setBorderPainted(false);
        btnDeleteFoodPlan.setContentAreaFilled(false);
        btnDeleteFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodPlanActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteFoodPlan);
        btnDeleteFoodPlan.setBounds(1460, 870, 228, 40);

        btnUpdateFoodPlan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdateFoodPlan.setText("UPDATE FOOD PLAN");
        btnUpdateFoodPlan.setBorderPainted(false);
        btnUpdateFoodPlan.setContentAreaFilled(false);
        btnUpdateFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFoodPlanActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateFoodPlan);
        btnUpdateFoodPlan.setBounds(1190, 870, 240, 40);

        btnShowFoodPlans.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnShowFoodPlans.setText("SHOW FOOD PLAN");
        btnShowFoodPlans.setBorderPainted(false);
        btnShowFoodPlans.setContentAreaFilled(false);
        btnShowFoodPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFoodPlansActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowFoodPlans);
        btnShowFoodPlans.setBounds(1410, 470, 218, 40);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel11.setText("ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(570, 500, 149, 37);

        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIDKeyTyped(evt);
            }
        });
        getContentPane().add(tfID);
        tfID.setBounds(730, 510, 197, 24);

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        getContentPane().add(tfSearch);
        tfSearch.setBounds(1100, 480, 279, 24);
        getContentPane().add(tfSnacks);
        tfSnacks.setBounds(570, 910, 355, 49);
        getContentPane().add(tfBreakFast);
        tfBreakFast.setBounds(570, 590, 352, 49);
        getContentPane().add(tfLunch);
        tfLunch.setBounds(570, 690, 355, 49);
        getContentPane().add(tfDinner);
        tfDinner.setBounds(570, 800, 355, 49);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(1237, 526, 632, 0);

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        jToggleButton1.setText("PDF");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(1080, 910, 161, 48);

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Excel_2013_23480.png"))); // NOI18N
        jToggleButton2.setText("Excel");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setFocusPainted(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(1350, 910, 152, 48);
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodPlanActionPerformed
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
        String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
       // txtFecha.setText(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
       //---------------------------------------------VALIDACION CEDULA--------------------------------------------------------- 
        
        int count = 0;
        if (Fl.validateCed(tfID.getText()) && tfID.getText().length() == 9) {
            if (tfID.getText().equals("") || tfLunch.getText().equals("") || tfBreakFast.getText().equals("") || tfSnacks.getText().equals("") || tfDinner.getText().equals("")) {
                lbMessages.setText("FILL THE DATA!");
            }//End if 
            else {
                try {
                    Plans plan = new Plans(tfID.getText(), objSDF.format(objDate), tfBreakFast.getText(), tfLunch.getText(), tfDinner.getText(), tfSnacks.getText());
                    queue.planesPacienteInsertar(tfID.getText(), objSDF.format(objDate), tfBreakFast.getText(), tfLunch.getText(), tfDinner.getText(), tfSnacks.getText());
                    mostrarPlanes();

                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Nuevo plan para " + tfID.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    tfID.setText("");
                    tfLunch.setText("");
                    tfBreakFast.setText("");
                    tfDinner.setText("");
                    tfSnacks.setText("");
                    tfSearch.setText("");
                } catch (FileNotFoundException ex) {
                    lbMessages.setText("WE CAN'T ADD THE FOOD PLAN!");
                }
                lbMessages.setText("SAVED FOOD PLAN!");
            }
        } else {
            lbMessages.setText("THE ID MUST HAVE 9 NUMBERS!");
            count++;
        }
       
    }//GEN-LAST:event_btnAddFoodPlanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccion = jTable1.getSelectedRow();
        //(jTable1.getValueAt(seleccion, 0).toString()); ESPACIO DE FECHA 
        tfID.setText(jTable1.getValueAt(seleccion, 1).toString());
        tfBreakFast.setText(jTable1.getValueAt(seleccion, 2).toString());
        tfLunch.setText(jTable1.getValueAt(seleccion, 3).toString());
        tfDinner.setText(jTable1.getValueAt(seleccion, 4).toString());
        tfSnacks.setText(jTable1.getValueAt(seleccion, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnShowFoodPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFoodPlansActionPerformed
        if(tfSearch.getText().equals("")){
            mostrarPlanes();
        } else{ 
            FileQueuesLog fl = new FileQueuesLog();
            if(fl.readingFilesPlanes(tfSearch.getText()) == true){          
            try {
                searchClienteIndividual(tfSearch.getText());
                tfSearch.setText("");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CRUDNotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
      lbMessages.setText("NOT FOUND!");
            }
        tfLunch.setText("");
        tfDinner.setText("");
        tfBreakFast.setText("");
        tfSnacks.setText("");
        tfSearch.setText("");
        tfID.setText("");       
        }
    }//GEN-LAST:event_btnShowFoodPlansActionPerformed

    private void btnUpdateFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFoodPlanActionPerformed
       int seleccion = jTable1.getSelectedRow();
        try {
                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO UPDATE THE FOOD PLAN FROM " + tfID.getText() + " ?");
                if(edit == 0){ //cedula y luego sigue fecha
                    em.actualizarPlanPersona(tfID.getText(), jTable1.getValueAt(seleccion, 0).toString(), tfBreakFast.getText(), tfLunch.getText(), tfDinner.getText(), tfSnacks.getText());
                   lbMessages.setText("SUCCESSFULLY UPDATED!");
                    mostrarPlanes();
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Modifico el plan de " +  tfID.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    tfID.setText("");
                    tfLunch.setText("");
                    tfSearch.setText("");
                    tfDinner.setText("");
                    tfBreakFast.setText("");
                    tfSnacks.setText("");
                }
            }catch (IOException ex) {
                lbMessages.setText("UPDATE ERROR!");
            }   
    }//GEN-LAST:event_btnUpdateFoodPlanActionPerformed

    private void btnDeleteFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodPlanActionPerformed
        int seleccion = jTable1.getSelectedRow();
        try {
                Delete em = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE THE FOOD PLAN FROM " + tfID.getText() + " ?");
                if(d == 0){
                    em.removeLinesColaPlan(tfID.getText());
                    mostrarPlanes();
                    lbMessages.setText("SUCCESSFULLY DELETED!");
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Elimino el plan de " +  tfID.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    
                    tfID.setText("");
                    tfLunch.setText("");
                    tfDinner.setText("");
                    tfBreakFast.setText("");
                    tfSnacks.setText("");
                    tfSearch.setText("");
                }
            }catch (IOException ex) {
                lbMessages.setText("DELETE ERROR!");
            }   
    }//GEN-LAST:event_btnDeleteFoodPlanActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        MessageFormat header = new MessageFormat("Citas personal");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);

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

    private void tfIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_tfIDKeyTyped
    

    /**
    * Este metodo permite mostrar los planes en el table
    * @param nada
    * @return Nada.
    */
    public void mostrarPlanes(){
        Logic lC = new Logic();
        ArrayList<Plans> array = new ArrayList();
        
        Plans tempCountries[] = lC.readRegistersFilesPlanes();
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
       
       String matriz[][]= new String[array.size()][6];
       
         for (int i = 0; i < array.size(); i++) {
        
        matriz[i][0]= array.get(i).getFecha();
        matriz[i][1]= array.get(i).getCedula();
        matriz[i][2]= array.get(i).getDesayuno();
        matriz[i][3]= array.get(i).getAlmuerzo();
        matriz[i][4]= array.get(i).getCena();
        matriz[i][5]= array.get(i).getMeriendas();
       
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "DATE","ID","BREAKFAST", "LUNCH", "DINNER", "SNACKS"
            }
        ));
         } 
    }
    
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
            java.util.logging.Logger.getLogger(CRUDFoodPlanAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDFoodPlanAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDFoodPlanAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDFoodPlanAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDFoodPlanAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodPlan;
    private javax.swing.JButton btnDeleteFoodPlan;
    private javax.swing.JButton btnShowFoodPlans;
    private javax.swing.JButton btnUpdateFoodPlan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbBreakFast;
    private javax.swing.JLabel lbDinner;
    private javax.swing.JLabel lbFoodPlans;
    private javax.swing.JLabel lbLunch;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbSnacks;
    private javax.swing.JTextField tfBreakFast;
    private javax.swing.JTextField tfDinner;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLunch;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfSnacks;
    // End of variables declaration//GEN-END:variables

     class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos6.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
