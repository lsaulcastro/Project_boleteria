/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.dao.CInvitado;
import Controlador.dao.EventoImp;
import Controlador.GUID;
import java.awt.Color;
import javax.swing.JInternalFrame;

/**
 *
 * @author sauld
 */
public class PMenu extends javax.swing.JFrame {

    /**
     * Creates new form PMenu
     */
    public static Controlador.dao.CUsuario cusuario = null;
    public static Controlador.dao.CInvitado InvitadoControler = null;
    public static Controlador.dao.EventoImp event = null;
    public static Modelo.EventoModel evenMode = null;
    public static Controlador.GUID guid = null;
    //privae static String acceso = null;
    public static String acceso = null;

    public PMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        //  MostrarEven();
        guid = new GUID();
        InvitadoControler = new CInvitado();
        event = new EventoImp();
        // System.out.println("Hola");
        event.search(JTableEvent, null, 1);
        GestionUsuario();
      //  System.out.println(acceso);

    }

    public static void LabelHover(javax.swing.JSeparator separator, int e) {

        if (e == 1) {
            separator.setForeground(Color.white);

        } else {
            separator.setForeground(Color.black);
        }

    }
    // El boton acceso tienes que crearlo

    public void GestionUsuario() {

        if (acceso.equals("Administrador")) {
            this.btnEvento.enable(true);
            this.btnPersona.enable(true);
            this.jButton3.enable(true);
            this.btnPersona1.enable(true);
            
        } else {
            this.btnEvento.enable(true);
            this.btnPersona.enable(false);
            this.btnPersona.setVisible(false);
            this.jButton3.enable(false);
            this.jButton3.setVisible(false);
            this.btnPersona1.enable(false);
            this.btnPersona1.setVisible(false);
        }
    }

    public static boolean btnShow() {
        //Este evento e spara mostrar El InternalFrame y desabilitar o habilitar sus botones
        Controlador.GUID Clean = new GUID();

        JInternalFrame e = EventoImp.getinstance();
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        e.setVisible(true);
        Clean.limpiar_texto(PeventosInternal.jPanelEventoMante);
        PeventosInternal.btnAgregarEvento.setEnabled(true);
        PeventosInternal.btnEditarEvento.setEnabled(false);
        return false;
    }

    public static void BusquedaFiltrada() {
        String a = BusquedaEvento.getText();
        event.search(JTableEvent, a, 0);
    }

    public static void DeleteEvent() {
        //Obtengo la fila
        int a = JTableEvent.getSelectedRow();
        if (a >= 0) {
            //Esto es para ontener el id
            event.delete(Integer.parseInt((String) JTableEvent.getValueAt(a, 0)));
        }
    }

    public static void mostrasbtnModEle(boolean x) {
        //Este evento es para habilitar y desabilitar los botones del InternalFranme de eventos
        int a = JTableEvent.getSelectedRow();
        if (x) {

            if (a < 0) {
                btnmodificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnAgregar.setEnabled(true);
                btnevent.setEnabled(true);
//                btnInvitacion.setEnabled(false);
            }
        } else {
            if (a >= 0) {

                btnmodificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnAgregar.setEnabled(false);
                btnevent.setEnabled(false);
                //     btnInvitacion.setEnabled(true);

            }
        }
        //    event.search(JTableEvent, null, 1);

    }

    public static void ShowInternalInvitado() {
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        InvitadoControler.getinstance();
    }

    public static void ShowInternalEvento() {
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        jInternalFrame2.setVisible(true);
    }

    public static void ShowInternalUsuario() {
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        cusuario.getinstance();
    }

    public static void proxEvent() {
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        event.getinstanceProxEven();
//        JTableEventoProximo.setVisible(true);
    }

    public static void DatosInvi() {
        int a = JTableEvent.getSelectedRow();
        if (a >= 0) {

            //Obtenemos el id para almacenarlo en una variable estatica
            PInvitacion.IDevento.setText(JTableEvent.getValueAt(a, 0).toString());
            //Nombre del evento
            PInvitacion.NombreDelEvento.setText(JTableEvent.getValueAt(a, 1).toString());

        }

    }

    public static void DatosConfir() {
        int a = JTableEvent.getSelectedRow();
        if (a >= 0) {

            //Obtenemos el id para almacenarlo en una variable estatica
            Vistas.ConfirmLlegada.IDevento.setText(JTableEvent.getValueAt(a, 0).toString());
            //Nombre del evento
            Vistas.ConfirmLlegada.NombreDelEvento.setText(JTableEvent.getValueAt(a, 1).toString());

        }

    }

    public void ConfirmLL(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 1) {
            mostrasbtnModEle(false);
        } else if (evt.getClickCount() == 2) {
            guid.DeskopPnae(jDesktopPanePrincipal, false);
            InvitadoControler.getinstanceConfir();
            DatosConfir();

        }
    }

    public void InvitarEvento() {
        guid.DeskopPnae(jDesktopPanePrincipal, false);
        InvitadoControler.getinstanceInvi();
        DatosInvi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnPersona = new javax.swing.JButton();
        btnEvento = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnPersona1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEvent = new javax.swing.JTable();
        BusquedaEvento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnevent = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jFrame1.setAlwaysOnTop(true);
        jFrame1.setBounds(new java.awt.Rectangle(123, 2342, 123, 123));
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 120, 153));

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S.&.L Eventos");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Administrador");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/admin-with-cogwheels (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel10)
                        .addGap(259, 259, 259)
                        .addComponent(jLabel4)
                        .addGap(0, 306, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 110));

        jPanel5.setBackground(new java.awt.Color(0, 120, 153));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/if_ic_menu_48px_352539.png"))); // NOI18N

        btnPersona.setBackground(new java.awt.Color(0, 120, 153));
        btnPersona.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        btnPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/users.png"))); // NOI18N
        btnPersona.setText("Persona");
        btnPersona.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonaActionPerformed(evt);
            }
        });

        btnEvento.setBackground(new java.awt.Color(0, 120, 153));
        btnEvento.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        btnEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/election-event-on-a-calendar-with-star-symbol.png"))); // NOI18N
        btnEvento.setText("Eventos");
        btnEvento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 120, 153));
        jButton3.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        jButton3.setText("Usuario");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnPersona1.setBackground(new java.awt.Color(0, 120, 153));
        btnPersona1.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        btnPersona1.setForeground(new java.awt.Color(255, 255, 255));
        btnPersona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/if_report_2199101.png"))); // NOI18N
        btnPersona1.setText("Reportes");
        btnPersona1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersona1ActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(btnPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPersona1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel8))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator6)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(btnPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 570));

        jInternalFrame2.setResizable(true);
        jInternalFrame2.setVisible(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableEvent.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableEvent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTableEventMouseMoved(evt);
            }
        });
        JTableEvent.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                JTableEventMouseWheelMoved(evt);
            }
        });
        JTableEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEventMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTableEventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTableEventMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTableEventMousePressed(evt);
            }
        });
        JTableEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTableEventKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEvent);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 620, 320));

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
        jPanel7.add(BusquedaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, -1));

        jLabel12.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel12.setText("Buscar : ");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btnevent.setBackground(new java.awt.Color(0, 120, 153));
        btnevent.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnevent.setText("Proximos Eventos");
        btnevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneventActionPerformed(evt);
            }
        });
        jPanel7.add(btnevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, -1));

        jPanel8.setBackground(new java.awt.Color(0, 120, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 0), null));

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista de Eventos");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon (2).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        btnmodificar.setBackground(new java.awt.Color(0, 120, 153));
        btnmodificar.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmodificarMouseExited(evt);
            }
        });
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel7.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 120, 153));
        btnEliminar.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 100, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 120, 153));
        btnAgregar.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel7.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 100, -1));

        jButton1.setBackground(new java.awt.Color(0, 120, 153));
        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 15)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 110, -1));

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPanePrincipal.setLayer(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jDesktopPanePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 820, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void BusquedaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaEventoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btneventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneventActionPerformed
        // TODO add your handling code here:
        proxEvent();

    }//GEN-LAST:event_btneventActionPerformed

    private void JTableEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventMouseClicked
        ConfirmLL(evt);

    }//GEN-LAST:event_JTableEventMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DeleteEvent();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        PeventosInternal.UpdateShow();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void BusquedaEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaEventoKeyReleased
        // TODO add your handling code here:
        BusquedaFiltrada();
    }//GEN-LAST:event_BusquedaEventoKeyReleased

    private void JTableEventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventMouseEntered
        // TODO add your handling code here:

        // btnmodificar.setEnabled(true);
    }//GEN-LAST:event_JTableEventMouseEntered

    private void JTableEventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTableEventKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEventKeyPressed

    private void JTableEventMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTableEventMousePressed

    private void JTableEventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventMouseExited
        // TODO add your handling code here:

        mostrasbtnModEle(true);
    }//GEN-LAST:event_JTableEventMouseExited

    private void btnPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonaActionPerformed
        // TODO add your handling code here:
        ShowInternalInvitado();
    }//GEN-LAST:event_btnPersonaActionPerformed

    private void btnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventoActionPerformed
        // TODO add your handling code here:
        ShowInternalEvento();
    }//GEN-LAST:event_btnEventoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShowInternalUsuario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        btnShow();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        event.search(JTableEvent, null, 1);
        mostrasbtnModEle(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        // mostrasbtnModEle(true);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        // TODO add your handling code here:
        //  mostrasbtnModEle(true);
    }//GEN-LAST:event_jPanel7MouseMoved

    private void JTableEventMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEventMouseMoved
        // TODO add your handling code here:
        //mostrasbtnModEle(false);
    }//GEN-LAST:event_JTableEventMouseMoved

    private void JTableEventMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_JTableEventMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEventMouseWheelMoved

    private void btnmodificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnmodificarMouseExited

    private void btnPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersona1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersona1ActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            //  java.util.logging.Logger.getLogger(PUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            //  java.util.logging.Logger.getLogger(PUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            //  java.util.logging.Logger.getLogger(PUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            //  java.util.logging.Logger.getLogger(PUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BusquedaEvento;
    public static javax.swing.JTable JTableEvent;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnPersona;
    private javax.swing.JButton btnPersona1;
    public static javax.swing.JButton btnevent;
    public static javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    public static javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JFrame jFrame1;
    public static javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
