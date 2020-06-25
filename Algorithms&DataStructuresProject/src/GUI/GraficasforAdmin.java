package GUI;


import GUI.Administrator;
import GUI.AdministratorNotes;
import Logic.GraficsLogic;
import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Rachel
 */
public class GraficasforAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrmGraficasAdmin
     */
    
    public GraficasforAdmin() {
        initComponents();
          this.setExtendedState(GraficasforAdmin.MAXIMIZED_BOTH);
          this.getContentPane().setBackground(Color.red);
           //Color JPanel
        jPanel1.setBackground(Color.white);
         //Color JPanel
        jPanel2.setBackground(Color.white);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        tfID = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioButtonGrease = new javax.swing.JRadioButton();
        radioButtonWeight = new javax.swing.JRadioButton();
        radioButtonMuscle = new javax.swing.JRadioButton();
        lbData = new javax.swing.JLabel();
        radioButtonWater = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbBars = new javax.swing.JRadioButton();
        rbCircular = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnEjecutar.setText("SEARCH");
        btnEjecutar.setBorderPainted(false);
        btnEjecutar.setContentAreaFilled(false);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnGraficar.setText("GRAPH");
        btnGraficar.setBorderPainted(false);
        btnGraficar.setContentAreaFilled(false);
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultas);

        tfID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfIDMouseClicked(evt);
            }
        });

        lbID.setBackground(new java.awt.Color(255, 255, 255));
        lbID.setText("ID:");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        radioButtonGrease.setText("GREASE");
        radioButtonGrease.setContentAreaFilled(false);
        radioButtonGrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonGreaseActionPerformed(evt);
            }
        });

        radioButtonWeight.setText("WEIGHT");
        radioButtonWeight.setContentAreaFilled(false);
        radioButtonWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonWeightActionPerformed(evt);
            }
        });

        radioButtonMuscle.setText("MUSCLE");
        radioButtonMuscle.setContentAreaFilled(false);

        lbData.setBackground(new java.awt.Color(255, 255, 255));
        lbData.setText("DATA");

        radioButtonWater.setText("WATER");
        radioButtonWater.setContentAreaFilled(false);
        radioButtonWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonWaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonMuscle)
                            .addComponent(radioButtonGrease))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonWeight)
                            .addComponent(radioButtonWater)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbData)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonGrease)
                    .addComponent(radioButtonWeight))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonMuscle)
                    .addComponent(radioButtonWater))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        rbBars.setText("BARS");
        rbBars.setContentAreaFilled(false);

        rbCircular.setText("CIRCULAR");
        rbCircular.setContentAreaFilled(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHART TYPE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBars)
                    .addComponent(rbCircular))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(rbCircular)
                .addGap(18, 18, 18)
                .addComponent(rbBars)
                .addContainerGap())
        );

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        jToggleButton1.setText("PDF EXPORT CHART");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setText("CHARTS");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbID)
                                .addGap(26, 26, 26)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(778, 778, 778)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jToggleButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(777, 777, 777))
            .addGroup(layout.createSequentialGroup()
                .addGap(963, 963, 963)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbID))
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(522, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (tfID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite el número de cedula que desea buscar");
        } else {
            DefaultTableModel miModelo;

            GraficsLogic miGrafica = new GraficsLogic();

            if(radioButtonGrease.isSelected()){

                miModelo = miGrafica.mostrarGrasa(tfID.getText());
                tblConsultas.setModel(miModelo);
            }
            if(radioButtonMuscle.isSelected()){

                miModelo = miGrafica.mostrarMusculo(tfID.getText());
                tblConsultas.setModel(miModelo);
            }

            if(radioButtonWater.isSelected()){
                miModelo = miGrafica.mostrarHidratacion(tfID.getText());
                tblConsultas.setModel(miModelo);
            }
            if(radioButtonWeight.isSelected()){
                miModelo = miGrafica.mostrarPeso(tfID.getText());
                tblConsultas.setModel(miModelo);
            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        String name="";
        if(radioButtonGrease.isSelected()){
            name="Grasa";
        }
        if(radioButtonMuscle.isSelected()){
            name="Musculo";
        }

        if(radioButtonWater.isSelected()){
            name="Hidratación";
        }
        if(radioButtonWeight.isSelected()){
            name="Peso";
        }
        if(rbBars.isSelected()){
            DefaultCategoryDataset dts = new DefaultCategoryDataset();

            for(int i = 0; i < tblConsultas.getRowCount(); i++){

                dts.addValue(Double.parseDouble(tblConsultas.getValueAt(i, 1).toString()), tblConsultas.getValueAt(i, 0).toString(), tblConsultas.getValueAt(i, 1).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart3D("Grafica de " +name, "Porcentajes Obtenidos", "Cantidad", dts,PlotOrientation.HORIZONTAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);

        }

        if(rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();

            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Double.parseDouble(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D("Grafica de " +name, dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);

        }

    }//GEN-LAST:event_btnGraficarActionPerformed

    private void tfIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIDMouseClicked
        tfID.setText("");
        //holder = new PlaceHolder(txtCedula, "Digite la cedula");
    }//GEN-LAST:event_tfIDMouseClicked

    private void radioButtonGreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonGreaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonGreaseActionPerformed

    private void radioButtonWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonWeightActionPerformed

    private void radioButtonWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonWaterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonWaterActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        String name="";
        if(radioButtonGrease.isSelected()){
            name="Grasa";
        }
        if(radioButtonMuscle.isSelected()){
            name="Musculo";
        }

        if(radioButtonWater.isSelected()){
            name="Hidratación";
        }
        if(radioButtonWeight.isSelected()){
            name="Peso";
        }

        if(rbBars.isSelected()){
            DefaultCategoryDataset dts = new DefaultCategoryDataset();

            for(int i = 0; i < tblConsultas.getRowCount(); i++){

                dts.addValue(Double.parseDouble(tblConsultas.getValueAt(i, 1).toString()), tblConsultas.getValueAt(i, 0).toString(), tblConsultas.getValueAt(i, 1).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart3D("Grafica de " +name, "Porcentajes Obtenidos", "Cantidad", dts,PlotOrientation.HORIZONTAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            //        JFreeChart chart = createChart(createDataset());

            PDFDocument pdfDoc = new PDFDocument();
            pdfDoc.setTitle("Grafica de " +name);
            pdfDoc.setAuthor("Erick");

            Page page = pdfDoc.createPage(new Rectangle(612, 468));
            PDFGraphics2D g2 = page.getGraphics2D();

            ch.draw(g2, new Rectangle(0, 0, 612, 468));
            pdfDoc.writeToFile(new File("C:\\Users\\manit\\Desktop\\ProyectoAlgoritmos\\Algorithms-DataStructures\\Barras-de-datos-"+name+".pdf"));

            System.out.println("archivo pdf generado correctamente...");
        }else

        if(rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();

            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Double.parseDouble(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D("Grafica de " +name, dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            //        JFreeChart chart = createChart(createDataset());

            PDFDocument pdfDoc = new PDFDocument();
            pdfDoc.setTitle("Grafica de " +name);
            pdfDoc.setAuthor("Erick");

            Page page = pdfDoc.createPage(new Rectangle(612, 468));
            PDFGraphics2D g2 = page.getGraphics2D();

            ch.draw(g2, new Rectangle(0, 0, 612, 468));
            pdfDoc.writeToFile(new File("C:\\Users\\manit\\Desktop\\ProyectoAlgoritmos\\Algorithms-DataStructures\\Circular-de-datos-"+name+".pdf"));

            System.out.println("archivo pdf generado correctamente...");
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
            java.util.logging.Logger.getLogger(GraficasforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficasforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficasforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficasforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficasforAdmin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbID;
    private javax.swing.JRadioButton radioButtonGrease;
    private javax.swing.JRadioButton radioButtonMuscle;
    private javax.swing.JRadioButton radioButtonWater;
    private javax.swing.JRadioButton radioButtonWeight;
    private javax.swing.JRadioButton rbBars;
    private javax.swing.JRadioButton rbCircular;
    private javax.swing.JTable tblConsultas;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
