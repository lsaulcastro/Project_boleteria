/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JTable;

/**
 *
 * @author sauld
 */
public interface Reporte {

    public JTable PersonasAsistencia(JTable tabla);

    public JTable PersonasAsistenciaPorcentaje(JTable tabla);

    public JTable EventosMasVisitados(JTable tabla);

    public JTable EventosMasVisitadosPorMujeres(JTable tabla);

    public JTable EventosMasVisitadosPorHombres(JTable tabla);

    public JTable DiasDeLaSemana(JTable tabla);
    
    public String Contador(int x);
    
   
}
