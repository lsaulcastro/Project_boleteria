/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.dao.CInvitado;
import Controlador.GUID;
import static Controlador.dao.CUsuario.a;
import Modelo.InvitadosModel;
import static Vistas.P_InvitadosInternalFrame.persona;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Vistas.P_InvitadosInternalFrame.JtablePersona;
import javax.swing.JInternalFrame;

/**
 *
 * @author sauld
 */
public class P_InvitadosInternalFrame extends javax.swing.JInternalFrame {

    public static CInvitado persona = null;
    public static InvitadosModel invimodel = null;
    /**
     * Creates new form P_InvitadosInternalFram
     */

    public static GUID guid = null;

    public P_InvitadosInternalFrame() {
        initComponents();
        guid = new GUID();
        this.setLocation(60, 10);
        persona = new CInvitado();
        persona.search(JtablePersona, null, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelPrincipalInvitado = new javax.swing.JPanel();
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
        jLabel7 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePersona = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        perf = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        sexo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setName(""); // NOI18N

        JpanelPrincipalInvitado.setBackground(new java.awt.Color(255, 255, 255));
        JpanelPrincipalInvitado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        JpanelPrincipalInvitado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        JpanelPrincipalInvitado.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre: ");
        JpanelPrincipalInvitado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        JpanelPrincipalInvitado.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Apellido:");
        JpanelPrincipalInvitado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        JpanelPrincipalInvitado.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        JpanelPrincipalInvitado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        JpanelPrincipalInvitado.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sexo:");
        JpanelPrincipalInvitado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Direccion:");
        JpanelPrincipalInvitado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));
        JpanelPrincipalInvitado.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 210, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Email: ");
        JpanelPrincipalInvitado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 33));
        JpanelPrincipalInvitado.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 210, 32));

        JtablePersona.setModel(new javax.swing.table.DefaultTableModel(
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
        JtablePersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtablePersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JtablePersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JtablePersonaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtablePersonaMousePressed(evt);
            }
        });
        JtablePersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtablePersonaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JtablePersona);

        JpanelPrincipalInvitado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 650, 170));

        jLabel12.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel12.setText("Buscar : ");
        JpanelPrincipalInvitado.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        perf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfActionPerformed(evt);
            }
        });
        perf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perfKeyReleased(evt);
            }
        });
        JpanelPrincipalInvitado.add(perf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 212, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 120, 153));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        JpanelPrincipalInvitado.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 100, 30));

        btnmodificar.setBackground(new java.awt.Color(0, 120, 153));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        JpanelPrincipalInvitado.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(0, 120, 153));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        JpanelPrincipalInvitado.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 100, 30));

        sexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        JpanelPrincipalInvitado.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 210, 40));
        JpanelPrincipalInvitado.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 252, 650, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelPrincipalInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelPrincipalInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void UpdateAction(JTextField nombre, JTextField apellido,
            JTextField telefono, JComboBox sexo, JTextField direccion, JTextField email, int x) {
        int a = JtablePersona.getSelectedRow();

        persona = new CInvitado();

        if (!nombre.getText().isEmpty() && !apellido.getText().isEmpty() && !telefono.getText().isEmpty() && !direccion.getText().isEmpty() && !email.getText().isEmpty()) {

            invimodel = new InvitadosModel(nombre.getText(), apellido.getText(), telefono.getText(), direccion.getText(), sexo.getSelectedItem().toString(), email.getText());
            persona.save(invimodel);
            if (x != 0) {
                persona.update(invimodel, Integer.parseInt(JtablePersona.getValueAt(a, 0).toString()));
            }
              
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

    public static void UpdateShow(JTextField nombre, JTextField apellido,
            JTextField telefono, JComboBox sexo, JTextField direccion, JTextField email) {
        int a = JtablePersona.getSelectedRow();

        if (a >= 0) {
            // if (nombreEvento.getText().length() >= 1 && FechaEvento.getText().length() > 1 && 1 <= UbicacionEvento.getText().length()) {

            // PMenu.btnShow();
            //Esto es para desabilitar los botones que no son necesarion para esta opcion
            btnAgregar.setEnabled(false);
            btnmodificar.setEnabled(true);
            //Esto es para desabilitar los botones que no son necesarion para esta opcion

//            nombre.setText(JtablePersona.getValueAt(a, 1).toString());
//            apellido.setText(JtablePersona.getValueAt(a, 2).toString());
//            telefono.setText(JtablePersona.getValueAt(a, 3).toString());
//            direccion.setText(JtablePersona.getValueAt(a, 4).toString());
//            sexo.setSelectedItem(JtablePersona.getValueAt(a, 5).toString());
//            email.setText(JtablePersona.getValueAt(a, 6).toString());
            
            invimodel = new InvitadosModel(nombre.getText(), apellido.getText(), telefono.getText(), direccion.getText(), sexo.getSelectedItem().toString(), email.getText());
            persona.update(invimodel,Integer.parseInt(JtablePersona.getValueAt(a, 0).toString()));
            PMenu.btnmodificar.setEnabled(true);
            PMenu.btnmodificar.setEnabled(true);

        }
    }

    public static boolean btnShow() {
        //Este evento e spara mostrar El InternalFrame y desabilitar o habilitar sus botones
        Controlador.GUID Clean = new GUID();

        JInternalFrame e = CInvitado.getinstance();

        guid.DeskopPnae(PMenu.jDesktopPanePrincipal, false);
        e.setVisible(true);
        Clean.limpiar_texto(PeventosInternal.jPanelEventoMante);
        // PeventosInternal.btnAgregar.setEnabled(true);
        PeventosInternal.btnEditarEvento.setEnabled(false);
        return false;
    }


    private void JtablePersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablePersonaMouseClicked
        mostrasbtnModEle(false);
        persona.actualizar(nombre, apellido, telefono, sexo, direccion, email);
    }//GEN-LAST:event_JtablePersonaMouseClicked

    private void JtablePersonaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablePersonaMouseEntered

    }//GEN-LAST:event_JtablePersonaMouseEntered

    private void JtablePersonaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablePersonaMouseExited
        // mostrasbtnModEle(true);

    }//GEN-LAST:event_JtablePersonaMouseExited

    private void JtablePersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablePersonaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtablePersonaMousePressed

    private void JtablePersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtablePersonaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtablePersonaKeyPressed

    private void perfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfActionPerformed

    private void perfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perfKeyReleased

       // persona.BusquedaFiltrada(perf);

      persona.BusquedaFiltrada(perf,JtablePersona);
       

    }//GEN-LAST:event_perfKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //    JCombobox1
        persona.btnAgregarInternalFrameInvitados(nombre, apellido, telefono, sexo, direccion, email);

        //btnAgregarInternalFrameInvitados(nombre,apellido,telefono,butt,direccion,email);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
<<<<<<< HEAD
        
        UpdateShow(nombre,apellido,telefono,sexo,direccion,email);
       UpdateAction(nombre,apellido,telefono,sexo,direccion,email);
       
=======

     //  UpdateShow(nombre,apellido,telefono,sexo,direccion,email);
       UpdateAction(nombre, apellido, telefono, sexo, direccion, email, 1);

>>>>>>> f44b4d28932e7b89b51136d6ef64e0eaa2977e21
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // persona.delete(WIDTH);
        persona.DeletePersona();
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel JpanelPrincipalInvitado;
    public static javax.swing.JTable JtablePersona;
    private static javax.swing.JTextField apellido;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnmodificar;
    private static javax.swing.JTextField direccion;
    private static javax.swing.JTextField email;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTextField nombre;
    public static javax.swing.JTextField perf;
    private javax.swing.JComboBox<String> sexo;
    private static javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
