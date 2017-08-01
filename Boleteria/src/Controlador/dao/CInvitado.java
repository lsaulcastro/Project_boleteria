/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.dao;

import Modelo.InvitadosModel;
import Modelo.ModeloDatos;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sauld
 */
public class CInvitado implements Modelo.dao.InvitadoRepository {

    private static JInternalFrame em = null;
    private static JInternalFrame em1 = null;
    private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;

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

    public void Invitar(int idPersona, int idEvento, int estado ) {
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

}
