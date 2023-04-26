/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import BD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author omar0
 */
public class GestionarMobiliario extends javax.swing.JFrame {

    /**
     * Creates new form GestionarMobiliario
     */
    public GestionarMobiliario() {
        initComponents();
    }
    Conexion baseDatos = new Conexion().conectar();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextsillas = new javax.swing.JTextField();
        jTextmesas = new javax.swing.JTextField();
        jButtonGenerarMobiliario = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerSillaA = new javax.swing.JSpinner();
        jSpinnerSillaB = new javax.swing.JSpinner();
        jSpinnerMesaA = new javax.swing.JSpinner();
        jSpinneMesaB = new javax.swing.JSpinner();
        jButtonAgregar = new javax.swing.JToggleButton();
        jButtonBaja = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JToggleButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Gestionar Rentas");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Gestionar Mobiliario");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total de sillas:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total de mesas:");

        jTextsillas.setEditable(false);
        jTextsillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsillasActionPerformed(evt);
            }
        });

        jTextmesas.setEditable(false);
        jTextmesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmesasActionPerformed(evt);
            }
        });

        jButtonGenerarMobiliario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGenerarMobiliario.setText("Generar Mobiliario");
        jButtonGenerarMobiliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarMobiliarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Dar de alta");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Dar de baja");

        jSpinnerSillaA .setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerSillaA .setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerSillaA .setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinnerSillaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerSillaB .setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerSillaB .setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinnerMesaA .setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerMesaA .setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerMesaA .setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinneMesaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinneMesaB.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinneMesaB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonBaja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBaja.setText("Baja");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sillas");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Sillas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Mesas");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mesas");

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jTextsillas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextmesas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinnerSillaA, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jSpinnerMesaA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinnerSillaB, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jSpinneMesaB))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButtonGenerarMobiliario)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextsillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGenerarMobiliario)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerSillaB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jSpinneMesaB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jSpinnerSillaA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jSpinnerMesaA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarMobiliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarMobiliarioActionPerformed
        try {
            // TODO add your handling code here:
            int noSillas = 0;
            int noMesas = 0;
            ResultSet resultado = baseDatos.consultar("SELECT * FROM MOBILARIO_TABLA ");

            if (resultado.next()) {
                noSillas = resultado.getInt("mobilario_cantidad_sillas");
                noMesas = resultado.getInt("mobilario_cantidad_mesas");

                String sillas = noSillas + " ";
                String mesas = noMesas + "";

                jTextsillas.setText(sillas);
                jTextmesas.setText(mesas);

            } else {
                JOptionPane.showMessageDialog(null, "No hay mobiliario registrado", null, JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionarMobiliario.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonGenerarMobiliarioActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:

       
// Constructor pasadole una semilla
Random numAleatorio = new Random(100);

// Numero entero entre 25 y 75
int n = numAleatorio.nextInt(900-100+1) + 100;
        String id= n+ "";
        
        char T='1';

        int mesas = 0;
        mesas = (int) jSpinnerMesaA.getValue();

        int sillas = 0;
        sillas = (int) jSpinnerSillaA.getValue();

        if (sillas != 0 || mesas != 0) {

            if (sillas ==0) {
                     boolean sentencia;
            sentencia = baseDatos.ejecutar("Insert into MOBILARIO_TABLA values(' " + id + " ', ' Null ', ' " + mesas + " ', '1', '1') ");

            if (sentencia == true) {
                JOptionPane.showMessageDialog(null, "Se registro correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar ");
                      } 
            }else if (mesas==0){
                
                     boolean sentencia;
            sentencia = baseDatos.ejecutar("Insert into MOBILARIO_TABLA values(' " + id + " ', ' " + sillas + " ', ' Null ', '1', '1') ");

            if (sentencia == true) {
                JOptionPane.showMessageDialog(null, "Se registro correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar ");
            }

    }else{
                
            
            
                 boolean sentencia;
            sentencia = baseDatos.ejecutar("Insert into MOBILARIO_TABLA values(' " + id + " ', ' " + sillas + " ', ' " + mesas + " ', '1', '1') ");

            if (sentencia == true) {
                JOptionPane.showMessageDialog(null, "Se registro correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar ");

            }
    } 
            
            
            
        


    }//GEN-LAST:event_jButtonAgregarActionPerformed
 else {

            JOptionPane.showMessageDialog(null, "Ingresa la cantidad de sillas o mesas a registrar");
        }
    }
        
    private void jTextsillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsillasActionPerformed

    private void jTextmesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmesasActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jTextmesasActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarMobiliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarMobiliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarMobiliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarMobiliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarMobiliario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonAgregar;
    private javax.swing.JToggleButton jButtonBaja;
    private javax.swing.JToggleButton jButtonGenerarMobiliario;
    private javax.swing.JToggleButton jButtonSalir;
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
    private javax.swing.JSpinner jSpinneMesaB;
    private javax.swing.JSpinner jSpinnerMesaA;
    private javax.swing.JSpinner jSpinnerSillaA;
    private javax.swing.JSpinner jSpinnerSillaB;
    private javax.swing.JTextField jTextmesas;
    private javax.swing.JTextField jTextsillas;
    // End of variables declaration//GEN-END:variables
}
