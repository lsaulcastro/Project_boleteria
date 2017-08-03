/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.dao;

import Modelo.EventoModel;
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
public class EventoImp implements Modelo.dao.EventoDAO {

    private static JInternalFrame em = null;
    private static JInternalFrame em1 = null;
    private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;

    public EventoImp() {
    }

    @Override
    public void save(EventoModel en) {
        sql = "INSERT INTO `evento`(`nombre`, `fecha`, "
                + "`ubicacion`, `tipo`) VALUES (?,?,?,?)";
        try {
            md.connectar();
            presta = md.getConn().prepareStatement(sql);
            presta.setString(1, en.getNombre());
            presta.setDate(2, en.getFechal());
            presta.setString(3, en.getUbicacion());
            presta.setString(4, en.getTipo_Evento());
            int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Evento agregado Correctamente");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @Override
    public void update(EventoModel en, int id) {

        System.out.println(id);
        sql = "UPDATE `evento` SET `nombre`='" + en.getNombre() + "',`fecha`='" + en.getFechal() + "',"
                + "`ubicacion`='" + en.getUbicacion() + "',`tipo`='" + en.getTipo_Evento() + "' WHERE idEventos = " + id + "";
        try {
            md.connectar();
            presta = md.getConn().prepareStatement(sql);
            int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Evento modificado, Correctamente!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error! " + e.getMessage());
        }
        md.desconnectar();
    }

    @Override
    public JTable search(javax.swing.JTable tabla, String a, int b) {
        //Busqueda FiltrS
        if (a != null) {
            sql = "SELECT * FROM evento WHERE idEventos LIKE '%" + a + "%'"
                    + "OR nombre LIKE '%" + a + "%'" + "OR fecha LIKE '%" + a + "%'"
                    + "OR ubicacion LIKE '%" + a + "%'" + "OR tipo LIKE '%" + a + "%'";
        }
        //Busqueda de invitados no confirmados
//        if (a == null && b == 0) {
//            sql = "select p.idPersona ,p.nombre, p.apellido ,"
//                    + "p.sexo, i.Estado ,i.Eventos_idEventos  from persona p inner join invitacion i on \n"
//                    + "i.Persona_idPersona = p.idPersona where i.Eventos_idEventos = '" + b + "';";
//        }
        //Busqueda de los eventos actuales
        if (b == 1) {
            sql = "select * from evento where fecha = date_format(now(),'%Y-%m-%d');";
            //  System.out.println(FechaActual());
        }
        // //Busqueda de los proximos eventos
        if (b != 1 && b != 0) {
            sql = "SELECT * FROM evento WHERE evento.fecha BETWEEN date_format"
                    + "(DATE_ADD(NOW(), INTERVAL 1 DAY),'%Y-%m-%d') AND '3012-01-01';";

        }

        // tabla.setDeflseaultRenderer(Object.class, new Render());
        String[] tituloEmple = {"ID", "Nombre", "Fechaa", "Ubicacion", "Tipo"};
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
                values[4] = rs.getString(5);
//                values[5] = btn;;
//                values[6] = btn1;
                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);

        return tabla;

    }

    @Override
    public void delete(int id) {
        sql = "DELETE FROM `evento` WHERE idEventos = '" + id + "'";
        try {
            md.connectar();
            s = md.getConn().createStatement();
            //s.executeUpdate(sql);
            if (s.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Evento Eliminado o Cancelado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EventoModel> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ConfirmarLLegada(int IDinvi, int IDEve) {
        sql = "update invitacion set estado = true where "
                + "invitacion.Persona_idPersona = '" + IDinvi + "' "
                + "and invitacion.Eventos_idEventos = '" + IDEve + "';";
        try {
            md.connectar();
            presta = md.getConn().prepareStatement(sql);
            int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Invitado, Confirmado en el evento");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public JTable UserNoConfir(javax.swing.JTable tabla, int a) {
        sql = "select p.idPersona ,p.nombre, p.apellido ,"
                + "p.sexo, i.Estado  from persona p inner join invitacion i on "
                + "i.Persona_idPersona = p.idPersona where i.Eventos_idEventos = '"+a+"' and i.Estado = false;";

        String[] tituloEmple = {"ID", "Nombre", "Apellido", "Sexo", "Estado"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[6];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);
                values[2] = rs.getString(3);
                values[3] = rs.getString(4);
                values[4] = rs.getString(5);
                values[5] = rs.getString(5);
//                values[5] = btn;;
//                values[6] = btn1;
                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);

        return tabla;
    }
//Este getinstance es para que me devuelva la vista de InternalFrame de eventos

    public static JInternalFrame getinstance() {
        if (em == null) {
            em = new Vistas.PeventosInternal();
            Vistas.PMenu.jDesktopPanePrincipal.add(em);

        }
        return em;

    }

    public static JInternalFrame getinstanceProxEven() {
        if (em1 == null) {
            em1 = new Vistas.ProxEvent();
            Vistas.PMenu.jDesktopPanePrincipal.add(em1);
            // em1.setVisible(true);

        }
        em1.setVisible(true);
        return em1;

    }

}
