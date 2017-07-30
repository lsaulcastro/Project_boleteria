///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package boleteria;
//
//import Controlador.Factory.ApplicationContext;
//import Modelo.EventoModel;
//import Modelo.Factory.Repository_Enum;
//import Modelo.InvitadosModel;
//import Modelo.PersonaModel;
//import Modelo.dao.InvitadoRepository;
//import Vistas.PMenu;
//import java.util.Date;
//
///**
// *
// * @author sauld
// */
//public class Boleteria {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        // TODO code application logic here
//        Date a = new Date();
//        Modelo.InvitadosModel en = new InvitadosModel("asd", "asd", "asd", "asd", "asd", "asd");
//        InvitadoRepository in = (InvitadoRepository) ApplicationContext.getRepository(Repository_Enum.INVITADO_REPOSITORY);
//        in.save(en);
//        
//        Modelo.PersonaModel p  = new PersonaModel("asd", "asd"){};
//    }
//
//}
