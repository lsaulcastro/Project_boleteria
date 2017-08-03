/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.dao.CInvitado;
import Controlador.dao.CUsuario;
import Modelo.InvitadosModel;
import Modelo.UsuarioModel;
import static Vistas.P_InvitadosInternalFrame.JtablePersona;
import static Vistas.P_InvitadosInternalFrame.btnAgregar;
import static Vistas.P_InvitadosInternalFrame.btnEliminar;
import static Vistas.P_InvitadosInternalFrame.btnmodificar;
import static Vistas.P_InvitadosInternalFrame.invimodel;
import static Vistas.P_InvitadosInternalFrame.persona;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class P_Usuario extends javax.swing.JInternalFrame {
    
    public static UsuarioModel musuario = null;
    public static CUsuario cusuario = null;

    /**
     * Creates new form P_Usuario
     */
    public P_Usuario() {
        initComponents();
        this.setLocation(65, 10);
        cusuario = new CUsuario();
        cusuario.search(JtableUsuario, null,0);
    }
    
  
     public static void UpdateAction(JTextField nombre, JTextField apellido, 
           JTextField usuario, JComboBox perfilusaurio ,JTextField password, JTextField email, JTextField persona_idpersona) {
        int a = JtablePersona.getSelectedRow();
        
        cusuario = new CUsuario();
        
        if (nombre.getText().length() >= 1 && apellido.getText().length() > 1 && 1 <= usuario.getText().length() && password .getText().length() >=1 ) {

                musuario = new UsuarioModel(nombre.getText(), apellido.getText(), usuario.getText(),perfilusaurio.getSelectedItem().toString(),password.getText(),persona_idpersona.getText());
                persona.save(invimodel);

            } else {
                JOptionPane.showMessageDialog(null, "No deje campos vacios.");
            }

   }
    
     public static void mostrasbtnModEle(boolean x) {
        //Este evento es para habilitar y desabilitar los botones del InternalFranme de eventos
        int a = JtablePersona.getSelectedRow();
        if (x) {

            if (a < 0) {
                btnmodificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnAgregar.setEnabled(true);
            }
        } else {
            if (a >= 0) {

                btnmodificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnAgregar.setEnabled(false);
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contrasena = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        perfilusuario = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableUsuario = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        persona_idpersona = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 120, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Buscar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 197, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 220, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Perfil Usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 120, 153));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 110, 40));

        btnAgregar.setBackground(new java.awt.Color(0, 120, 153));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, 40));

        btnmodificar.setBackground(new java.awt.Color(0, 120, 153));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Editar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 110, 40));

        perfilusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        perfilusuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PORTERO" }));
        jPanel1.add(perfilusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 670, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 280, 30));

        JtableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JtableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JtableUsuarioMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(JtableUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 670, 140));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Usuario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("IdPersona:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 220, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Contrasena: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        persona_idpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persona_idpersonaActionPerformed(evt);
            }
        });
        jPanel1.add(persona_idpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 110, 40));

        jButton1.setBackground(new java.awt.Color(0, 120, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

      //  btnAgregarInternalFrameEvento(nombreEvento, FechaEvento, UbicacionEvento, TipoEvento, 0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       cusuario.btnAgregar(usuario,contrasena,perfilusuario,nombre,apellido,persona_idpersona);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void JtableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableUsuarioMouseClicked
         mostrasbtnModEle(false);
    }//GEN-LAST:event_JtableUsuarioMouseClicked

    private void JtableUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableUsuarioMouseExited
         mostrasbtnModEle(true);
    }//GEN-LAST:event_JtableUsuarioMouseExited

    private void persona_idpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persona_idpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persona_idpersonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableUsuario;
    private javax.swing.JTextField apellido;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnmodificar;
    private javax.swing.JTextField contrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> perfilusuario;
    private javax.swing.JTextField persona_idpersona;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
