/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloDatos;
import Modelo.UsuarioModel;
import Vistas.PMenu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class CLogin {
     private Modelo.ModeloDatos md = ModeloDatos.getInstance();
    private PreparedStatement presta;
    private ResultSet rs;
    private String sql;
    private Statement s;
    private DefaultTableModel m;
    
    public void Ingresar(UsuarioModel en){
    try{
        sql = "SELECT  `username`, `password`, `perfilUsuario`  FROM `usuario` WHERE perfilUsuario = 'administrador' and username = '?' and password = '?'";
        md.connectar();
        presta = md.getConn().prepareStatement(sql);
        presta.setString(1, en.getUsuario());
        presta.setString(2, en.getPassword());
        presta.executeQuery(sql);
        
        if(presta.equals("Administrador")){
        PMenu pm = new PMenu();
        pm.setVisible(true);
        pm.setLocationRelativeTo(null);
       if (presta.equals("Portero")){
        PMenu pr = new PMenu();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
       }
        
        }else{
        JOptionPane.showMessageDialog(null, "Error Su Usuario o Contrasena son incorrectos");
        }
    
    
    }catch(Exception o){
    o.printStackTrace();
    }
    }
    
}
