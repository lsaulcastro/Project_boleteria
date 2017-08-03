/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.dao;

import Modelo.InvitadosModel;
import Modelo.ModeloDatos;
import Vistas.PMenu;
import static Vistas.P_InvitadosInternalFrame.JtablePersona;
import static Vistas.P_InvitadosInternalFrame.guid;
import static Vistas.P_InvitadosInternalFrame.invimodel;
import static Vistas.P_InvitadosInternalFrame.persona;
import Vistas.P_Usuario;
import static Vistas.PeventosInternal.gui;
import Vistas.Puser;
import static Vistas.Puser.jTable1;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static Vistas.P_InvitadosInternalFrame.perf;

/**
 *
 * @author sauld
 */
public class CInvitado implements Modelo.dao.InvitadoRepository {

    private static JInternalFrame em = null;
    private static JInternalFrame em1 = null;
    private static JInternalFrame em2 = null;
    private static JInternalFrame em3 = null;
    private static JInternalFrame em4 = null;
    private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;
    public static P_Usuario pu = null;

    @Override
    public void save(InvitadosModel en) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {

            md.connectar();
            sql = "INSERT INTO `persona`( `nombre`, `apellido`, `Telefono`, `direccion`, `sexo`, `email`) VALUES (?,?,?,?,?,?)";
            presta = md.getConn().prepareStatement(sql);
            presta.setString(1, en.getNombre());
            presta.setString(2, en.getAppellido());
            presta.setString(3, en.getTelefono());
            presta.setString(4, en.getDireccion());
            presta.setString(5, en.getSexo());
            presta.setString(6, en.getEmail());

            int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Persona agregado Correctamente");
            }

        } catch (Exception o) {
            System.out.println("Error! de  Base Datos" + o.getMessage());
        }

    }

    @Override
    public void update(InvitadosModel en, int x) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            md.connectar();
            sql = "update persona set nombre ='" + en.getNombre() + "', apellido ='" + en.getAppellido() + "', Telefono ='" + en.getTelefono() + "', direccion ='" + en.getDireccion() + "', sexo='" + en.getSexo() + "', email =" + en.getEmail() + "'where idPersona ='" + x + "'";
            presta = md.getConn().prepareStatement(sql);
            presta.executeUpdate();

        } catch (Exception o) {
            JOptionPane.showMessageDialog(null, o.getMessage());
        }
        md.desconnectar();
    }

    @Override
    public JTable search(JTable en, String a, int b) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (a != null) {
            sql = "SELECT * FROM persona WHERE idPersona LIKE '%" + a + "%'"
                    + "OR nombre LIKE '%" + a + "%'" + "OR apellido LIKE '%" + a + "%'"
                    + "OR Telefono LIKE '%" + a + "%'" + "OR direccion LIKE '%" + a + "%'" + "OR sexo LIKE '&" + a + "&'" + "OR email LIKE '&" + a + "&'";
        }
        if (a == null) {
            sql = "SELECT * FROM `persona`";
        }

        String[] tituloEmple = {"ID", "Nombre", "Apellido", "Telefono", "Direccion", "Sexo", "Email"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[7];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);
                values[2] = rs.getString(3);
                values[3] = rs.getString(4);
                values[4] = rs.getString(5);
                values[5] = rs.getString(6);
                values[6] = rs.getString(7);
                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            en.setRowHeight(30); 
            en.setModel(m);

        return en;

    }

    @Override
    public void delete(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sql = "DELETE FROM persona WHERE idPersona = '" + id + "'";
        try {
            md.connectar();
            s = md.getConn().createStatement();
            //s.executeUpdate(sql);
            if (s.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Persona Eliminada!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<InvitadosModel> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static JInternalFrame getinstance() {
        if (em == null) {
            em = new Vistas.P_InvitadosInternalFrame();

            Vistas.PMenu.jDesktopPanePrincipal.add(em);

        }
        em.setVisible(true);
        return em;
    }

    public static JInternalFrame getinstanceInvi() {
        if (em1 == null) {
            em1 = new Vistas.PInvitacion();

            Vistas.PMenu.jDesktopPanePrincipal.add(em1);

        }
        em1.setVisible(true);
        return em1;
    }

    public static JInternalFrame getinstanceConfir() {
        if (em2 == null) {
            em2 = new Vistas.ConfirmLlegada();

            Vistas.PMenu.jDesktopPanePrincipal.add(em2);

        }
        em2.setVisible(true);
        return em2;
    }

    public void Invitar(int idPersona, int idEvento, int estado) {
        sql = "INSERT INTO `invitacion`(`Persona_idPersona`, `Eventos_idEventos`, `Estado`) VALUES (?,?,?)";
        try {
            md.connectar();

            presta = md.getConn().prepareStatement(sql);
            presta = md.getConn().prepareStatement(sql);
            presta.setInt(1, idPersona);
            presta.setInt(2, idEvento);
            presta.setInt(3, estado);
            int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Persona invitada al evento");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, ESTA PERSONA YA SE ENCUENTRA EN LA \nLISTA DE INVITADOS");
            System.out.println("Error " + e.getMessage());
        }

    }

    public static void btnAgregarInternalFrameInvitados(JTextField nombre, JTextField apellido,
            JTextField telefono, JComboBox sexo, JTextField direccion, JTextField email) {

        persona = new CInvitado();

        if (!nombre.getText().isEmpty() && !apellido.getText().isEmpty() && !telefono.getText().isEmpty() && !direccion.getText().isEmpty() && !email.getText().isEmpty()) {

            invimodel = new InvitadosModel(nombre.getText(), apellido.getText(), telefono.getText(), direccion.getText(), sexo.getSelectedItem().toString(), email.getText());
            persona.save(invimodel);

        } else {
            JOptionPane.showMessageDialog(null, "No deje campos vacios.");
        }
        //guid.limpiar_texto(JpanelPrincipalInvitado);

    }

    public static void DeletePersona() {
        int a = JtablePersona.getSelectedRow();
        if (a >= 0) {
            persona.delete(Integer.parseInt((String) JtablePersona.getValueAt(a, 0)));
        }
    }

    public static void BusquedaFiltrada(JTextField perf, JTable b) {
        String a = perf.getText();
<<<<<<< HEAD
        persona = new CInvitado();
        persona.search(jTable1, a, 0);
=======
        persona.search(b, a, 0);
>>>>>>> 1233109db1d3b001ef7d61e89c2f9e15118aac70
    }

    public static void ComeBack() {
        gui.DeskopPnae(PMenu.jDesktopPanePrincipal, false);
        em = new Vistas.P_Usuario();
        em.setVisible(true);
    }

    public static void Select() {
        int a = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(a, 0).toString();
        String nom = jTable1.getValueAt(a, 1).toString();
        String ape = jTable1.getValueAt(a, 2).toString();

        //JOptionPane.showMessageDialog(null, "Usted Selecciono a "+nom+" "+ape+" "+id);
        //pu = new P_Usuario();
        Vistas.P_Usuario.persona_idpersona.setText(id);
        Vistas.P_Usuario.nombre.setText(nom);
        Vistas.P_Usuario.apellido.setText(ape);

        // JOptionPane.showMessageDialog(null, ""+pu.persona_idpersona.getText()+""+pu.nombre.getText()+""+pu.apellido);
        // Puser pum = new Puser();
       
    }
    public JTable Busqueda( JTable tabla ,int a, String b){
     sql = "select idPersona, p.nombre, p.apellido,p.sexo , i.estado "
             + "from persona p inner join invitacion i on \n" +
                "i.Persona_idPersona = p.idPersona where "
             + "i.Eventos_idEventos = '"+a+"' and i.Estado = false and"
             + " p.nombre LIKE '%"+b+"%';";

        String[] tituloEmple = {"ID","Nombre", "Apelldio", "Sexo", "Estado"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[5];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);
                values[2] = rs.getString(3);
                values[3] = rs.getString(4);
              //  values[4] = rs.getString(5);

                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);
        return tabla;
    }
    
   
   

}
//Ya
