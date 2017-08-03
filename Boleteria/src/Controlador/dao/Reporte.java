/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.dao;

import Modelo.ModeloDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sauld
 */
public class Reporte implements Modelo.Reporte {

    private JFrame re = null;
    private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;

    @Override
    public JTable PersonasAsistencia(JTable tabla) {
        sql = "select Eventos_idEventos, sum(Estado = true)  as CantidadDePersonas"
                + " from invitacion Group by Eventos_idEventos order by  "
                + "CantidadDePersonas desc;";

        String[] tituloEmple = {"ID_Evento", "Cantidad  de Personas"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[2];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);

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
    public JTable PersonasAsistenciaPorcentaje(JTable tabla) {

        sql = "select Eventos_idEventos, avg(Estado = true) as Porcentaje from"
                + " invitacion Group by Eventos_idEventos order by  Porcentaje desc;";

        String[] tituloEmple = {"ID_Evento", "Porcentaje de Personas"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[2];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);

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
    public JTable EventosMasVisitados(JTable tabla) {

        sql = "select  Eventos_idEventos, sum(Estado)/12 "
                + "as Suma_Total from invitacion inner join persona group by "
                + " Eventos_idEventos order by Suma_Total desc;";

        String[] tituloEmple = {"ID_Evento", "Porcentaje de Personas"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[2];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);

                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);

        return tabla;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTable EventosMasVisitadosPorMujeres(JTable tabla) {

        sql = " select invitacion.Eventos_idEventos,evento.nombre, "
                + "sum(invitacion.Estado = true) as Suma_Total "
                + "from invitacion inner join evento "
                + "on invitacion.Eventos_idEventos = evento.idEventos "
                + " INNER JOIN persona "
                + "on invitacion.Persona_idPersona = persona.idPersona "
                + " where persona.sexo LIKE \"%Mujer%\" group by "
                + " invitacion.Eventos_idEventos order by  Suma_Total desc limit 0,3;";

        String[] tituloEmple = {"ID_Evento", "Nombre", "Cantidad"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[3];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);
                values[2] = rs.getString(3);

                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);
        return tabla;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTable EventosMasVisitadosPorHombres(JTable tabla) {
        sql = " select invitacion.Eventos_idEventos,evento.nombre, "
                + "sum(invitacion.Estado = true) as Suma_Total "
                + "from invitacion inner join evento "
                + "on invitacion.Eventos_idEventos = evento.idEventos "
                + " INNER JOIN persona "
                + "on invitacion.Persona_idPersona = persona.idPersona "
                + " where persona.sexo LIKE \"%Hombre%\" group by "
                + " invitacion.Eventos_idEventos order by  Suma_Total desc limit 0,3;";

        String[] tituloEmple = {"ID_Evento", "Nombre", "Cantidad"};
        m = new DefaultTableModel(null, tituloEmple) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
            Object[] values = new Object[3];

            while (rs.next()) {
                values[0] = rs.getString(1);
                values[1] = rs.getString(2);
                values[2] = rs.getString(3);

                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);
        return tabla;

        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTable DiasDeLaSemana(JTable tabla) {
        sql = "select Eventos_idEventos, evento.nombre,  count(dayname(evento.fecha)) \n"
                + "as cantidadDias ,dayname(evento.fecha) as Dia , \n"
                + "sum(invitacion.Estado = true) as TotalAsistencia from evento \n"
                + "inner join invitacion on invitacion.Eventos_idEventos = \n"
                + "evento.idEventos  group by Eventos_idEventos order by TotalAsistencia desc limit 0,3;";

        String[] tituloEmple = {"ID_Evento", "Nombre", "Cantidad de Dias", "Dia", "Cantidad de Asistencia"};
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

                m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabla.setRowHeight(30);
        tabla.setModel(m);
        return tabla;
    }

    public JFrame getinstance() {
        if (re == null) {
            re = new Vistas.P_Reportes();
        }
        re.setVisible(true);
        return re;

    }

    @Override
    public String Contador(int a) {
        String x = null;
        sql = "select Count(i.Eventos_idEventos ) from persona p inner join invitacion i on \n"
                + "i.Persona_idPersona = p.idPersona where i.Eventos_idEventos = '"+a+"' and i.Estado = false;";

        try {
            md.connectar();
            s = md.getConn().createStatement();
            rs = s.executeQuery(sql);
         //   Object[] values = new Object[1];

            while (rs.next()) {
                x = rs.getString(1);
                

               // m.addRow(values);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return x;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
