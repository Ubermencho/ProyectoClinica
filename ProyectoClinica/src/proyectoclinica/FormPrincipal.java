/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import javax.swing.JOptionPane;

/**
 *
 * @author oflor
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        PanelPrincipal = new javax.swing.JPanel();
        MenuBarra = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        MainMenu = new javax.swing.JMenuItem();
        IngresarATA = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        Mantenimiento = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica UNICAH");
        setExtendedState(MAXIMIZED_BOTH);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        Archivo.setText("Archivo");

        MainMenu.setText("Menu Principal");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        Archivo.add(MainMenu);

        IngresarATA.setText("Ingreso ATA");
        IngresarATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarATAActionPerformed(evt);
            }
        });
        Archivo.add(IngresarATA);

        jMenuItem1.setText("Ingreso Expediente");
        Archivo.add(jMenuItem1);

        MenuBarra.add(Archivo);

        Consultas.setText("Consultas");
        MenuBarra.add(Consultas);

        Mantenimiento.setText("Mantenimiento");
        MenuBarra.add(Mantenimiento);

        Ayuda.setText("Ayuda");
        MenuBarra.add(Ayuda);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarATAActionPerformed
        // TODO add your handling code here:
        IngresoATA ata = new IngresoATA();
        //JOptionPane.showMessageDialog(jMenu2, this.getSize());
        ata.setSize(1380,730);
        ata.setLocation(this.getLocation());
        
        PanelPrincipal.removeAll();
        PanelPrincipal.add(ata);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_IngresarATAActionPerformed

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        PanelPrincipal.removeAll();
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        
    }//GEN-LAST:event_MainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenuItem IngresarATA;
    private javax.swing.JMenuItem MainMenu;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenuBar MenuBarra;
    public static javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
