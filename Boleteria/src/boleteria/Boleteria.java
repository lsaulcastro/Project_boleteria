/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteria;

import Modelo.EventoModel;
import Modelo.ModeloDatos;
import Vistas.PInvitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import boleteria.Calendario.jDateChooser1;

/**
 *
 * @author sauld
 */
public class Boleteria {

    /**
     * @param args the command line arguments
     */
    private static Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private static PreparedStatement presta;
    private static ResultSet rs;
    private static String sql;
    private static Statement s;
    private static DefaultTableModel m;

    public static void main(String[] args) {

    }

    public void formateadorFecha(String a) {

        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(a);

        try {
            java.util.Date utilDate = format.parse(a);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            System.out.println(sqlDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
