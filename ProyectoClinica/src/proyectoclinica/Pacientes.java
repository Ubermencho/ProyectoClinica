/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SASA
 */
public class Pacientes extends javax.swing.JPanel {

    /**
     * Creates new form Pacientes
     */
    public Pacientes() {
        initComponents();
    }
    String sexo = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreMod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdbMasculinoMod = new javax.swing.JRadioButton();
        rdbFemeninoMod = new javax.swing.JRadioButton();
        rdbOtroMod = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoMod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdentidadMod = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        spnEdadMod = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cmbCarreraMod = new javax.swing.JComboBox<>();
        btnBuscarMod = new javax.swing.JButton();
        btnAceptarMod = new javax.swing.JButton();
        btnLimpiarMod = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentidadEliminar = new javax.swing.JFormattedTextField();
        btnBuscarEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombreEliminar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoEliminar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rdbMasculinoEliminar = new javax.swing.JRadioButton();
        rdbFemeninoEliminar = new javax.swing.JRadioButton();
        rdbOtroEliminar = new javax.swing.JRadioButton();
        spnEdadEliminar = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        cmbCarreraEliminar = new javax.swing.JComboBox<>();
        btnAceptarEliminar = new javax.swing.JButton();
        btnLimpiarEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setText("Nombres:");

        txtNombreMod.setEnabled(false);

        jLabel5.setText("Sexo:");

        buttonGroup1.add(rdbMasculinoMod);
        rdbMasculinoMod.setText("Masculino");
        rdbMasculinoMod.setEnabled(false);

        buttonGroup1.add(rdbFemeninoMod);
        rdbFemeninoMod.setText("Femenino");
        rdbFemeninoMod.setEnabled(false);

        buttonGroup1.add(rdbOtroMod);
        rdbOtroMod.setText("Otro");
        rdbOtroMod.setEnabled(false);

        jLabel2.setText("Apellidos:");

        txtApellidoMod.setEnabled(false);

        jLabel3.setText("# de identidad:");

        try {
            txtIdentidadMod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Edad:");

        spnEdadMod.setEnabled(false);

        jLabel7.setText("Carrera:");

        cmbCarreraMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Definido", "Ingeniera en Sistemas", "Ingeniera Civil", "Ingeniera Industrial", "Ingeniera Ambiental", "Arquitectura", "Medicina", "Cirugia Dental", "Enfermeria", "Psicologia", "Mercadotecnia", "Adm. de Empresas", "Finanzas", "Relaciones Internacionales", "Ciencias en Comunicacion", "Derecho", "Teologia", "Postgrado", "Otro" }));
        cmbCarreraMod.setEnabled(false);

        btnBuscarMod.setText("Buscar");
        btnBuscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModActionPerformed(evt);
            }
        });

        btnAceptarMod.setText("Aceptar");
        btnAceptarMod.setEnabled(false);
        btnAceptarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModActionPerformed(evt);
            }
        });

        btnLimpiarMod.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                            .addComponent(txtApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAceptarMod)
                        .addGap(56, 56, 56)
                        .addComponent(btnLimpiarMod))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spnEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rdbMasculinoMod)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbFemeninoMod)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbOtroMod))
                                .addComponent(cmbCarreraMod, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBuscarMod)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtIdentidadMod)
                                    .addGap(19, 19, 19))))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdentidadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarMod)
                        .addGap(21, 21, 21)
                        .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdbMasculinoMod)
                    .addComponent(rdbFemeninoMod)
                    .addComponent(rdbOtroMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spnEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbCarreraMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarMod)
                    .addComponent(btnLimpiarMod))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel1);

        jLabel4.setText("# de identidad:");

        try {
            txtIdentidadEliminar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarEliminar.setText("Buscar");
        btnBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombres:");

        txtNombreEliminar.setEnabled(false);

        jLabel9.setText("Apellidos:");

        txtApellidoEliminar.setEnabled(false);

        jLabel10.setText("Sexo:");

        buttonGroup1.add(rdbMasculinoEliminar);
        rdbMasculinoEliminar.setText("Masculino");
        rdbMasculinoEliminar.setEnabled(false);

        buttonGroup1.add(rdbFemeninoEliminar);
        rdbFemeninoEliminar.setText("Femenino");
        rdbFemeninoEliminar.setEnabled(false);

        buttonGroup1.add(rdbOtroEliminar);
        rdbOtroEliminar.setText("Otro");
        rdbOtroEliminar.setEnabled(false);

        spnEdadEliminar.setEnabled(false);

        jLabel11.setText("Edad:");

        cmbCarreraEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Definido", "Ingeniera en Sistemas", "Ingeniera Civil", "Ingeniera Industrial", "Ingeniera Ambiental", "Arquitectura", "Medicina", "Cirugia Dental", "Enfermeria", "Psicologia", "Mercadotecnia", "Adm. de Empresas", "Finanzas", "Relaciones Internacionales", "Ciencias en Comunicacion", "Derecho", "Teologia", "Postgrado", "Otro" }));
        cmbCarreraEliminar.setEnabled(false);

        btnAceptarEliminar.setText("Aceptar");
        btnAceptarEliminar.setEnabled(false);
        btnAceptarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEliminarActionPerformed(evt);
            }
        });

        btnLimpiarEliminar.setText("Limpiar");

        jLabel12.setText("Carrera:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                            .addComponent(txtApellidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAceptarEliminar)
                        .addGap(56, 56, 56)
                        .addComponent(btnLimpiarEliminar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spnEdadEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rdbMasculinoEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbFemeninoEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbOtroEliminar))
                                .addComponent(cmbCarreraEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBuscarEliminar)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtIdentidadEliminar)
                                    .addGap(19, 19, 19))))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdentidadEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEliminar)
                        .addGap(21, 21, 21)
                        .addComponent(txtNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rdbMasculinoEliminar)
                    .addComponent(rdbFemeninoEliminar)
                    .addComponent(rdbOtroEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spnEdadEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbCarreraEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarEliminar)
                    .addComponent(btnLimpiarEliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModActionPerformed
       String sql="";
       sql=("select idcarrera, nombre_paciente, apellido_paciente, edad_paciente, genero_paciente from paciente where idpaciente='"+txtIdentidadMod.getText()+"'");
       try{
              Statement s = DB.conexion().createStatement();
              ResultSet rs = s.executeQuery(sql);
              if(rs.next()){
                cmbCarreraMod.setSelectedIndex(rs.getInt("idcarrera"));
                txtNombreMod.setText(rs.getString("nombre_paciente"));
                txtApellidoMod.setText(rs.getString("apellido_paciente"));
                spnEdadMod.setValue(rs.getInt("edad_paciente"));
                sexo = rs.getString("genero_paciente");
              }
              rs.close();
              s.close();
              
              if(sexo.equals("Masculino"))
                  rdbMasculinoMod.setSelected(true);
              else if (sexo.equals("Femenino"))
                  rdbFemeninoMod.setSelected(true);
              else
                  rdbOtroMod.setSelected(true);
              
              cmbCarreraMod.setEnabled(true);
              txtNombreMod.setEnabled(true);
              txtApellidoMod.setEnabled(true);
              spnEdadMod.setEnabled(true);
              btnAceptarMod.setEnabled(true);
              rdbMasculinoMod.setEnabled(true);
              rdbFemeninoMod.setEnabled(true);
              rdbOtroMod.setEnabled(true);
              btnAceptarMod.setEnabled(true);
          }
        catch(SQLException ex){           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarModActionPerformed

    private void btnAceptarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModActionPerformed
        try {
            if(DB.modificarPaciente(txtIdentidadMod.getText(), cmbCarreraMod.getSelectedIndex(), txtNombreMod.getText(),
                    txtApellidoMod.getText(), Integer.parseInt(spnEdadMod.getValue().toString()), sexo) != 0){
                JOptionPane.showMessageDialog(this, "Modificado Exitosamente");
                cmbCarreraMod.setEnabled(false);
                txtNombreMod.setEnabled(false);
                txtApellidoMod.setEnabled(false);
                spnEdadMod.setEnabled(false);
                btnAceptarMod.setEnabled(false);
                rdbMasculinoMod.setEnabled(false);
                rdbFemeninoMod.setEnabled(false);
                rdbOtroMod.setEnabled(false);
                btnAceptarMod.setEnabled(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarModActionPerformed

    private void btnBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarActionPerformed
        String sql="";
       sql=("select idcarrera, nombre_paciente, apellido_paciente, edad_paciente, genero_paciente from paciente where idpaciente='"+txtIdentidadMod.getText()+"'");
       try{
              Statement s = DB.conexion().createStatement();
              ResultSet rs = s.executeQuery(sql);
              if(rs.next()){
                cmbCarreraEliminar.setSelectedIndex(rs.getInt("idcarrera"));
                txtNombreEliminar.setText(rs.getString("nombre_paciente"));
                txtApellidoEliminar.setText(rs.getString("apellido_paciente"));
                spnEdadEliminar.setValue(rs.getInt("edad_paciente"));
                sexo = rs.getString("genero_paciente");
              }
              rs.close();
              s.close();
              
              if(sexo.equals("Masculino"))
                  rdbMasculinoEliminar.setSelected(true);
              else if (sexo.equals("Femenino"))
                  rdbFemeninoEliminar.setSelected(true);
              else
                  rdbOtroEliminar.setSelected(true);
              
              btnAceptarEliminar.setEnabled(true);
          }
        catch(SQLException ex){           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarEliminarActionPerformed

    private void btnAceptarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEliminarActionPerformed
        try {
            if(DB.eliminarPaciente(txtIdentidadEliminar.getText()) != 0){
                JOptionPane.showMessageDialog(this, "Eliminado Exitosamente");
                btnAceptarEliminar.setEnabled(false);
            } else 
                JOptionPane.showMessageDialog(this, "Algo ha pasado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEliminar;
    private javax.swing.JButton btnAceptarMod;
    private javax.swing.JButton btnBuscarEliminar;
    private javax.swing.JButton btnBuscarMod;
    private javax.swing.JButton btnLimpiarEliminar;
    private javax.swing.JButton btnLimpiarMod;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCarreraEliminar;
    private javax.swing.JComboBox<String> cmbCarreraMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdbFemeninoEliminar;
    private javax.swing.JRadioButton rdbFemeninoMod;
    private javax.swing.JRadioButton rdbMasculinoEliminar;
    private javax.swing.JRadioButton rdbMasculinoMod;
    private javax.swing.JRadioButton rdbOtroEliminar;
    private javax.swing.JRadioButton rdbOtroMod;
    private javax.swing.JSpinner spnEdadEliminar;
    private javax.swing.JSpinner spnEdadMod;
    private javax.swing.JTextField txtApellidoEliminar;
    private javax.swing.JTextField txtApellidoMod;
    private javax.swing.JFormattedTextField txtIdentidadEliminar;
    private javax.swing.JFormattedTextField txtIdentidadMod;
    private javax.swing.JTextField txtNombreEliminar;
    private javax.swing.JTextField txtNombreMod;
    // End of variables declaration//GEN-END:variables
}
