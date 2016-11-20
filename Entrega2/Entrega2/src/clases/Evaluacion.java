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
public class Evaluacion {
    private int estrellas;
    private String comentario;

    public Evaluacion() {
        this.estrellas = 0;
        this.comentario = "";
    }

    public Evaluacion(int estrellas, String comentario) {
        this.estrellas = estrellas;
        this.comentario = comentario;
    }
    
    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
}
