/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import logico.RegistroCarros;

/**
 *
 * @author laboratorio
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    public static RegistroCarros Gestora = new RegistroCarros();
    public static ModuloAutomovil vModuloAutomovil = new ModuloAutomovil();
    public static ModuloMotocicleta vModuloMotocicleta = new ModuloMotocicleta();
    public static ModuloCamion vModuloCamion = new ModuloCamion();
    public static ModuloAutobus vModuloAutobus = new ModuloAutobus();
    public static ModuloCitas vModuloCitas = new ModuloCitas();
    public static MostrarDatos vMostrarDatos = new MostrarDatos();
    public static FrmModuloConsultas vMostrarConsultas = new FrmModuloConsultas();
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Pantalla Principal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrincipalCitasRiteve = new javax.swing.JButton();
        btnPrincipalAutomoviles = new javax.swing.JButton();
        btnPrincipalMotocicletas = new javax.swing.JButton();
        btnPrincipalAutobuses = new javax.swing.JButton();
        btnPrincipalCamion = new javax.swing.JButton();
        lblSelecioneModulo = new javax.swing.JLabel();
        btnMostrarVehiculos = new javax.swing.JButton();
        btnPrincipalConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipalCitasRiteve.setText("Citas RITEVE");
        btnPrincipalCitasRiteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalCitasRiteveActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalCitasRiteve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        btnPrincipalAutomoviles.setText("AutoMóviles");
        btnPrincipalAutomoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalAutomovilesActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalAutomoviles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        btnPrincipalMotocicletas.setText("Motocicletas");
        btnPrincipalMotocicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalMotocicletasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalMotocicletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, -1));

        btnPrincipalAutobuses.setText("AutoBuses");
        btnPrincipalAutobuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalAutobusesActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalAutobuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        btnPrincipalCamion.setText("Camiónes");
        btnPrincipalCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalCamionActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        lblSelecioneModulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSelecioneModulo.setText("Seleccione un Módulo");
        jPanel1.add(lblSelecioneModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnMostrarVehiculos.setText("Mostrar Datos");
        btnMostrarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        btnPrincipalConsultas.setText("Consultas Todas");
        btnPrincipalConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalAutomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalAutomovilesActionPerformed
        // TODO add your handling code here:
        vModuloAutomovil.setVisible(true);
    }//GEN-LAST:event_btnPrincipalAutomovilesActionPerformed

    private void btnPrincipalMotocicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMotocicletasActionPerformed
        // TODO add your handling code here:
        vModuloMotocicleta.setVisible(true);
    }//GEN-LAST:event_btnPrincipalMotocicletasActionPerformed

    private void btnPrincipalCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalCamionActionPerformed
        // TODO add your handling code here:
        vModuloCamion.setVisible(true);
    }//GEN-LAST:event_btnPrincipalCamionActionPerformed

    private void btnPrincipalAutobusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalAutobusesActionPerformed
        // TODO add your handling code here:
        vModuloAutobus.setVisible(true);
    }//GEN-LAST:event_btnPrincipalAutobusesActionPerformed

    private void btnPrincipalCitasRiteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalCitasRiteveActionPerformed
        // TODO add your handling code here:
        vModuloCitas.setVisible(true);
    }//GEN-LAST:event_btnPrincipalCitasRiteveActionPerformed

    private void btnMostrarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVehiculosActionPerformed
        // TODO add your handling code here:
        vMostrarDatos.setVisible(true); 
    }//GEN-LAST:event_btnMostrarVehiculosActionPerformed

    private void btnPrincipalConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalConsultasActionPerformed
        vMostrarConsultas.setVisible(true);
    }//GEN-LAST:event_btnPrincipalConsultasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVehiculos;
    private javax.swing.JButton btnPrincipalAutobuses;
    private javax.swing.JButton btnPrincipalAutomoviles;
    private javax.swing.JButton btnPrincipalCamion;
    private javax.swing.JButton btnPrincipalCitasRiteve;
    private javax.swing.JButton btnPrincipalConsultas;
    private javax.swing.JButton btnPrincipalMotocicletas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSelecioneModulo;
    // End of variables declaration//GEN-END:variables
}
