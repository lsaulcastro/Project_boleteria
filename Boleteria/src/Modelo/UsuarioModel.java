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
public class UsuarioModel extends PersonaModel {
    private String usuario;
    private String password;
    private String perfil_Usuario;
    private String persona_idpersona;

    public UsuarioModel(String usuario, String password, String perfil_Usuario, String nombre, String appellido,String persona_idpersona) {
        super(nombre, appellido);
        this.usuario = usuario;
        this.password = password;
        this.perfil_Usuario = perfil_Usuario;
        this.persona_idpersona = persona_idpersona;
        
    }

    public String getPersona_idpersona() {
        return persona_idpersona;
    }

    public void setPersona_idpersona(String persona_idpersona) {
        this.persona_idpersona = persona_idpersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil_Usuario() {
        return perfil_Usuario;
    }

    public void setPerfil_Usuario(String perfil_Usuario) {
        this.perfil_Usuario = perfil_Usuario;
    }
    
    
    
}
