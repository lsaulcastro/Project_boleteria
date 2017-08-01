/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.dao;

import Modelo.ModeloDatos;
import Modelo.UsuarioModel;
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
 * @author Lenovo
 */
public class CUsuario implements Modelo.dao.Usuariodao {
    private static JInternalFrame em = null;
    private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;

    @Override
    public void save(UsuarioModel en) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         try{
          
          md.connectar();
          sql = "INSERT INTO `usuario`( `username`, password, perfilUsuario) VALUES (?,?,?)";
          presta=md.getConn().prepareStatement(sql);
          //presta.setString(1, en.getNombre());
         // presta.setString(2, en.getAppellido());
          presta.setString(1, en.getUsuario());
          presta.setString(2, en.getPassword());
          presta.setString(3, en.getPerfil_Usuario());
         // presta.setString(6, en.getEmail());
          
           int x = presta.executeUpdate();
            if (x == 0) {
                System.out.println("No funciono");
            } else {
                JOptionPane.showMessageDialog(null, "Persona agregado Correctamente");
            }
            
      }catch(Exception o){
      System.out.println("Error! de  Base Datos"+ o.getMessage());
      }
     
    }

    @Override
    public void update(UsuarioModel en, int x) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
           md.connectar();
          sql = "update usuario set username  ='"+en.getUsuario()+"', password ='"+en.getPassword()+"', perfilUsuario ='"+en.getPerfil_Usuario()+"'";   
          presta = md.getConn().prepareStatement(sql);
         presta.executeUpdate();
         
       }catch(Exception o){
           JOptionPane.showMessageDialog(null, o.getMessage());
       }
       md.desconnectar();
    }

    @Override
    public JTable search(JTable en, String a ,int b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if (a != null) {
            sql = "SELECT * FROM usuario WHERE idPersona LIKE '%" + a + "%'"
                    + "OR username LIKE '%" + a + "%'" + "OR password LIKE '%" + a + "%'"
                    + "OR perfilUsuario LIKE '%" + a + "%'";
        }
        if (a == null) {
            sql = "SELECT * FROM `usuario`";
        }
        
         String[] tituloEmple = {"ID", "Usuario", "Contrasena", "Perfil Usuario", "idpersona"};
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
              //  values[5] = rs.getString(6);
              //  values[6] = rs.getString(7);
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
          sql = "DELETE FROM usuario WHERE idPersona = '"+id+"'";
        try {
            md.connectar();
            s = md.getConn().createStatement();
             //s.executeUpdate(sql);
            if ( s.executeUpdate(sql)  == 1) {
                JOptionPane.showMessageDialog(null, "Persona Eliminada!");
            }
 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<UsuarioModel> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static JInternalFrame getinstance() {
        if (em == null) {
            em = new Vistas.P_Usuario();
            em.setVisible(true);
            Vistas.PMenu.jDesktopPanePrincipal.add(em);

        }
        return em;
    }
    
    
    
}
