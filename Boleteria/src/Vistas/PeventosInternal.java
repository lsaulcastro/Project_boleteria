/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.GUID;
import Controlador.dao.EventoImp;
import Modelo.EventoModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import static Vistas.PMenu.JTableEvent;

/**
 *
 * @author sauld
 */
public class PeventosInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form PeventosInternal
     */
    public static Controlador.dao.EventoImp event = null;
    public static Modelo.EventoModel evenMode = null;
    public static Controlador.GUID gui = null;

    public PeventosInternal() {

        initComponents();
        this.setLocation(190, 40);
        event = new EventoImp();
        gui = new GUID();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * regenerated by the Form Editor. * WARNING: Do NOT modify this code. The
     * content of this method is always
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEventoMante = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEvento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtUbicacionEvento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarEvento = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnEditarEvento = new javax.swing.JButton();
        TxtTipoEvento = new javax.swing.JComboBox<>();
        TxtFechaEvento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanelEventoMante.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelEventoMante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("2017-12-31");
        jPanelEventoMante.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));
        jPanelEventoMante.add(txtNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 261, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha:");
        jPanelEventoMante.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanelEventoMante.add(TxtUbicacionEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 261, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tipo:");
        jPanelEventoMante.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Direccion:");
        jPanelEventoMante.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnAgregarEvento.setBackground(new java.awt.Color(0, 120, 153));
        btnAgregarEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEvento.setText("Agregar");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });
        jPanelEventoMante.add(btnAgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 140, 40));

        btnAtras.setBackground(new java.awt.Color(0, 120, 153));
        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanelEventoMante.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 120, 40));

        btnEditarEvento.setBackground(new java.awt.Color(0, 120, 153));
        btnEditarEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEvento.setText("Editar");
        btnEditarEvento.setEnabled(false);
        btnEditarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarEventoMouseClicked(evt);
            }
        });
        btnEditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEventoActionPerformed(evt);
            }
        });
        jPanelEventoMante.add(btnEditarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 130, 40));

        TxtTipoEvento.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        TxtTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiesta", "Boda", "Reunion", "Serrucho", "Empaguetada", "Graduacion" }));
        TxtTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTipoEventoActionPerformed(evt);
            }
        });
        jPanelEventoMante.add(TxtTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 260, 40));

        try {
            TxtFechaEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFechaEvento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtFechaEvento.setText("    -    -");
        jPanelEventoMante.add(TxtFechaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 260, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nombre: ");
        jPanelEventoMante.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel10.setText("Formato");
        jPanelEventoMante.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 120, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Evento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEventoMante, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEventoMante, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void UpdateShow() {
        int a = JTableEvent.getSelectedRow();

        if (a >= 0) {
            // if (nombreEvento.getText().length() >= 1 && FechaEvento.getText().length() > 1 && 1 <= UbicacionEvento.getText().length()) {

            PMenu.btnShow();
            //Esto es para desabilitar los botones que no son necesarion para esta opcion
             btnAgregarEvento.setEnabled(false);
            btnEditarEvento.setEnabled(true);
            //Esto es para desabilitar los botones que no son necesarion para esta opcion

            txtNombreEvento.setText(JTableEvent.getValueAt(a, 1).toString());
            TxtFechaEvento.setText(JTableEvent.getValueAt(a, 2).toString());
            TxtUbicacionEvento.setText(JTableEvent.getValueAt(a, 3).toString());
            TxtTipoEvento.setSelectedItem(JTableEvent.getValueAt(a, 4).toString());
            PMenu.btnmodificar.setEnabled(true);
            PMenu.btnmodificar.setEnabled(true);

        }
    }

//    public static java.sql.Date FechaActual() {
//        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("####-##-##");
//        java.util.Date utilDate = new java.util.Date();
//        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//        return sqlDate;
//    }
    public static void UpdateAction() throws Exception {
        int a = JTableEvent.getSelectedRow();

        if (!txtNombreEvento.getText().isEmpty() && !TxtFechaEvento.getText().isEmpty() && !TxtUbicacionEvento.getText().isEmpty()) {
            btnAgregarInternalFrameEvento(txtNombreEvento, TxtFechaEvento, TxtUbicacionEvento, TxtTipoEvento, 1);

        } else {
            JOptionPane.showMessageDialog(null, "No deje campos vacios.");

        }
    }

    public static void btnAgregarInternalFrameEvento(JTextField nombre, JFormattedTextField Fecha, JTextField Ubicacion, JComboBox Tipo, int x) throws Exception {
        int a = JTableEvent.getSelectedRow();

        if (x == 0) {
            if (!nombre.getText().isEmpty() && !Fecha.getText().isEmpty() && !Ubicacion.getText().isEmpty()) {

                evenMode = new EventoModel(nombre.getText(), gui.formateadorFecha(Fecha.getText()), Ubicacion.getText(), Tipo.getSelectedItem().toString());
                event.save(evenMode);

            } else {
                JOptionPane.showMessageDialog(null, "No deje campos vacios.");
            }
        } else {
            evenMode = new EventoModel(nombre.getText(), gui.formateadorFecha(Fecha.getText()), Ubicacion.getText(), Tipo.getSelectedItem().toString());

            if (a >= 0) {
                event.update(evenMode, Integer.parseInt(JTableEvent.getValueAt(a, 0).toString()));
            }

        }

    }

    public static void ComeBack() {
        gui.DeskopPnae(PMenu.jDesktopPanePrincipal,false);
        Vistas.PMenu.jInternalFrame2.setVisible(true);
    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        ComeBack();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        //  TODO add your handling code here:
        try {
            btnAgregarInternalFrameEvento(txtNombreEvento, TxtFechaEvento, TxtUbicacionEvento, TxtTipoEvento, 0);
        } catch (Exception e) {
            System.out.println(" Error" + e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnEditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEventoActionPerformed
        try {
            // TODO add your handling code here:

            UpdateAction();
        } catch (Exception ex) {
            Logger.getLogger(PeventosInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarEventoActionPerformed

    private void btnEditarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarEventoMouseClicked
        // TODO add your handling code heupre:
        //   Update_Delete(evt);
    }//GEN-LAST:event_btnEditarEventoMouseClicked

    private void TxtTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTipoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTipoEventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFormattedTextField TxtFechaEvento;
    public static javax.swing.JComboBox<String> TxtTipoEvento;
    public static javax.swing.JTextField TxtUbicacionEvento;
    public static javax.swing.JButton btnAgregarEvento;
    public static javax.swing.JButton btnAtras;
    public static javax.swing.JButton btnEditarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanelEventoMante;
    public static javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables
}
