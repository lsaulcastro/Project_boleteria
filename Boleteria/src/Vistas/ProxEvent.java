/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.GUID;
import Controlador.dao.EventoImp;
import static Vistas.PMenu.jDesktopPanePrincipal;
import javax.swing.JInternalFrame;

/**
 *
 * @author sauld
 */
public class ProxEvent extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProxEvent
     */
    private static Controlador.dao.EventoImp event = null;
    private static Controlador.GUID gui = null;
    public static Controlador.dao.CInvitado InvitadoControler = null;

    // public static Controlador.dao.EventoImp event = null;
    public static Modelo.EventoModel evenMode = null;

    public ProxEvent() {
        initComponents();
        this.setLocation(50, 25);
        this.setVisible(true);
        event = new Controlador.dao.EventoImp();
        gui = new GUID();
        event.search(JTableEvent2, null, 2);
        InvitadoControler = new Controlador.dao.CInvitado();
        // event = new EventoImp();

    }

    public static void BusquedaFiltrada() {
        String a = BusquedaEvento2.getText();
        event.search(JTableEvent2, a, 0);
    }

    public static void ComeBack() {
        gui.DeskopPnae(PMenu.jDesktopPanePrincipal, false);
        Vistas.PMenu.jInternalFrame2.setVisible(true);

    }

    public static boolean btnShow() {
        //Este evento e spara mostrar El InternalFrame y desabilitar o habilitar sus botones
        Controlador.GUID Clean = new GUID();

        JInternalFrame e = EventoImp.getinstance();
        gui.DeskopPnae(jDesktopPanePrincipal, false);
        e.setVisible(true);
        Clean.limpiar_texto(PeventosInternal.jPanelEventoMante);
        PeventosInternal.btnAgregarEvento.setEnabled(true);
        PeventosInternal.btnEditarEvento.setEnabled(false);
        return false;
    }

    public void InvitarEvento() {
        gui.DeskopPnae(jDesktopPanePrincipal, false);
        InvitadoControler.getinstanceInvi();
        DatosInvi();
    }

    public static void DatosInvi() {
        int a = JTableEvent2.getSelectedRow();
        if (a >= 0) {

            //Obtenemos el id para almacenarlo en una variable estatica
            PInvitacion.IDevento.setText(JTableEvent2.getValueAt(a, 0).toString());
            //Nombre del evento
            PInvitacion.NombreDelEvento.setText(JTableEvent2.getValueAt(a, 1).toString());

        }
    }

    public static void DeleteEvent() {
        //Obtengo la fila
        int a = JTableEvent2.getSelectedRow();
        if (a >= 0) {
            //Esto es para ontener el id
            event.delete(Integer.parseInt((String) JTableEvent2.getValueAt(a, 0)));
        }
    }

    public void InvitarEve(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            InvitarEvento();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableEvent2 = new javax.swing.JTable();
        BusquedaEvento2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnInvitacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableEvent2.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableEvent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEvent2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTableEvent2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTableEvent2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTableEvent2MousePressed(evt);
            }
        });
        JTableEvent2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTableEvent2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(JTableEvent2);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 620, 310));

        BusquedaEvento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaEvento2ActionPerformed(evt);
            }
        });
        BusquedaEvento2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaEvento2KeyReleased(evt);
            }
        });
        jPanel9.add(BusquedaEvento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 410, 30));

        jLabel12.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel12.setText("Buscar : ");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btnAtras.setBackground(new java.awt.Color(0, 120, 153));
        btnAtras.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel9.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, -1));

        jPanel10.setBackground(new java.awt.Color(0, 120, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 0), null));

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista de Eventos Proximos");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon (2).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        btnInvitacion.setBackground(new java.awt.Color(0, 120, 153));
        btnInvitacion.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnInvitacion.setText("Invitar");
        btnInvitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitacionActionPerformed(evt);
            }
        });
        jPanel9.add(btnInvitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 120, -1));

        jButton1.setBackground(new java.awt.Color(0, 120, 153));
        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableEvent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEvent2MouseClicked
        // mostrasbtnModEle(false);

        InvitarEve(evt);
    }//GEN-LAST:event_JTableEvent2MouseClicked

    private void JTableEvent2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEvent2MouseEntered
        // TODO add your handling code here: mostrasbtnModEle(true);

        
        // btnmodificar.setEnabled(true);
    }//GEN-LAST:event_JTableEvent2MouseEntered

    private void JTableEvent2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEvent2MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_JTableEvent2MouseExited

    private void JTableEvent2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEvent2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEvent2MousePressed

    private void JTableEvent2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTableEvent2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEvent2KeyPressed

    private void BusquedaEvento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaEvento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaEvento2ActionPerformed

    private void BusquedaEvento2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaEvento2KeyReleased
        // TODO add your handling code here:
        BusquedaFiltrada();
    }//GEN-LAST:event_BusquedaEvento2KeyReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnInvitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitacionActionPerformed
        // TODO add your handling code here:
        InvitarEvento();
    }//GEN-LAST:event_btnInvitacionActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:

        ComeBack();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        event.search(JTableEvent2, null, 2);
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BusquedaEvento2;
    private static javax.swing.JTable JTableEvent2;
    private javax.swing.JButton btnAtras;
    private static javax.swing.JButton btnInvitacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
