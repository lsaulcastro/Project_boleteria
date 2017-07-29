/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author sauld
 */
public class EventoModel {
    
    private String nombre;
    private String fechal;
    private String ubicacion;
    private String tipo_Evento;

    public EventoModel(String nombre, String fechal, String ubicacion, String tipo_Evento) {
        this.nombre = nombre;
        this.fechal = fechal;
        this.ubicacion = ubicacion;
        this.tipo_Evento = tipo_Evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechal() {
        return fechal;
    }

    public void setFechal(String fechal) {
        this.fechal = fechal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_Evento() {
        return tipo_Evento;
    }

    public void setTipo_Evento(String tipo_Evento) {
        this.tipo_Evento = tipo_Evento;
    }
    
    
}
