/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author sauld
 */
public class P_InvitadosInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form P_InvitadosInternalFrame
     */
    public P_InvitadosInternalFrame() {
        initComponents();
        this.setLocation(65, 10);
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEvento = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        BusquedaEvento = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        buttonGroup1.add(Femenino);
        buttonGroup1.add(Masculino);

        setName(""); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 120, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 0), null));

        jLabel13.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Manteminiemto Invitado");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon (2).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre: ");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel7.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Apellido:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel7.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel7.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sexo:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });
        jPanel7.add(Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        Femenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Femenino.setText("Femenino");
        jPanel7.add(Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Direccion:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));
        jPanel7.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Email: ");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, 33));
        jPanel7.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 210, 32));

        JTableEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha", "Ubicacion", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        JTableEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEventoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTableEventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTableEventoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTableEventoMousePressed(evt);
            }
        });
        JTableEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTableEventoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEvento);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 650, 170));

        jLabel12.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel12.setText("Buscar : ");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        BusquedaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaEventoActionPerformed(evt);
            }
        });
        BusquedaEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaEventoKeyReleased(evt);
            }
        });
        jPanel7.add(BusquedaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 212, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 120, 153));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel7.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 100, -1));

        btnmodificar.setBackground(new java.awt.Color(0, 120, 153));
        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel7.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 120, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasculinoActionPerformed

    private void JTableEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventoMouseClicked
  
    }//GEN-LAST:event_JTableEventoMouseClicked

    private void JTableEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventoMouseEntered
        // TODO add your handling code here:
        
        // btnmodificar.setEnabled(true);
    }//GEN-LAST:event_JTableEventoMouseEntered

    private void JTableEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventoMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_JTableEventoMouseExited

    private void JTableEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEventoMousePressed

    private void JTableEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTableEventoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEventoKeyPressed

    private void BusquedaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaEventoActionPerformed

    private void BusquedaEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaEventoKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BusquedaEventoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling 
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BusquedaEvento;
    private javax.swing.JRadioButton Femenino;
    public static javax.swing.JTable JTableEvento;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JTextField apellido;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
