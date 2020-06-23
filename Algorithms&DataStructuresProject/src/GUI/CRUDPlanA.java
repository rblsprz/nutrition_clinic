package GUI;

import Logic.Hist;
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
import Logic.PlanNo;
import Logic.Delete;
import Logic.Update;
import Logic.ColaFilesLog;

/**
 *
 * @author pc
 */
public class CRUDPlanA extends javax.swing.JFrame {

    /**
     * Creates new form PlanAlimenticioCRUD
     */
    public CRUDPlanA() {
        initComponents();
         this.setExtendedState(CRUDPlanA.MAXIMIZED_BOTH);
    }
    
    PlanNo queue = new PlanNo();
    Logic Fl = new Logic();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        txtMeriendas = new javax.swing.JTextField();
        txtDesayuno = new javax.swing.JTextField();
        txtAlmuerzo = new javax.swing.JTextField();
        txtCena = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jAtras = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel6.setText("Meriendas");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setText("PLAN ALIMENTICIO");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel8.setText("Cena");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel9.setText("Almuerzo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Desayuno", "Almuerzo", "Cena", "Meriendas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel10.setText("Desayuno");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Add Plan");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        btnEliminar.setText("Delete Plan");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnModificar.setText("Modify Plan");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnMostrar.setText("Show Plans");
        btnMostrar.setBorderPainted(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel11.setText("Cédula Paciente");

        jMenu1.setText("Exportar PDF");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exportar Excel");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jAtras.setText("Atras");
        jAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAtrasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jAtras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMeriendas, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCedula)
                            .addGap(3, 3, 3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnAgregar)
                        .addGap(60, 60, 60)
                        .addComponent(btnModificar)
                        .addGap(53, 53, 53)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(737, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMeriendas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))))
                .addContainerGap(586, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        MessageFormat header=new MessageFormat("Planes Alimenticios");
        MessageFormat footer=new MessageFormat("Página{0,number,integer}");
        try{
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            JOptionPane.showMessageDialog(null, "Exportado correctamente");
        } catch (PrinterException ex) {
            System.err.format("Error de impresion", ex.getMessage());
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAtrasMouseClicked
        Administrator i = new Administrator();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jAtrasMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
        String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
       // txtFecha.setText(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
       //---------------------------------------------VALIDACION CEDULA--------------------------------------------------------- 
        
        int count = 0;
        if (Fl.validateCed(txtCedula.getText()) && txtCedula.getText().length() == 9) {
            if (txtCedula.getText().equals("") || txtAlmuerzo.getText().equals("") || txtDesayuno.getText().equals("") || txtMeriendas.getText().equals("") || txtCena.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene todos los espacios en blanco");
            }//End if 
            else {
                try {
                    Plans plan = new Plans(txtCedula.getText(), objSDF.format(objDate), txtDesayuno.getText(), txtAlmuerzo.getText(), txtCena.getText(), txtMeriendas.getText());
                    queue.planesPacienteInsertar(txtCedula.getText(), objSDF.format(objDate), txtDesayuno.getText(), txtAlmuerzo.getText(), txtCena.getText(), txtMeriendas.getText());
                    mostrarPlanes();

                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    Hist c = new Hist(objSDF.format(objDate), hora , "Nuevo plan para " + txtCedula.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    txtCedula.setText("");
                    txtAlmuerzo.setText("");
                    txtDesayuno.setText("");
                    txtCena.setText("");
                    txtMeriendas.setText("");
                    txtBuscar.setText("");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error al insertar el plan del paciente");
                }
                JOptionPane.showMessageDialog(null, "Plan guardado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cedula debe tener 9 digitos");
            count++;
        }
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccion = jTable1.getSelectedRow();
        //(jTable1.getValueAt(seleccion, 0).toString()); ESPACIO DE FECHA 
        txtCedula.setText(jTable1.getValueAt(seleccion, 1).toString());
        txtDesayuno.setText(jTable1.getValueAt(seleccion, 2).toString());
        txtAlmuerzo.setText(jTable1.getValueAt(seleccion, 3).toString());
        txtCena.setText(jTable1.getValueAt(seleccion, 4).toString());
        txtMeriendas.setText(jTable1.getValueAt(seleccion, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(txtBuscar.getText().equals("")){
            mostrarPlanes();
        } else{ 
            ColaFilesLog fl = new ColaFilesLog();
            if(fl.readingFilesPlanes(txtBuscar.getText()) == true){          
            try {
                searchClienteIndividual(txtBuscar.getText());
                txtBuscar.setText("");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CRUDNotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
        JOptionPane.showMessageDialog(null, "NO ENCONTRADO");}
        txtAlmuerzo.setText("");
        txtCena.setText("");
        txtDesayuno.setText("");
        txtMeriendas.setText("");
        txtBuscar.setText("");
        txtCedula.setText("");       
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       int seleccion = jTable1.getSelectedRow();
        try {
                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar el plan de " + txtCedula.getText() + " ?");
                if(edit == 0){ //cedula y luego sigue fecha
                    em.actualizarPlanPersona(txtCedula.getText(), jTable1.getValueAt(seleccion, 0).toString(), txtDesayuno.getText(), txtAlmuerzo.getText(), txtCena.getText(), txtMeriendas.getText());
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                    mostrarPlanes();
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    Hist c = new Hist(objSDF.format(objDate), hora , "Modifico el plan de " +  txtCedula.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    txtCedula.setText("");
                    txtAlmuerzo.setText("");
                    txtBuscar.setText("");
                    txtCena.setText("");
                    txtDesayuno.setText("");
                    txtMeriendas.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int seleccion = jTable1.getSelectedRow();
        try {
                Delete em = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el plan de " + txtCedula.getText() + " ?");
                if(d == 0){
                    em.removeLinesColaPlan(jTable1.getValueAt(seleccion, 0).toString() , txtCedula.getText());
                    mostrarPlanes();
                    JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    Hist c = new Hist(objSDF.format(objDate), hora , "Elimino el plan de " +  txtCedula.getText(), getPersona());
                    Fl.insertHistorialAcciones(c);
                    
                    txtCedula.setText("");
                    txtAlmuerzo.setText("");
                    txtCena.setText("");
                    txtDesayuno.setText("");
                    txtMeriendas.setText("");
                    txtBuscar.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        JFileChooser seleccionar = new JFileChooser();
        File archivo;
        if (seleccionar.showDialog(null, "Exportar Excel") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            String imagen = archivo + ".xls";
            File file = new File(imagen);
            ExportarExcel excel = new ExportarExcel(jTable1, file, "" + "tablaimporte");
            excel.export(); 
            JOptionPane.showMessageDialog(null, "Exportado correctamente");
        }
    }//GEN-LAST:event_jMenu2MouseClicked
    

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
                "Fecha","Cedula","Desayuno", "Almuerzo", "Cena", "Meriendas"
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
                "Fecha","Cedula","Desayuno", "Almuerzo", "Cena", "Meriendas"
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
            java.util.logging.Logger.getLogger(CRUDPlanA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDPlanA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDPlanA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDPlanA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDPlanA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JMenu jAtras;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAlmuerzo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtDesayuno;
    private javax.swing.JTextField txtMeriendas;
    // End of variables declaration//GEN-END:variables
}
