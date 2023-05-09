package Formularios;

import BD.Conexion;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class CrearRenta extends javax.swing.JFrame {

    /**
     * Creates new form Crear_Renta
     */
    public CrearRenta() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidoP = new javax.swing.JTextField();
        jTextApellidoM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextCalle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextColonia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextNumExt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextCodigoP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextReferencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextCaracteristica = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSpinnermesas = new javax.swing.JSpinner();
        jSpinnerSillas = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jButtonRegistrarRenta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Crear Nueva Renta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Datos del Cliente");

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jTextApellidoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoPKeyTyped(evt);
            }
        });

        jTextApellidoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoMKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Paterno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Materno");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de Renta");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Calle");

        jTextCalle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCalleKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Colonia");

        jTextColonia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextColoniaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Numero Exterior");

        jTextNumExt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextNumExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumExtActionPerformed(evt);
            }
        });
        jTextNumExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNumExtKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Codigo Postal");

        jTextCodigoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextCodigoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCodigoPKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Referencias");

        jTextReferencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextReferenciaKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Caracteriticas del domicilio");

        jTextCaracteristica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextCaracteristica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCaracteristicaKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Mobiliario");

        jSpinnermesas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnermesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnermesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinnerSillas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerSillas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerSillas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Cantidad de mesas");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Cantidad de sillas");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Total:");

        jTextTotal.setEditable(false);
        jTextTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextTotalMouseClicked(evt);
            }
        });
        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });

        jButtonRegistrarRenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRegistrarRenta.setText("Registrar Renta");
        jButtonRegistrarRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarRentaActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jDate.setMaxSelectableDate(new java.util.Date(1735714903000L));
        jDate.setMinSelectableDate(new java.util.Date(1672556503000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextColonia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextReferencia)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextNombre))
                                    .addComponent(jLabel4))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11)
                                        .addComponent(jTextApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10)
                                        .addComponent(jTextNumExt)
                                        .addComponent(jTextCodigoP))))
                            .addComponent(jTextCaracteristica)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnermesas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jButtonRegistrarRenta)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSalir)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerSillas, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(jLabel15)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnermesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRegistrarRenta)
                            .addComponent(jButtonSalir))
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonRegistrarRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarRentaActionPerformed
        // TODO add your handling code here:

        String nombre;
        nombre = jTextNombre.getText();

        String apellidoP;
        apellidoP = jTextApellidoP.getText();

        String apellidoM;
        apellidoM = jTextApellidoM.getText();

        String calle;
        calle = jTextCalle.getText();

        String colonia;
        colonia = jTextColonia.getText();

        String referencia;
        referencia = jTextReferencia.getText();

        String caracteristica;
        caracteristica = jTextCaracteristica.getText();

         String numEx;
         numEx = jTextNumExt.getText();
         
         String codigoP;
         codigoP = jTextCodigoP.getText();
         
        String fechaEntrega="";
           SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yy");   
         if (jDate.getDate() !=null) {
             fechaEntrega= Formato.format(jDate.getDate());
        }

        int mesas = 0;
        mesas = (int) jSpinnermesas.getValue();

        int sillas = 0;
        sillas = (int) jSpinnerSillas.getValue();

        if (nombre.isEmpty() || apellidoP.isEmpty() || calle.isEmpty() || colonia.isEmpty() || fechaEntrega.isEmpty() || jTextNumExt.getText().isEmpty() || jTextCodigoP.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Exixten campos vacios; Nombre, Apellidos, direccion y fecha de renta son obligatorios ");
        } else {

            if (mesas > 0 || sillas > 0) {

              /*  boolean sentencia;
                sentencia = baseDatos.ejecutar("Insert into RENTAS_TABLA values('" + nombre + "','"  + apellidoM + "', '" + apellidoP + "', '" + calle + "', '" + colonia + "', '" + referencia + "','" + caracteristica + "', '" + numEx + "', '" + codigoP + "', '" + fechaEntrega + "', '" + referencia + "'               )");
               */
                if (jTextTotal.getText().isEmpty()) {
                     JOptionPane.showMessageDialog(null, "No se genero el total; por favor de clic en el campo 'total' para generar costo");
                }else{
                    
                    
                    
                     JOptionPane.showMessageDialog(null, "Renta registrada");
                     MenuPrincipal menuP = new MenuPrincipal();
                    menuP.setVisible(true);
                    this.dispose();
                     
                }
             
              
            } else {

                JOptionPane.showMessageDialog(null, "Ingresa cantidad de sillas y/o mesas ");
            }

        }


    }//GEN-LAST:event_jButtonRegistrarRentaActionPerformed

    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jTextNumExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumExtActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        GestionarRentas gest = new GestionarRentas();
        gest.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextTotalMouseClicked
        // TODO add your handling code here:
           int mesas = 0;
        mesas = (int) jSpinnermesas.getValue();

        int sillas = 0;
        sillas = (int) jSpinnerSillas.getValue();
           int total = (mesas * 25) + (sillas * 8);
              
              String totalT= total +" ";
              
              if (total==0) {
             jTextTotal.setText(null);
        }else{
                   jTextTotal.setText(totalT);
              }
              
             
    }//GEN-LAST:event_jTextTotalMouseClicked

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        // TODO add your handling code here:
        
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (numeros)
    {
        evt.consume();
    }

    if (jTextNombre.getText().trim().length() == 20) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoPKeyTyped
            // TODO add your handling code here:
            
              int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (numeros)
    {
        evt.consume();
    }

    if (jTextApellidoP.getText().trim().length() == 16) {
        evt.consume();
    }

    }//GEN-LAST:event_jTextApellidoPKeyTyped

    private void jTextApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoMKeyTyped
        // TODO add your handling code here:
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (numeros)
    {
        evt.consume();
    }

    if (jTextApellidoM.getText().trim().length() == 16) {
        evt.consume();
    }
        
    }//GEN-LAST:event_jTextApellidoMKeyTyped

    private void jTextCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCalleKeyTyped
        // TODO add your handling code here:
        
  

    if (jTextCalle.getText().trim().length() == 15) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextCalleKeyTyped

    private void jTextNumExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNumExtKeyTyped
        // TODO add your handling code here:
        
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (jTextNumExt.getText().trim().length() == 4) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextNumExtKeyTyped

    private void jTextColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextColoniaKeyTyped
        // TODO add your handling code here:
        
 

    if (jTextColonia.getText().trim().length() == 15) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextColoniaKeyTyped

    private void jTextCodigoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoPKeyTyped
        // TODO add your handling code here:
        
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (jTextCodigoP.getText().trim().length() == 5) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextCodigoPKeyTyped

    private void jTextReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextReferenciaKeyTyped
        // TODO add your handling code here:
        
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (numeros)
    {
        evt.consume();
    }

    if (jTextReferencia.getText().trim().length() == 30) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextReferenciaKeyTyped

    private void jTextCaracteristicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCaracteristicaKeyTyped
        // TODO add your handling code here:
        
          int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (numeros)
    {
        evt.consume();
    }

    if (jTextCaracteristica.getText().trim().length() == 30) {
        evt.consume();
    }
    }//GEN-LAST:event_jTextCaracteristicaKeyTyped

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
            java.util.logging.Logger.getLogger(CrearRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearRenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarRenta;
    private javax.swing.JButton jButtonSalir;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSpinner jSpinnerSillas;
    private javax.swing.JSpinner jSpinnermesas;
    private javax.swing.JTextField jTextApellidoM;
    private javax.swing.JTextField jTextApellidoP;
    private javax.swing.JTextField jTextCalle;
    private javax.swing.JTextField jTextCaracteristica;
    private javax.swing.JTextField jTextCodigoP;
    private javax.swing.JTextField jTextColonia;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumExt;
    private javax.swing.JTextField jTextReferencia;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables
}
