/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SASA
 */
public class Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbReportes = new javax.swing.JComboBox<>();
        PanelATA = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        btnAceptarATA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdentidadPac = new javax.swing.JFormattedTextField();
        btnAceptarExp = new javax.swing.JButton();

        jLabel1.setText("Reportes Disponibles:");

        cmbReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pacientes por Carrera", "Medicamentos Usados", "Hoja ATA por fecha", "Expedientes" }));
        cmbReportes.setSelectedIndex(-1);
        cmbReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReportesActionPerformed(evt);
            }
        });


        PanelATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelATA.setEnabled(false);

        jCalendar1.setEnabled(false);

        jLabel2.setText("Seleccione la Fecha de la Hoja ATA");

        btnAceptarATA.setText("Aceptar");
        btnAceptarATA.setEnabled(false);
        btnAceptarATA.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarATAActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout PanelATALayout = new javax.swing.GroupLayout(PanelATA);
        PanelATA.setLayout(PanelATALayout);
        PanelATALayout.setHorizontalGroup(
            PanelATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelATALayout.createSequentialGroup()
                .addGroup(PanelATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelATALayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelATALayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(PanelATALayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnAceptarATA)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PanelATALayout.setVerticalGroup(
            PanelATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelATALayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptarATA)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Ingrese la Identidad del Paciente:");

        try {
            txtIdentidadPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdentidadPac.setEnabled(false);
        txtIdentidadPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdentidadPacKeyReleased(evt);
            }
        });

        btnAceptarExp.setText("Aceptar");
        btnAceptarExp.setEnabled(false);
        btnAceptarExp.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarExpActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txtIdentidadPac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnAceptarExp)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(txtIdentidadPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAceptarExp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReportesActionPerformed
        // TODO add your handling code here:
        String res = this.cmbReportes.getSelectedItem().toString();
        
        if(res=="Hoja ATA por fecha"){
           this.PanelATA.setEnabled(true);
           this.btnAceptarATA.setEnabled(true);
           this.jCalendar1.setEnabled(true);
         }else{
            this.PanelATA.setEnabled(false);
           this.btnAceptarATA.setEnabled(false);
           this.jCalendar1.setEnabled(false);
        }
        
        if(res=="Expedientes"){
           this.jPanel1.setEnabled(true);
           txtIdentidadPac.setEnabled(true);
           this.btnAceptarExp.setEnabled(true);
         }else{
           this.jPanel1.setEnabled(false);
           txtIdentidadPac.setEnabled(false);
           this.btnAceptarExp.setEnabled(false);
           txtIdentidadPac.setText("");
        }
        
    }//GEN-LAST:event_cmbReportesActionPerformed

    private void btnAceptarATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarATAActionPerformed
        // TODO add your handling code here:
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        String fecha = df.format(jCalendar1.getDate());
                try{
                String jrxmlFile = "src/Reportes/Hoja_ATA.jrxml";
                Connection con = DB.conexion();
                HashMap param = new HashMap();
                param.put("fecha",fecha);
                JasperReport JRpt =JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param,con);

                JasperViewer.viewReport(JPrint, false);
            }

            catch(JRException e){
                JOptionPane.showMessageDialog(this, e);
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnAceptarATAActionPerformed

    private void txtIdentidadPacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentidadPacKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentidadPacKeyReleased

    private void btnAceptarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarExpActionPerformed
        // TODO add your handling code here:
        if(txtIdentidadPac.isEditValid()){
           String id = txtIdentidadPac.getText();
                try{
                String jrxmlFile = "src/Reportes/Expediente.jrxml";
                Connection con = DB.conexion();
                HashMap param = new HashMap();
                param.put("id",id);
                JasperReport JRpt =JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param,con);

                JasperViewer.viewReport(JPrint, false);
            }

            catch(JRException e){
                JOptionPane.showMessageDialog(this, e);
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else{
            JOptionPane.showMessageDialog(null, "No ingreso correctamente la identidad del paciente!");
        }
    }//GEN-LAST:event_btnAceptarExpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelATA;
    private javax.swing.JButton btnAceptarATA;
    private javax.swing.JButton btnAceptarExp;
    private javax.swing.JComboBox<String> cmbReportes;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JFormattedTextField txtIdentidadPac;
    // End of variables declaration//GEN-END:variables
}
