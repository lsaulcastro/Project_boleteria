///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Ejemplo;
//
//import Modelo.ModeloDatos;
////import Vista.PanelLlamadas;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//
///**
// *
// * @author sauld
// */
//public class DB_Eventos {
//
//    private static DB_Eventos db;
//    private static int UserId = 0;
//    Modelo.ModeloDatos md = ModeloDatos.getInstance();
//
//    public DB_Eventos() {
//    }
//
//    public static DB_Eventos getinstance() {
//        if (db == null) {
//            db = new DB_Eventos();
//        }
//        return db;
//    }
//
//    public void saveInDB(LLamada local) {
//        System.out.println(UserId + "regis");
//        PreparedStatement sta = null;
//      //  Modelo.ModeloDatos md = ModeloDatos.getInstance();
//        String sql = "INSERT INTO `llamada`(`LlamadaDestino`, `LlamadaOrigen`, `Duracion`, `Tipo`,`Usuario_idUsuario`) VALUES (?,?,?,?,?)";
//        try {
//            md.connectar();
//            sta = md.getConn().prepareStatement(sql);
//            // sta.setString(1, local.getId());
//            sta.setString(1, local.getNumDestino());
//            sta.setString(2, local.getNumOrigen());
//            sta.setDouble(3, local.getDuracion());
//            sta.setString(4, local.getTipo());
//            // sta.setString(5, String.valueOf(local));
//            sta.setString(5, String.valueOf(UserId));
//            int exito = sta.executeUpdate();
//            if (exito == 0) {
//                System.out.println("No funciono " + exito);
//            } else {
//                System.out.println("Si FUNCIONO" + exito);
//                JOptionPane.showMessageDialog(null, "Llamada Realizada exitosamente!");
//
//            }
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//        // return this;
//    }
//
//    public void saveFactura(double costo_LLamada) {
//        PreparedStatement sta = null;
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//        String sql = "INSERT INTO `factura`(`Costo_llamada`, `Llamada_idLlamadas`) VALUES (?,?)";
//        try {
//            md.connectar();
//            sta = md.getConn().prepareStatement(sql);
//
//            sta.setDouble(1, costo_LLamada);
//            sta.setInt(2, returnIDMax(0));
//
//            int exito = sta.executeUpdate();
//            if (exito == 0) {
//                System.out.println("No funciono " + exito);
//            } else {
//                System.out.println("Si FUNCIONO" + exito);
//                //JOptionPane.showMessageDialog(null, "Llamada Realizada exitosamente!");
//
//            }
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//
//    }
////El parametro x, espara que retorne el ID maximo de llamadas o de usuario
//
//    public int returnIDMax(int x) {
//        int idMax = 0;
//
//        Statement sta = null;
//        String sql = null;
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//        if (x == 0) {
//            sql = "SELECT MAX(idLlamadas)from llamada";
//        } else {
//            sql = "SELECT MAX(idUsuario) from usuario";
//        }
//
//        try {
//            md.connectar();
//            sta = md.getConn().createStatement();
//            ResultSet rs = sta.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//
//                idMax = rs.getInt(1);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//
//        return idMax;
//
//    }
//
//    public void saveUser(Usuarios usuario) {
//        PreparedStatement sta = null;
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//        String sql = "INSERT INTO `usuario`(`Nombre`, `Apellido`) VALUES (?,?)";
//
//        try {
//            md.connectar();
//            sta = md.getConn().prepareStatement(sql);
//            sta.setString(1, usuario.getNombre());
//            sta.setString(2, usuario.getApellido());
//            int exito = sta.executeUpdate();
//            saveLogin(usuario);
//            if (exito == 0) {
//                System.out.println("No funciono nombre " + exito);
//            } else {
//                System.out.println("Si FUNCIONO el user" + exito);
//                JOptionPane.showMessageDialog(null, "Llamada Realizada exitosamente!");
//
//            }
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//    }
//
//    public void saveLogin(Usuarios usuario) {
//        PreparedStatement sta = null;
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//
//        String sql = "INSERT INTO `login`(`UserName`, `Password`, `Usuario_idUsuario`) VALUES (?,?,?)";
//        try {
//            md.connectar();
//            sta = md.getConn().prepareStatement(sql);
//
//            sta.setString(1, usuario.getUserName());
//            sta.setString(2, usuario.getClave());
//            sta.setInt(3, returnIDMax(1));
//            int exito = sta.executeUpdate();
//            if (exito == 0) {
//                System.out.println("No funciono el login " + exito);
//            } else {
//                System.out.println("Si FUNCIONO el login" + exito);
//                JOptionPane.showMessageDialog(null, "Llamada Realizada exitosamente!");
//
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//
//    }
//
//    public boolean ValidarLogin(String username, String password) {
//      //  Modelo.ModeloDatos modelo = ModeloDatos.getInstance();
//        String query = "SELECT `UserName`,Password,Usuario_idUsuario FROM `login` WHERE `UserName`='" + username + "' && Password='" + password + "'";
//        Statement s;
//        ResultSet rs;
//
//        boolean confir = false;
//        try {
//            md.connectar();
//            s = md.getConn().createStatement();
//            rs = s.executeQuery(query);
//
//            if (confir = rs.next()) {
//
//                UserId = rs.getInt(3);
//                //   datos[3] = rs.getString(4);
//                // datos[4] = String.valueOf(rs.getDouble(5));
//                System.out.println(UserId);
//
//                Vista.PanelLlamadas panel = new PanelLlamadas();
//                panel.setVisible(true);
//                panel.setLocationRelativeTo(null);
//
//            } else {
//
//                JOptionPane.showMessageDialog(null, "Usuario"
//                        + " u Contraseña, INCORRECTOS!");
//            }
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error " + e);
//        }
//        md.desconnectar();
//        return confir;
//    }
//
//    public JTable BusquedaAll(DefaultTableModel model, JTable table) {
//        String[] tituloEmple = {"# Origen", " # Destino", " # Duracion ", " # Tipo ", " # Precio"};
//        model = new DefaultTableModel(null, tituloEmple);
//        table.setModel(model);
//        
//        
//        String query = "SELECT LlamadaOrigen ,LlamadaDestino, Duracion, Tipo, B.Costo_llamada FROM llamada A INNER JOIN factura B  ON A.idLlamadas = b.Llamada_idLlamadas";
//        Modelo.ModeloDatos modelo = ModeloDatos.getInstance();
//        String datos[] = new String[5];
//        try {
//            modelo.connectar();
//            Statement s;
//            s = modelo.getConn().createStatement();
//            ResultSet rs = s.executeQuery(query);
//
//            while (rs.next()) {
//                datos[0] = rs.getString(1);
//                datos[1] = rs.getString(2);
//                datos[2] = rs.getString(3);
//                datos[3] = rs.getString(4);
//                datos[4] = String.valueOf(rs.getDouble(5));
//
//                model.addRow(datos);
//            }
////            for (int i = 0; i < 10; i++) {
////                System.out.println(datos[i]);
////            }
//
//            table.setModel(model);
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error!" + e);
//        }
//        return table;
//    }
//
//    public double ReturnPrecioTotal() {
//        double total = 0;
//        Statement sta = null;
//        String sql = "SELECT SUM(Costo_llamada) FROM `factura` ";
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//
//        try {
//            md.connectar();
//            sta = md.getConn().createStatement();
//            ResultSet rs = sta.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//
//                total = rs.getDouble(1);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//
//        return total;
//    }
//
//    public int ReturnLLamadasRealizadasTotal() {
//        int total = 0;
//        Statement sta = null;
//        String sql = "SELECT COUNT(idLlamadas) FROM `llamada`";
//        Modelo.ModeloDatos md = ModeloDatos.getInstance();
//
//        try {
//            md.connectar();
//            sta = md.getConn().createStatement();
//            ResultSet rs = sta.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//
//                total = rs.getInt(1);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        } finally {
//            md.desconnectar();
//            System.out.println("Desconectado");
//        }
//
//        return total;
//    }
//
//}
