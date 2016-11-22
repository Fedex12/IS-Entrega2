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
public class Ficha {
    private String nombre;
    private String direccion;
    private String horario;
    private String tipoComida;
    
     public Ficha() {
        this.nombre = "Restaurante sin datos";
        this.direccion  = "Sin datos";
        this.horario = "Sin datos";
        this.tipoComida = "Sin datos";
    }
    
    public Ficha(String nombre, String direccion, String horario, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        this.tipoComida = tipoComida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    
       @Override
    public boolean equals(Object obj) {
         if (obj instanceof Ficha) {
         Ficha ficha = (Ficha) obj;
         return ficha.getNombre().equals(nombre)&&ficha.getDireccion().equals(direccion)&&ficha.getHorario().equals(horario) && ficha.getTipoComida().equals(tipoComida);
         }else{return false;}
    }
    
}
