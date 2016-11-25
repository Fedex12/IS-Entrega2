/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gonzalezabreu.dominio;

/**
 *
 * @author Federico
 */
public class Respuesta {
    private int cod;
    private String respuesta;

    public Respuesta(int cod, String respuesta) {
        this.cod = cod;
        this.respuesta = respuesta;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
