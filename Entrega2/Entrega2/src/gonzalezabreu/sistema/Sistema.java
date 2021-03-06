/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gonzalezabreu.sistema;

import gonzalezabreu.dominio.Cliente;
import gonzalezabreu.dominio.Evaluacion;
import gonzalezabreu.dominio.Ficha;
import gonzalezabreu.dominio.Participante;
import gonzalezabreu.dominio.Respuesta;
import java.util.ArrayList;
import java.util.Random;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        this.cantPremios = 2;
        this.mensajeGanador = "Usted ha resultado ganador de un sorteo por una comida gratis.";
    }
    
    
    
    
    
    public Respuesta agregarCliente(String nombre, String documento, String contacto, String email) {
        Respuesta respuesta = new Respuesta(-1, "");
        /**
         * Creo una expresion Regular para verificar que el email tiene formato
         * Nombre@Dominio
         */
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if (nombre.isEmpty()) {
            /**
             * Si el campo nombre esta vacio respondo error.
             */
            respuesta = new Respuesta(-1, "El mail no puede estar vacío.");
        } else if (!matcher.matches()) {
            /**
             * Si el email no tiene el formato correcto respondo error
             */
            respuesta = new Respuesta(-1, "El mail es incorrecto.");
        } else {
            boolean existe = false;
            for (int i = 0; i < clientes.size(); i++) {
                if (documento == clientes.get(i).getDocumento()) {
                    /**
                     * Recorro mis clientes y verifico que el cliente no este
                     * agregado previamente.
                     */
                    existe = true;
                }
            }
            if (existe) {
                /**
                 * Si ya existe el cliente que quiero agregar devuelvo error
                 */
                respuesta.setCod(-1);
                respuesta.setRespuesta("Error: El documento ya existe en el sistema.");
            } else {
                /**
                 * Si todo esta correcto, agrego el cliente y respondo OK
                 */
                Cliente cliente = new Cliente(nombre, documento, contacto, email);
                clientes.add(cliente);
                respuesta.setCod(0);
                respuesta.setRespuesta("Se agregó el cliente correctamente.");
            }
        }
        return respuesta;
    }
    
    public Respuesta agregarEvaluacionIdentificada(Cliente cliente, int estrellas, String comentarios) {
        Respuesta respuesta = new Respuesta(-1, "");
        
        Evaluacion evaluacion = new Evaluacion(estrellas, comentarios);
        if (estrellas >= 1 && estrellas <= 5) {
            /**
             * Si la cantidad de estrella esta dentro del rango 1-5
             */
            
            Participante participante = new Participante(cliente);
            /**
             * creo un Participante a partir del cliente
             */
            if (participantes.contains(participante)) {
                /**
                 * Si mi Participante ya participo previamente le agrego la
                 * nueva evaluacio al Participante y a mi lista de evaluaciones,
                 * respuesta OK
                 */
                int indice = participantes.indexOf(participante);
                participantes.get(indice).agregarEvaluacion(evaluacion);
                
                respuesta.setCod(0);
                respuesta.setRespuesta("Se agregó la evaluación correspondiente"
                        + " a participante " + participantes.get(indice).getCliente().getNombre());
            } else if (clientes.contains(cliente)) {
                
                evaluaciones.add(evaluacion);
                if (comentarios.trim().isEmpty()) {
                    /** Si la reseña esta vacia no lo agrego a los participantes.*/
                    respuesta.setCod(0);
                    respuesta.setRespuesta("Se agregó evaluación, ya que esta no"
                            + " tiene comentarios no califica para el sorteo.");
                    
                } else {
                    /**
                     * Si el Participante no tiene ninguna evaluacion previa, le
                     * agrego la evaluacion y los agrego a mi lista.
                     */
                    participante.agregarEvaluacion(evaluacion);
                    participantes.add(participante);
                    respuesta.setCod(0);
                    respuesta.setRespuesta("Evaluación agregada, se agregó al "
                            + "cliente a la lista de participantes del sorteo");
                }
            } else {
                respuesta.setCod(-1);
                respuesta.setRespuesta("Error: El cliente no esta registrado.");
            }
            
        } else {
            /**
             * Si las estrella estan fuera del rango 1-5, respondo Error
             */
            respuesta = new Respuesta(-1, "Cantidad de estrellas no válida, debe"
                    + " de estar comprendida entre 1 y 5.");
        }
        return respuesta;
    }
    
    public Respuesta agregarEvaluacionAnonima(int estrellas, String comentarios) {
        Evaluacion evaluacion = new Evaluacion(estrellas, comentarios);
        Respuesta respuesta = new Respuesta(-1, "");
        boolean seAgrego = false;
        if (estrellas >= 1 && estrellas <= 5) {
            /**
             * Si la cantidad de estrella esta dentro del rango 1-5
             */
            evaluaciones.add(evaluacion);
            /**
             * Si todo esta bien agrego la evaluacion a mi lista
             */
            respuesta.setCod(0);
            respuesta.setRespuesta("Se agregó evaluación correctamente.");
        } else {
            /**
             * Si las estrella estan fuera del rango 1-5, respondo Error
             */
            respuesta.setRespuesta("Cantidad de estrellas no válida, debe de estar comprendida entre 1 y 5.");
        }
        return respuesta;
    }
    
    public Respuesta setFicha(String nombre, String direccion, String horario, String tipoComida) {
        Respuesta respuesta = new Respuesta(-1, "");
        /**
         * Como la ficha no es relevante en el funcionamiento del programa
         * permito que se le ingrese Strings con cualquier formato o vacios.
         */
        this.ficha.setNombre(nombre);
        this.ficha.setDireccion(direccion);
        this.ficha.setHorario(horario);
        this.ficha.setTipoComida(tipoComida);
        respuesta.setCod(0);
        respuesta.setRespuesta("Se modificó Ficha correctamente");
        return respuesta;
    }
    
    public Ficha getFicha() {
        return ficha;
    }
    
    
    
    public Respuesta definirSorteo(int cantidadPremios, String mensaje) {
        
        Respuesta respuesta = new Respuesta(-1, "");
        if (cantidadPremios <= 0) {
            /**
             * La cantidad de premios tiene que se mayor a cero
             */
            respuesta = new Respuesta(-1, "La cantidad de premios debe ser mayor a cero.");
        } else if (mensaje.length() < 20) {
            /**
             * Si el mensaje tiene menos de 20 caracteres
             */
            respuesta = new Respuesta(-1, "El mensaje debe contener por lo menos 20 caracteres.");
        } else {
            /**
             * Si todo es correcto
             */
            System.out.println("Antes "+this.getCantPremios() + " - " + cantidadPremios);
            this.setCantPremios(cantidadPremios);
            System.out.println("Despues " + this.getCantPremios() + " - " + cantidadPremios);
            this.mensajeGanador = mensaje;
            respuesta = new Respuesta(0, "Se modificó ficha correctamente.");
        }
        return respuesta;
    }
    
    public Respuesta enviarMail(Participante participante) {
        Respuesta respuesta = new Respuesta(0, "");
        String mail = "To:" + participante.getCliente().getContacto() + "\n";
        mail = participante.getCliente().getNombre() + ". \n\n" + mensajeGanador;
        emailEnviados.add(mail);
        /**
         * Agrego el mail a mi lista de enviados
         */
        final String username = "ingenieriasoftwareort@gmail.com";
        final String password = "Hola1234";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
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
            respuesta = new Respuesta(0, "Se envió el mail correctamente.");
            
        } catch (MessagingException e) {
            respuesta = new Respuesta(-1, "Error al enviar el mail.");
            throw new RuntimeException(e);
        }
        
        return respuesta;
    }
    
    public Respuesta sortear() {
        Respuesta respuesta = new Respuesta(-1, "");
        Random rnd = new Random();
        ganadores = new ArrayList<Participante>();
        /**
         * limpio mi lista de ganadores
         */
        String mensaje = "Los ganadores del sorteo son: \n";
        
        if (this.getCantPremios() > participantes.size()) {
            /**
             * Si la cantidad de premios es mas grande que los participantes le
             * doy un premio a cada participante
             */
            for (int i = 0; i < participantes.size(); i++) {
                ganadores.add(participantes.get(i));
                mensaje += participantes.get(i).getCliente().getNombre() + ": " + participantes.get(i).getCliente().getContacto() + " \n";
                enviarMail(participantes.get(i));
                
            }
        } else {
            /**
             * Sino, realizo el sorteo de los premios entre los participantes
             */
            for (int i = 0; i < this.getCantPremios(); i++) {
                int random = (int) (Math.random() * (participantes.size() ));
                /**
                 * genero un numero al azar entre 0 y el numero de participantes
                 */
                Participante ganador = participantes.get(random);
                if (!ganadores.contains(ganador)) {
                    /**
                     * si el participante sorteado aun no gano ningun premio lo
                     * agrego como ganador
                     */
                    ganadores.add(ganador);
                    mensaje += ganador.getCliente().getNombre() + ": " + ganador.getCliente().getContacto() + " \n";
                    enviarMail(ganador);
                } else {
                    /**
                     * si el partipante sorteado ya gano un premio entonces
                     * vuelvo a sortear
                     */
                    i--;
                }
            }
        }
        System.out.println("En el sorteo:"+this.getCantPremios() + " - " + participantes.size());
        respuesta.setCod(0);
        respuesta.setRespuesta(mensaje + this.getCantPremios() + " " + participantes.size());
        
        return respuesta;
        
    }
    
    
    
    public int getCantPremios() {
        return cantPremios;
    }
    
    public void setCantPremios(int cantidadPremios) {
        this.cantPremios = cantidadPremios;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
    
    public ArrayList<Participante> getGanadores() {
        return ganadores;
    }
    
    public void setGanadores(ArrayList<Participante> ganadores) {
        this.ganadores = ganadores;
    }
    
    
    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    
    public ArrayList<String> getEmailEnviados() {
        return emailEnviados;
    }
    
    public void setEmailEnviados(ArrayList<String> emailEnviados) {
        this.emailEnviados = emailEnviados;
    }
    
    public String getMensajeGanador() {
        return mensajeGanador;
    }
    
    public void setMensajeGanador(String mensajeGanador) {
        this.mensajeGanador = mensajeGanador;
    }
    
    
    
    
    
    
    
    
}
