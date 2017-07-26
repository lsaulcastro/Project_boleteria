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
public class InvitadosModel extends PersonaModel{
    
    private String telefono = null;
    private String direccion= null;
    private String sexo = null;
    private String email= null;
   

    public InvitadosModel(String telefono, String direccion, String sexo, String email, String nombre, String appellido) {
        super(nombre, appellido);
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
    
    
    
}
