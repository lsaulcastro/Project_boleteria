//package Modelo;
//
///**
// *
// * @author sauld
// */
//import java.sql.*;
//
//public class ModeloDatos {
//
//
//    private static ModeloDatos modelo;
//
//    private ModeloDatos() {
//
//    }
//
//    public static ModeloDatos getInstance() {
//        if (modelo == null) {
//            modelo = new ModeloDatos();
//        }
//        return modelo;
//    }
//
//    private void loadDriver() {
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
//            System.out.println("error en la carga de driver");
//        }
//    }
//
//    public void connectar() {
//        try {
//            conn = DriverManager.getConnection(url);
//        } catch (SQLException ex) {
//            System.out.println("No se conecto " + ex.getMessage());
//        }
//    }
//
//    public void desconnectar() {
//        if (getConn() != null) {
//            try {
//                getConn().close();
//            } catch (SQLException e) {
//
//            }
//        }
//    }
//
//    public Connection getConn() {
//        return conn;
//    }
//
//}
