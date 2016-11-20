/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Participante extends Cliente{
    private ArrayList<Evaluacion> evaluaciones;

    public Participante(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = new ArrayList<>();
    }

    public Participante(String nombre, String documento, String contacto) {
        super(nombre, documento, contacto);
        this.evaluaciones = new ArrayList<>();
    }
    
    public Participante(Cliente cliente) {
        super(cliente.getNombre(), cliente.getDocumento(), cliente.getContacto());
        this.evaluaciones = new ArrayList<>();
    }
    

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    public void agregarEvaluacion(Evaluacion evaluacion){
        evaluaciones.add(evaluacion);
    }
    
    
}
