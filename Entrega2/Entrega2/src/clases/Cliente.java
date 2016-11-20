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

    public Cliente() {
        this.nombre = "";
        this.documento = "";
        this.contacto = "";
    }

    
    
    public Cliente(String nombre, String documento, String contacto) {
        this.nombre = nombre;
        this.documento = documento;
        this.contacto = contacto;
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
    
    
    
}
