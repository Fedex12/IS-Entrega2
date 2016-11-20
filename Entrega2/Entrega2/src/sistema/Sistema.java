/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import clases.Cliente;
import clases.Evaluacion;
import clases.Ficha;
import clases.Participante;
import clases.Respuesta;
import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Sistema {

    private ArrayList<Cliente> clientes;
    private ArrayList<Participante> participantes;
    private ArrayList<Participante> ganadores;
    private ArrayList<Evaluacion> evaluaciones;
    private Ficha ficha;
    private int cantPremios;
    private String mensajeGanador;

    public Sistema() {
        this.clientes = new ArrayList<Cliente>();
        this.participantes = new ArrayList<Participante>();
        this.ganadores = new ArrayList<Participante>();
        this.evaluaciones = new ArrayList<Evaluacion>();
        this.ficha = new Ficha();
        this.cantPremios = 1;
        this.mensajeGanador = "Usted a ganador un sorteo por una comida gratis";
    }

    public void agregarCliente(String nombre, String documento, String contacto) {
        Cliente cliente = new Cliente(nombre, documento, contacto);
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Respuesta agregarEvaluacionIdentificada(Cliente cliente, int estrellas, String comentarios) {
        Evaluacion evaluacion = new Evaluacion(estrellas, comentarios);
        Respuesta respuesta = new Respuesta(-1, "");
        boolean seAgrego = false;
        if (estrellas < 1 && estrellas > 5) {
            respuesta.setRespuesta("Cantidad de estrellas no validas, debe de estar comprendida entre 1 y 5.");

        } else {

            evaluaciones.add(evaluacion);
            for (int i = 0; i < clientes.size(); i++) {
                if (participantes.get(i).getCliente().equals(cliente)) {
                    participantes.get(i).agregarEvaluacion(evaluacion);
                    seAgrego = true;
                    respuesta.setCod(0);
                    respuesta.setRespuesta("Se agrego la evaluacion correspondiente a participante " + participantes.get(i).getCliente().getNombre());
                }
            }
            if (!seAgrego) {
                Participante participante = new Participante(cliente);
                participante.agregarEvaluacion(evaluacion);
                participantes.add(participante);
                respuesta.setCod(0);
                respuesta.setRespuesta("Evaluacion agregada, se agrego al cliente entre los participantes del sorteo");
            }

        }
        return respuesta;
    }

    public Respuesta modificarFicha(String nombre, String direccion, String horario, String tipoComida) {
        Respuesta respuesta = new Respuesta(-1, "");
        this.ficha.setNombre(nombre);
        this.ficha.setDireccion(direccion);
        this.ficha.setHorario(horario);
        this.ficha.setTipoComida(tipoComida);
        respuesta.setCod(0);
        respuesta.setRespuesta("Se modifico Ficha correctamente");
        return respuesta;
    }

    public Respuesta difinirSorteo(int cantidadPremios, String mensaje) {
        Respuesta respuesta = new Respuesta(-1, "");
        if (cantidadPremios > participantes.size()) {
            respuesta.setRespuesta("Existen " + participantes.size() + " participantes, la cantidad de premios no puede ser mayor a la cantidad de participantes.");
        } else {
            this.cantPremios = cantidadPremios;
            this.mensajeGanador = mensaje;
            respuesta.setCod(0);
            respuesta.setRespuesta("Se modifico ficha correctamente");
        }
        return respuesta;
    }

    public Respuesta sortear() {
        Respuesta respuesta = new Respuesta(-1, "");
     
        return respuesta;
    }
    
}
