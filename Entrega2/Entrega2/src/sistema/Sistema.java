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
import java.util.Random;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Federico
 */
public class Sistema {

    private ArrayList<Cliente> clientes;
    private ArrayList<Participante> participantes;
    private ArrayList<Participante> ganadores;
    private ArrayList<Evaluacion> evaluaciones;
    private ArrayList<String> emailEnviados;
    private Ficha ficha;
    private int cantPremios;
    private String mensajeGanador;

    public Sistema() {
        this.clientes = new ArrayList<Cliente>();
        this.participantes = new ArrayList<Participante>();
        this.ganadores = new ArrayList<Participante>();
        this.evaluaciones = new ArrayList<Evaluacion>();
        this.emailEnviados = new ArrayList<String>();
        this.ficha = new Ficha();
        this.cantPremios = 1;
        this.mensajeGanador = "Usted a ganador un sorteo por una comida gratis";
    }

    public Respuesta agregarCliente(String nombre, String documento, String contacto, String mail) {
        Respuesta resp = new Respuesta(-1, "");
        boolean existe = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (documento == clientes.get(i).getDocumento()) {
                existe = true;
            }
        }
        if (existe) {
            resp.setCod(-1);
            resp.setRespuesta("Error: El documento ya existe en el sistema.");
        } else {
            Cliente cliente = new Cliente(nombre, documento, contacto, mail);
            clientes.add(cliente);
            resp.setCod(0);
            resp.setRespuesta("Se agrego cliente correctamente.");
        }
        return resp;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    
     public ArrayList<Participante> getGanadores() {
        return ganadores;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public Respuesta agregarEvaluacionIdentificada(Cliente cliente, int estrellas, String comentarios) {
        Evaluacion evaluacion = new Evaluacion(estrellas, comentarios);

        Respuesta respuesta = new Respuesta(-1, "");

        if (estrellas >= 1 && estrellas <= 5) {

            Participante participante = new Participante(cliente);
            if (participantes.contains(participante)) {
                int indice = participantes.indexOf(participante);
                participantes.get(indice).agregarEvaluacion(evaluacion);

                respuesta.setCod(0);
                respuesta.setRespuesta("Se agrego la evaluacion correspondiente a participante " + participantes.get(indice).getCliente().getNombre());
            } else {

                participante.agregarEvaluacion(evaluacion);
                participantes.add(participante);
                respuesta.setCod(0);
                respuesta.setRespuesta("Evaluacion agregada, se agrego al cliente entre los participantes del sorteo");
            }

        } else {
            respuesta = new Respuesta(-1, "Cantidad de estrellas no validas, debe de estar comprendida entre 1 y 5.");
        }
        return respuesta;
    }

    public Respuesta agregarEvaluacionAnonima(int estrellas, String comentarios) {
        Evaluacion evaluacion = new Evaluacion(estrellas, comentarios);
        Respuesta respuesta = new Respuesta(-1, "");
        boolean seAgrego = false;
        if (estrellas >= 1 && estrellas <= 5) {

            evaluaciones.add(evaluacion);
            respuesta.setCod(0);
            respuesta.setRespuesta("Se agrego evalucion correctamente.");
        } else {
            respuesta.setRespuesta("Cantidad de estrellas no validas, debe de estar comprendida entre 1 y 5.");
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

    public Respuesta definirSorteo(int cantidadPremios, String mensaje) {
        Respuesta respuesta = new Respuesta(0, "Se modifico ficha correctamente");

        this.cantPremios = cantidadPremios;
        this.mensajeGanador = mensaje;

        return respuesta;
    }

    public Respuesta enviarMail(Participante participante) {
        Respuesta respuesta;
        String mail = "To:" + participante.getCliente().getContacto() + "\n";
        mail = participante.getCliente().getNombre() + ".\n" + mensajeGanador;
        
        final String username = "username@gmail.com";
	final String password = "password";
        
	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");
        
	Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
		}
            });
        
	try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));  
            message.setRecipients(Message.RecipientType.TO,
        	InternetAddress.parse(participante.getCliente().getEmail()));
            message.setSubject("Ganador del sorteo");
            message.setText(mail);
            Transport.send(message);
            respuesta = new Respuesta(0, "Se envio mail correctamente.");
            emailEnviados.add(mail);
	} catch (MessagingException e) {
            respuesta = new Respuesta(-1, "Error al enviar el mail");
            throw new RuntimeException(e);
        }

        return respuesta;
    }

    public Respuesta sortear() {
        Respuesta respuesta = new Respuesta(-1, "");
        Random rnd = new Random();
        ganadores=new ArrayList<Participante>();
        String mensaje = "Los ganadores del sorteo son: \n";
        
        for (int i = 0; i < cantPremios; i++) {
            int random = rnd.nextInt() % participantes.size();
            Participante ganador = participantes.get(random);
            if (!ganadores.contains(ganador)) {
                ganadores.add(ganador);
                mensaje += ganador.getCliente().getNombre() + " Contacto: " + ganador.getCliente().getContacto() + " \n";
                enviarMail(ganador);
            } else {
                i--;
            }
        }
        
        respuesta.setCod(0);
        respuesta.setRespuesta(mensaje);

        return respuesta;

    }

}
