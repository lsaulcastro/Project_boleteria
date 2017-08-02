///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package boleteria;
//
//import Vistas.NewJFrame;
//import Vistas.PeventosInternal;
//import java.sql.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
///**
// *
// * @author sauld
// */
//public class Boleteria {
//
//    /**
//     * @param args the command line arguments
//     * @throws java.text.ParseException
//     */
//    public static void main(String[] args) throws ParseException, Exception {
//        formateadorFecha("2017-08-1");
//        System.out.println(formateadorFecha("2017-08-1"));
//    }
//
//    public static java.sql.Date formateadorFecha(String a) throws Exception {
//
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date parsed = format.parse(a);
////        java.sql.Date sql = new java.sql.Date(parsed.getTime());
//        System.out.println(sql);
//        return sql;
//    }
//}
