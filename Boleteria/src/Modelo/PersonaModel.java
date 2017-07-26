/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author sauld
 */
public abstract class  PersonaModel {
    
    private String nombre;
    private String appellido;

    public PersonaModel(String nombre, String appellido) {
        this.nombre = nombre;
        this.appellido = appellido;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

      
    
}
