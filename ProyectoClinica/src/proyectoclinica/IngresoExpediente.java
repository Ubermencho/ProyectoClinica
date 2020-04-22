/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author SASA
 */
public class IngresoExpediente extends javax.swing.JPanel {

    /**
     * Creates new form IngresoExpediente
     */
    String contribuyentes = "", hora, minuto, segundo;
    DateTimeFormatter Hora = DateTimeFormatter.ofPattern("hh");
    DateTimeFormatter Minuto = DateTimeFormatter.ofPattern("mm");
    DateTimeFormatter Segundo = DateTimeFormatter.ofPattern("ss");
    LocalDateTime now = LocalDateTime.now();
    
    public IngresoExpediente() throws ClassNotFoundException {
        initComponents();
        cmbCarrera.removeAllItems();
        try{            
            Statement combo = DB.conexion().createStatement();
            ResultSet rs = combo.executeQuery("select * from carrera");
            while(rs.next()){
                this.cmbCarrera.addItem(rs.getString("nombre_carrera"));
            }
            cmbCarrera.setSelectedIndex(-1);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        InputMap map2 = txtNombre.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map3 = txtApellido.getInputMap(JTextField.WHEN_FOCUSED);
        map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map4 = txtDomicilio.getInputMap(JTextField.WHEN_FOCUSED);
        map4.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map5 = txtSintoma.getInputMap(JTextField.WHEN_FOCUSED);
        map5.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map6 = txtHEA.getInputMap(JTextField.WHEN_FOCUSED);
        map6.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map7 = txtPeso.getInputMap(JTextField.WHEN_FOCUSED);
        map7.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map8 = txtTalla.getInputMap(JTextField.WHEN_FOCUSED);
        map8.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map9 = txtGlasgow.getInputMap(JTextField.WHEN_FOCUSED);
        map9.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map1 = txtFC.getInputMap(JTextField.WHEN_FOCUSED);
        map1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map0 = txtFR.getInputMap(JTextField.WHEN_FOCUSED);
        map0.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map10 = txtPA.getInputMap(JTextField.WHEN_FOCUSED);
        map10.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map11 = txtT.getInputMap(JTextField.WHEN_FOCUSED);
        map11.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map12 = txtPulso.getInputMap(JTextField.WHEN_FOCUSED);
        map12.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map13 = txtFrialdad.getInputMap(JTextField.WHEN_FOCUSED);
        map13.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map14 = txtPiel.getInputMap(JTextField.WHEN_FOCUSED);
        map14.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map15 = txtCapilar.getInputMap(JTextField.WHEN_FOCUSED);
        map15.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map16 = txtValoracion1.getInputMap(JTextField.WHEN_FOCUSED);
        map16.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map17 = txtValoracion2.getInputMap(JTextField.WHEN_FOCUSED);
        map17.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map18 = txtValoracion3.getInputMap(JTextField.WHEN_FOCUSED);
        map18.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map19 = txtValoracion4.getInputMap(JTextField.WHEN_FOCUSED);
        map19.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map20 = txtValoracion5.getInputMap(JTextField.WHEN_FOCUSED);
        map20.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map21 = txtValoracion6.getInputMap(JTextField.WHEN_FOCUSED);
        map21.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map22 = txtValoracion7.getInputMap(JTextField.WHEN_FOCUSED);
        map22.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map23 = txtValoracion8.getInputMap(JTextField.WHEN_FOCUSED);
        map23.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map24 = txtValoracion9.getInputMap(JTextField.WHEN_FOCUSED);
        map24.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map25 = txtValoracion10.getInputMap(JTextField.WHEN_FOCUSED);
        map25.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map26 = txtDiagnostico.getInputMap(JTextField.WHEN_FOCUSED);
        map26.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map27 = txtTratamiento.getInputMap(JTextField.WHEN_FOCUSED);
        map27.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map28 = txtInterconsulta.getInputMap(JTextField.WHEN_FOCUSED);
        map28.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap map29 = txtComentario.getInputMap(JTextField.WHEN_FOCUSED);
        map29.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        hora = Hora.format(now);
        minuto = Minuto.format(now);
        segundo = Segundo.format(now);
        int numeroExpediente = 0;
        try{
            String sql = "select `idexpediente` from `clinica_unicah`.`expediente` ORDER BY `idexpediente` DESC LIMIT 1;";
            Statement s = DB.conexion().createStatement();
            ResultSet rs = s.executeQuery(sql);
            if(rs.next())
                numeroExpediente = rs.getInt("idexpediente");
            rs.close();
            s.close();
        }catch(SQLException ex){           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(numeroExpediente == 0)
            txtExpediente.setText("EXP-1");
        else
            txtExpediente.setText("EXP-" + numeroExpediente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDomicilio = new javax.swing.JTextArea();
        txtSintoma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHEA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        rdbMasculino = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdbFemenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdbOtro = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JFormattedTextField();
        txtExpediente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        txtIMC = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFC = new javax.swing.JFormattedTextField();
        txtFR = new javax.swing.JFormattedTextField();
        txtPA = new javax.swing.JFormattedTextField();
        txtT = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtGlasgow = new javax.swing.JTextField();
        txtChoque = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPulso = new javax.swing.JTextField();
        txtFrialdad = new javax.swing.JTextField();
        txtPiel = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCapilar = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        rdbNormal1 = new javax.swing.JRadioButton();
        rdbAlterado1 = new javax.swing.JRadioButton();
        txtValoracion1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        rdbNormal2 = new javax.swing.JRadioButton();
        rdbAlterado2 = new javax.swing.JRadioButton();
        txtValoracion2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        rdbNormal3 = new javax.swing.JRadioButton();
        rdbAlterado3 = new javax.swing.JRadioButton();
        txtValoracion3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        rdbNormal4 = new javax.swing.JRadioButton();
        rdbAlterado4 = new javax.swing.JRadioButton();
        txtValoracion4 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        rdbNormal5 = new javax.swing.JRadioButton();
        rdbAlterado5 = new javax.swing.JRadioButton();
        txtValoracion5 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        rdbNormal6 = new javax.swing.JRadioButton();
        rdbAlterado6 = new javax.swing.JRadioButton();
        txtValoracion6 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        rdbNormal7 = new javax.swing.JRadioButton();
        rdbAlterado7 = new javax.swing.JRadioButton();
        txtValoracion7 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        rdbNormal8 = new javax.swing.JRadioButton();
        rdbAlterado8 = new javax.swing.JRadioButton();
        txtValoracion8 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        rdbNormal9 = new javax.swing.JRadioButton();
        rdbAlterado9 = new javax.swing.JRadioButton();
        txtValoracion9 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        rdbNormal10 = new javax.swing.JRadioButton();
        rdbAlterado10 = new javax.swing.JRadioButton();
        txtValoracion10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtInterconsulta = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        jLabel30.setText("ORL:");

        buttonGroup4.add(jRadioButton5);
        jRadioButton5.setText("Normal");

        buttonGroup4.add(jRadioButton6);
        jRadioButton6.setText("Alterado");

        jTextField3.setEnabled(false);

        jLabel33.setText("Cuello:");

        buttonGroup5.add(jRadioButton11);
        jRadioButton11.setText("Normal");

        buttonGroup5.add(jRadioButton12);
        jRadioButton12.setText("Alterado");

        jTextField6.setEnabled(false);

        setBackground(new java.awt.Color(195, 232, 249));

        jTabbedPane1.setBackground(new java.awt.Color(62, 110, 133));

        jPanel1.setBackground(new java.awt.Color(195, 232, 249));

        txtDomicilio.setColumns(20);
        txtDomicilio.setRows(5);
        jScrollPane1.setViewportView(txtDomicilio);

        jLabel5.setText("Sexo:");

        jLabel9.setText("HEA:");

        jLabel1.setText("Nombres:");

        txtHEA.setColumns(20);
        txtHEA.setRows(5);
        jScrollPane2.setViewportView(txtHEA);

        jLabel2.setText("Apellidos:");

        rdbMasculino.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup1.add(rdbMasculino);
        rdbMasculino.setText("Masculino");

        jLabel3.setText("# de identidad:");

        rdbFemenino.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup1.add(rdbFemenino);
        rdbFemenino.setText("Femenino");

        jLabel4.setText("Domicilio:");

        rdbOtro.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup1.add(rdbOtro);
        rdbOtro.setText("Otro");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setText("Edad:");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel7.setText("Carrera:");

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Definido", "Ingeniera en Sistemas", "Ingeniera Civil", "Ingeniera Industrial", "Ingeniera Ambiental", "Arquitectura", "Medicina", "Cirugia Dental", "Enfermeria", "Psicologia", "Mercadotecnia", "Adm. de Empresas", "Finanzas", "Relaciones Internacionales", "Ciencias en Comunicacion", "Derecho", "Teologia", "Postgrado", "Otro" }));

        jLabel8.setText("Síntoma Principal:");

        jLabel27.setText("# Expediente");

        try {
            txtIdentidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtExpediente.setEditable(false);
        try {
            txtExpediente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("EXP-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(txtNombre))
                                    .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(rdbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbFemenino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbOtro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                    .addComponent(txtSintoma)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rdbMasculino)
                                    .addComponent(rdbFemenino)
                                    .addComponent(jLabel27)
                                    .addComponent(rdbOtro))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Personales", jPanel1);

        jPanel2.setBackground(new java.awt.Color(195, 232, 249));

        jPanel5.setBackground(new java.awt.Color(195, 232, 249));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Antropometría"));
        jPanel5.setName(""); // NOI18N

        jLabel10.setText("Peso:");

        jLabel11.setText("Talla:");

        jLabel12.setText("IMC:");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });

        txtIMC.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(14, 14, 14)
                        .addComponent(txtIMC))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)
                        .addComponent(txtTalla)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(195, 232, 249));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Signos Vitales"));
        jPanel6.setName(""); // NOI18N

        jLabel13.setText("FC:");

        jLabel14.setText("FR:");

        jLabel15.setText("PA:");

        jLabel16.setText("T°:");

        try {
            txtFC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### lpm")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## rpm")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtPA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/## mmhg")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.## C°")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtT)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFR)
                    .addComponent(txtPA))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(195, 232, 249));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Score"));
        jPanel7.setName(""); // NOI18N

        jLabel17.setText("Glasgow:");

        jLabel18.setText("Índice de Choque:");

        txtGlasgow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGlasgowKeyTyped(evt);
            }
        });

        txtChoque.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGlasgow, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtChoque))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtGlasgow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtChoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(195, 232, 249));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Signos Vitales"));
        jPanel8.setName(""); // NOI18N

        jLabel20.setText("Calidad de pulso:");

        jLabel21.setText("Frialdad distal:");

        jLabel22.setText("Color de piel:");

        jLabel23.setText("Llenado capilar:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPulso, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txtFrialdad)
                    .addComponent(txtPiel)
                    .addComponent(txtCapilar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtFrialdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCapilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Examen Físico", jPanel2);

        jPanel3.setBackground(new java.awt.Color(195, 232, 249));

        jLabel19.setText("Diagnóstico:");

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane4.setViewportView(txtDiagnostico);

        jLabel28.setText("Cabeza:");

        rdbNormal1.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup3.add(rdbNormal1);
        rdbNormal1.setText("Normal");
        rdbNormal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal1ActionPerformed(evt);
            }
        });

        rdbAlterado1.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup3.add(rdbAlterado1);
        rdbAlterado1.setText("Alterado");
        rdbAlterado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado1ActionPerformed(evt);
            }
        });

        txtValoracion1.setEnabled(false);

        jLabel29.setText("ORL:");

        rdbNormal2.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup4.add(rdbNormal2);
        rdbNormal2.setText("Normal");
        rdbNormal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal2ActionPerformed(evt);
            }
        });

        rdbAlterado2.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup4.add(rdbAlterado2);
        rdbAlterado2.setText("Alterado");
        rdbAlterado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado2ActionPerformed(evt);
            }
        });

        txtValoracion2.setEnabled(false);

        jLabel31.setText("Cuello:");

        rdbNormal3.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup5.add(rdbNormal3);
        rdbNormal3.setText("Normal");
        rdbNormal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal3ActionPerformed(evt);
            }
        });

        rdbAlterado3.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup5.add(rdbAlterado3);
        rdbAlterado3.setText("Alterado");
        rdbAlterado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado3ActionPerformed(evt);
            }
        });

        txtValoracion3.setEnabled(false);

        jLabel32.setText("Respiratorio:");

        rdbNormal4.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup6.add(rdbNormal4);
        rdbNormal4.setText("Normal");
        rdbNormal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal4ActionPerformed(evt);
            }
        });

        rdbAlterado4.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup6.add(rdbAlterado4);
        rdbAlterado4.setText("Alterado");
        rdbAlterado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado4ActionPerformed(evt);
            }
        });

        txtValoracion4.setEnabled(false);

        jLabel34.setText("Corazón:");

        rdbNormal5.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup7.add(rdbNormal5);
        rdbNormal5.setText("Normal");
        rdbNormal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal5ActionPerformed(evt);
            }
        });

        rdbAlterado5.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup7.add(rdbAlterado5);
        rdbAlterado5.setText("Alterado");
        rdbAlterado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado5ActionPerformed(evt);
            }
        });

        txtValoracion5.setEnabled(false);

        jLabel35.setText("Abdomen:");

        rdbNormal6.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup8.add(rdbNormal6);
        rdbNormal6.setText("Normal");
        rdbNormal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal6ActionPerformed(evt);
            }
        });

        rdbAlterado6.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup8.add(rdbAlterado6);
        rdbAlterado6.setText("Alterado");
        rdbAlterado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado6ActionPerformed(evt);
            }
        });

        txtValoracion6.setEnabled(false);

        jLabel36.setText("Genitales:");

        rdbNormal7.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup9.add(rdbNormal7);
        rdbNormal7.setText("Normal");
        rdbNormal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal7ActionPerformed(evt);
            }
        });

        rdbAlterado7.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup9.add(rdbAlterado7);
        rdbAlterado7.setText("Alterado");
        rdbAlterado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado7ActionPerformed(evt);
            }
        });

        txtValoracion7.setEnabled(false);

        jLabel37.setText("Extremidades:");

        rdbNormal8.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup10.add(rdbNormal8);
        rdbNormal8.setText("Normal");
        rdbNormal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal8ActionPerformed(evt);
            }
        });

        rdbAlterado8.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup10.add(rdbAlterado8);
        rdbAlterado8.setText("Alterado");
        rdbAlterado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado8ActionPerformed(evt);
            }
        });

        txtValoracion8.setEnabled(false);

        jLabel38.setText("Piel:");

        rdbNormal9.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup11.add(rdbNormal9);
        rdbNormal9.setText("Normal");
        rdbNormal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal9ActionPerformed(evt);
            }
        });

        rdbAlterado9.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup11.add(rdbAlterado9);
        rdbAlterado9.setText("Alterado");
        rdbAlterado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado9ActionPerformed(evt);
            }
        });

        txtValoracion9.setEnabled(false);

        jLabel39.setText("Neurológico:");

        rdbNormal10.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup12.add(rdbNormal10);
        rdbNormal10.setText("Normal");
        rdbNormal10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormal10ActionPerformed(evt);
            }
        });

        rdbAlterado10.setBackground(new java.awt.Color(195, 232, 249));
        buttonGroup12.add(rdbAlterado10);
        rdbAlterado10.setText("Alterado");
        rdbAlterado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlterado10ActionPerformed(evt);
            }
        });

        txtValoracion10.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel36)
                            .addComponent(jLabel34)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbNormal5)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAlterado5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValoracion5, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdbNormal1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbAlterado1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdbNormal2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbAlterado2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValoracion1)
                                    .addComponent(txtValoracion2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbNormal3)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAlterado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValoracion3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbNormal4)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAlterado4)
                                .addGap(6, 6, 6)
                                .addComponent(txtValoracion4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbNormal6)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAlterado6)
                                .addGap(6, 6, 6)
                                .addComponent(txtValoracion6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbNormal7)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAlterado7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValoracion7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdbNormal10)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbAlterado10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdbNormal9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdbAlterado9))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdbNormal8)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbAlterado8)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValoracion8)
                                    .addComponent(txtValoracion9)
                                    .addComponent(txtValoracion10))))))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(rdbNormal1)
                    .addComponent(rdbAlterado1)
                    .addComponent(txtValoracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(rdbNormal2)
                    .addComponent(rdbAlterado2)
                    .addComponent(txtValoracion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(rdbNormal3)
                    .addComponent(rdbAlterado3)
                    .addComponent(txtValoracion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(rdbNormal4)
                    .addComponent(rdbAlterado4)
                    .addComponent(txtValoracion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(rdbNormal5)
                    .addComponent(rdbAlterado5)
                    .addComponent(txtValoracion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(rdbNormal6)
                    .addComponent(rdbAlterado6)
                    .addComponent(txtValoracion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(rdbNormal7)
                    .addComponent(rdbAlterado7)
                    .addComponent(txtValoracion7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(rdbNormal8)
                    .addComponent(rdbAlterado8)
                    .addComponent(txtValoracion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(rdbNormal9)
                    .addComponent(rdbAlterado9)
                    .addComponent(txtValoracion9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(rdbNormal10)
                    .addComponent(rdbAlterado10)
                    .addComponent(txtValoracion10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Valoración aparatos y sistemas", jPanel3);

        jPanel4.setBackground(new java.awt.Color(195, 232, 249));

        jLabel24.setText("Tratamiento:");

        txtTratamiento.setColumns(20);
        txtTratamiento.setRows(5);
        jScrollPane5.setViewportView(txtTratamiento);

        jLabel25.setText("Interconsulta:");

        txtInterconsulta.setColumns(20);
        txtInterconsulta.setRows(5);
        jScrollPane6.setViewportView(txtInterconsulta);

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane7.setViewportView(txtComentario);

        jLabel26.setText("Comentario:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6)))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Final", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");       
        
        String sexo = "", horas, minutos, segundos;
        
        horas = Hora.format(now);
        minutos = Minuto.format(now);
        segundos = Segundo.format(now);
        
        if(rdbMasculino.isSelected())
            sexo = "Masculino";
        else if(rdbFemenino.isSelected())
            sexo = "Femenino";
        else
            sexo = "Otro";
        
        if(rdbNormal1.isSelected())
            contribuyentes += "Cabeza: Normal, ";
        else if (rdbAlterado1.isSelected())
            contribuyentes += "Cabeza: Alterado (" + txtValoracion1.getText() + "), ";
        
        if(rdbNormal2.isSelected())
            contribuyentes += "ORL: Normal, ";
        else if (rdbAlterado2.isSelected())
            contribuyentes += "ORL: Alterado (" + txtValoracion2.getText() + "), ";
        
        if(rdbNormal3.isSelected())
            contribuyentes += "Cuello: Normal, ";
        else if (rdbAlterado3.isSelected())
            contribuyentes += "Cuello: Alterado (" + txtValoracion3.getText() + "), ";
        
        if(rdbNormal4.isSelected())
            contribuyentes += "Respiratorio: Normal, ";
        else if (rdbAlterado4.isSelected())
            contribuyentes += "Respiratorio: Alterado (" + txtValoracion4.getText() + "), ";
        
        if(rdbNormal5.isSelected())
            contribuyentes += "Corazón: Normal, ";
        else if (rdbAlterado5.isSelected())
            contribuyentes += "Corazón: Alterado (" + txtValoracion5.getText() + "), ";
        
        if(rdbNormal6.isSelected())
            contribuyentes += "Abdomen: Normal, ";
        else if (rdbAlterado6.isSelected())
            contribuyentes += "Abdomen: Alterado (" + txtValoracion6.getText() + "), ";
        
        if(rdbNormal7.isSelected())
            contribuyentes += "Genitales: Normal, ";
        else if (rdbAlterado7.isSelected())
            contribuyentes += "Genitales: Alterado (" + txtValoracion7.getText() + "), ";
        
        if(rdbNormal8.isSelected())
            contribuyentes += "Extremidades: Normal, ";
        else if (rdbAlterado8.isSelected())
            contribuyentes += "Extremidades: Alterado (" + txtValoracion8.getText() + "), ";
        
        if(rdbNormal9.isSelected())
            contribuyentes += "Piel: Normal, ";
        else if (rdbAlterado9.isSelected())
            contribuyentes += "Piel: Alterado (" + txtValoracion9.getText() + "), ";

        if(rdbNormal10.isSelected())
            contribuyentes += "Neurológico: Normal.";
        else if (rdbAlterado10.isSelected())
            contribuyentes += "Neurológico: Alterado (" + txtValoracion10.getText() + ").";
        
        try {
            if(DB.agregarPaciente(txtIdentidad.getText(), cmbCarrera.getSelectedIndex() + 1, txtNombre.getText(), 
                    txtApellido.getText(), Integer.parseInt(spnEdad.getValue().toString()), sexo, 1) != 0){
                DB.guardarBase(txtIdentidad.getText(), dtf.format(now), 
                    dtf.format(now) + " " + hora + ":" + minuto + ":" + segundo
                    , dtf.format(now) + " " + horas + ":" + minutos + ":" + segundos, txtSintoma.getText(), 
                    txtHEA.getText(), Double.parseDouble(txtPeso.getText()), Double.parseDouble(txtTalla.getText())
                    ,Double.parseDouble(txtGlasgow.getText()),txtFC.getText(), txtFR.getText(), txtPA.getText(), txtT.getText(), 
                    txtPiel.getText(), txtCapilar.getText(), contribuyentes, txtDiagnostico.getText(), txtTratamiento.getText(), 
                    txtInterconsulta.getText(), txtComentario.getText());
                JOptionPane.showMessageDialog(this, "Agregado Correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No funciona wey");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresoExpediente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rdbNormal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal1ActionPerformed
        txtValoracion1.setEnabled(false);
    }//GEN-LAST:event_rdbNormal1ActionPerformed

    private void rdbNormal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal2ActionPerformed
        txtValoracion2.setEnabled(false);
    }//GEN-LAST:event_rdbNormal2ActionPerformed

    private void rdbNormal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal3ActionPerformed
        txtValoracion3.setEnabled(false);
    }//GEN-LAST:event_rdbNormal3ActionPerformed

    private void rdbNormal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal4ActionPerformed
        txtValoracion4.setEnabled(false);
    }//GEN-LAST:event_rdbNormal4ActionPerformed

    private void rdbNormal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal5ActionPerformed
        txtValoracion5.setEnabled(false);
    }//GEN-LAST:event_rdbNormal5ActionPerformed

    private void rdbNormal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal6ActionPerformed
        txtValoracion6.setEnabled(false);
    }//GEN-LAST:event_rdbNormal6ActionPerformed

    private void rdbNormal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal7ActionPerformed
        txtValoracion7.setEnabled(false);
    }//GEN-LAST:event_rdbNormal7ActionPerformed

    private void rdbNormal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal8ActionPerformed
        txtValoracion8.setEnabled(false);
    }//GEN-LAST:event_rdbNormal8ActionPerformed

    private void rdbNormal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal9ActionPerformed
        txtValoracion9.setEnabled(false);
    }//GEN-LAST:event_rdbNormal9ActionPerformed

    private void rdbNormal10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormal10ActionPerformed
        txtValoracion10.setEnabled(false);
    }//GEN-LAST:event_rdbNormal10ActionPerformed

    private void rdbAlterado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado1ActionPerformed
        txtValoracion1.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado1ActionPerformed

    private void rdbAlterado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado2ActionPerformed
        txtValoracion2.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado2ActionPerformed

    private void rdbAlterado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado3ActionPerformed
        txtValoracion3.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado3ActionPerformed

    private void rdbAlterado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado4ActionPerformed
        txtValoracion4.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado4ActionPerformed

    private void rdbAlterado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado5ActionPerformed
        txtValoracion5.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado5ActionPerformed

    private void rdbAlterado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado6ActionPerformed
        txtValoracion6.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado6ActionPerformed

    private void rdbAlterado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado7ActionPerformed
        txtValoracion7.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado7ActionPerformed

    private void rdbAlterado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado8ActionPerformed
        txtValoracion8.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado8ActionPerformed

    private void rdbAlterado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado9ActionPerformed
        txtValoracion9.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado9ActionPerformed

    private void rdbAlterado10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlterado10ActionPerformed
        txtValoracion10.setEnabled(true);
    }//GEN-LAST:event_rdbAlterado10ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double imc = Double.parseDouble(txtPeso.getText()) / (Double.parseDouble(txtTalla.getText()) * Double.parseDouble(txtTalla.getText()));
        txtIMC.setText(Double.toString(imc));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
          if(Character.isDigit(c)) {
              getToolkit().beep();
              
              evt.consume();
          }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
          if(Character.isDigit(c)) {
             
              
              evt.consume();
          }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
             
              
              evt.consume();
                            
          }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              
              
              evt.consume();
                            
          }
    }//GEN-LAST:event_txtTallaKeyTyped

    private void txtGlasgowKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGlasgowKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              
              
              evt.consume();
                            
          }
    }//GEN-LAST:event_txtGlasgowKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton rdbAlterado1;
    private javax.swing.JRadioButton rdbAlterado10;
    private javax.swing.JRadioButton rdbAlterado2;
    private javax.swing.JRadioButton rdbAlterado3;
    private javax.swing.JRadioButton rdbAlterado4;
    private javax.swing.JRadioButton rdbAlterado5;
    private javax.swing.JRadioButton rdbAlterado6;
    private javax.swing.JRadioButton rdbAlterado7;
    private javax.swing.JRadioButton rdbAlterado8;
    private javax.swing.JRadioButton rdbAlterado9;
    private javax.swing.JRadioButton rdbFemenino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JRadioButton rdbNormal1;
    private javax.swing.JRadioButton rdbNormal10;
    private javax.swing.JRadioButton rdbNormal2;
    private javax.swing.JRadioButton rdbNormal3;
    private javax.swing.JRadioButton rdbNormal4;
    private javax.swing.JRadioButton rdbNormal5;
    private javax.swing.JRadioButton rdbNormal6;
    private javax.swing.JRadioButton rdbNormal7;
    private javax.swing.JRadioButton rdbNormal8;
    private javax.swing.JRadioButton rdbNormal9;
    private javax.swing.JRadioButton rdbOtro;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCapilar;
    private javax.swing.JTextField txtChoque;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextArea txtDomicilio;
    private javax.swing.JFormattedTextField txtExpediente;
    private javax.swing.JFormattedTextField txtFC;
    private javax.swing.JFormattedTextField txtFR;
    private javax.swing.JTextField txtFrialdad;
    private javax.swing.JTextField txtGlasgow;
    private javax.swing.JTextArea txtHEA;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JFormattedTextField txtIdentidad;
    private javax.swing.JTextArea txtInterconsulta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtPA;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPiel;
    private javax.swing.JTextField txtPulso;
    private javax.swing.JTextField txtSintoma;
    private javax.swing.JFormattedTextField txtT;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextArea txtTratamiento;
    private javax.swing.JTextField txtValoracion1;
    private javax.swing.JTextField txtValoracion10;
    private javax.swing.JTextField txtValoracion2;
    private javax.swing.JTextField txtValoracion3;
    private javax.swing.JTextField txtValoracion4;
    private javax.swing.JTextField txtValoracion5;
    private javax.swing.JTextField txtValoracion6;
    private javax.swing.JTextField txtValoracion7;
    private javax.swing.JTextField txtValoracion8;
    private javax.swing.JTextField txtValoracion9;
    // End of variables declaration//GEN-END:variables
}
