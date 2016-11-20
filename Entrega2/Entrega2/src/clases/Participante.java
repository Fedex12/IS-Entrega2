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
public class Participante{
    private Cliente cliente;
    private ArrayList<Evaluacion> evaluaciones;

    public Participante(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = new ArrayList<>();
    }

    public Participante() {
        this.cliente= new Cliente();
        this.evaluaciones = new ArrayList<>();
    }
    
    public Participante(Cliente cliente) {
        this.cliente= cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
