/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Federico
 */
public class Cliente {
    private String nombre;
    private String documento;
    private String contacto;
    private String email;

    public Cliente() {
        this.nombre = "";
        this.documento = "";
        this.contacto = "";
        this.email="";
    }

    
    
    public Cliente(String nombre, String documento, String contacto,String mail) {
        this.nombre = nombre;
        this.documento = documento;
        this.contacto = contacto;
        this.email=mail;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  nombre + "," + documento + "," + contacto + "," + email;
    }
    
    
    
    
}
