/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import clases.Cliente;
import clases.Evaluacion;
import clases.Participante;
import clases.Respuesta;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico
 */
public class SistemaTest {
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarCliente method, of class Sistema.
     */
    @Test
    public void testAgregarClienteCorrecto() {
        
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String mail = "Email@mail";
        Sistema instance = new Sistema();
        Respuesta resp = instance.agregarCliente(nombre, documento, contacto, mail);
        assertEquals(0, resp.getCod());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getClientes method, of class Sistema.
     */
    @Test
    public void testExisteClienteAgregado() {
        
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "mail@mail";
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
        ArrayList<Cliente> result = instance.getClientes();
        assert(result.contains(cliente));
        // TODO review the generated test code and remove the default call to fail.

    }
    
      @Test
    public void testAgregarClienteRepetido() {
        
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int expResult = -1;
        instance.agregarCliente(nombre, documento, contacto, email);
        Respuesta result= instance.agregarCliente(nombre, documento, contacto, email);
        System.out.println(result.getRespuesta());
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.

    }
    
          @Test
    public void testAgregarNombreVacio() {
        
        Sistema instance = new Sistema();
        String nombre = "";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int expResult = -1;
        
        Respuesta result= instance.agregarCliente(nombre, documento, contacto, email);
        System.out.println(result.getRespuesta());
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.

    }
              @Test
    public void testAgregarMailIncorrecto() {
        
        Sistema instance = new Sistema();
        String nombre = "NombreVliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailClient";
        int expResult = -1;
        
        Respuesta result= instance.agregarCliente(nombre, documento, contacto, email);
        System.out.println(result.getRespuesta());
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.

    }
    

    /**
     * Test of agregarEvaluacionIdentificada method, of class Sistema.
     */
    @Test
    public void testAgregarEvaluacionIdentificadaRespuestaOK() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int estrellas = 3;
        String comentarios = "ComentarioPrueba";
        
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
       
        
        int expResult = 0;
        Respuesta result = instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }
    
    
        @Test
    public void testAgregarEvaluacionIdentificadaComentarioVacio() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int estrellas = 3;
        String comentarios = "";
        
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
       
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }
    @Test
    public void testAgregarEvaluacionIdentificadaDatosIncorrectos1() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int estrellas = 7;
        String comentarios = "ComentarioPrueba";
        
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
       
        
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }
    @Test
    public void testAgregarEvaluacionIdentificadaDatosIncorrectos2() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente";
        int estrellas = -3;
        String comentarios = "ComentarioPrueba";
        
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
       
        
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }

        @Test
    public void testAgregarEvaluacionIdentificadaClienteSinEvaluaciones() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        int estrellas = 3;
        String comentarios = "ComentarioPrueba";
        Participante expResult;
        
        Cliente cliente = new Cliente(nombre, documento, contacto, email);
        instance.agregarCliente(nombre, documento, contacto, email);
        Respuesta resul=instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        
        expResult= new Participante(cliente);
        ArrayList<Participante> result = instance.getParticipantes();
        assertEquals(0,resul.getCod());
        
        
    }
        @Test
       public void testAgregarEvaluacionIdentificadaAgregarVariasEvaluacionesACliente() {
       
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente@mail";
        
        int[] estrellas = {3,4,5};
        String[] comentarios ={"Comentario1","Comentario2","Comentario3"};
        ArrayList<Evaluacion> expResult=new ArrayList<Evaluacion>();
        instance.agregarCliente(nombre, documento, contacto, email);
        
        Cliente cliente1 = new Cliente(nombre, documento, contacto, email);
        
        
        for(int i=0;i<3;i++){
            instance.agregarEvaluacionIdentificada(cliente1, estrellas[i], comentarios[i]);
            Evaluacion evaluacion= new Evaluacion( estrellas[i], comentarios[i]);
            expResult.add(evaluacion);
        }
        ArrayList<Participante> result = instance.getParticipantes();
        for(int i=0;i<expResult.size();i++){
            assert(result.get(0).getEvaluaciones().contains(expResult.get(i)));
        }
        
    }
       
        @Test
       public void testAgregarEvaluacionAnonimaRespuestaOK() {
       
        Sistema instance = new Sistema();
        int estrellas = 4;
        String comentarios = "ComentarioPrueba";
        int expResult = 0;
        Respuesta result = instance.agregarEvaluacionAnonima(estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       }
       
                @Test
       public void testAgregarEvaluacionAnonimaComentarioVacio() {
       
        Sistema instance = new Sistema();
        int estrellas = 4;
        String comentarios = "";
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionAnonima(estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }   @Test
       public void testAgregarEvaluacionAnonimaApareceCorrecta() {
       
        Sistema instance = new Sistema();
        int estrellas = 4;
        String comentarios = "ComentarioPrueba";
        Evaluacion evaluacion=new Evaluacion(estrellas, comentarios);
        instance.agregarEvaluacionAnonima(estrellas, comentarios);
        ArrayList<Evaluacion> result = instance.getEvaluaciones();
        assert(result.contains(evaluacion));
       
        
    }   @Test
       public void testAgregarEvaluacionAnonimaDatosIncorrectos1() {
       
        Sistema instance = new Sistema();
        int estrellas = 7;
        String comentarios = "ComentarioPrueba";
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionAnonima(estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }   @Test
       public void testAgregarEvaluacionAnonimaDatosIncorrectos2() {
       
        Sistema instance = new Sistema();
        int estrellas = -3;
        String comentarios = "ComentarioPrueba";
        int expResult = -1;
        Respuesta result = instance.agregarEvaluacionAnonima(estrellas, comentarios);
        assertEquals(expResult, result.getCod());
       
        
    }
    
    /**
     * Test of modificarFicha method, of class Sistema.
     */
    @Test
    public void testModificarFicha() {
        
        String nombre = "NombrePrueba";
        String direccion = "DireccionPrueba";
        String horario = "HorarioPrueba";
        String tipoComida = "TipoComidaPrueba";
        Sistema instance = new Sistema();
        int expResult = 0;
        Respuesta result = instance.modificarFicha(nombre, direccion, horario, tipoComida);
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of difinirSorteo method, of class Sistema.
     */
    @Test
    public void testDifinirSorteoOK() {
        
        int cantidadPremios = 3;
        String mensaje = "MensajePrueba";
        int expResult = 0;
        
        Sistema instance = new Sistema();
        
        Respuesta result = instance.definirSorteo(cantidadPremios, mensaje);
        assertEquals(expResult, result.getCod());
        
    }
        @Test
    public void testDifinirSorteoMensajeVacio() {
        
        int cantidadPremios = 3;
        String mensaje = "";
        int expResult = -1;
        
        Sistema instance = new Sistema();
        
        Respuesta result = instance.definirSorteo(cantidadPremios, mensaje);
        assertEquals(expResult, result.getCod());
        
    }
    
        @Test
    public void testDifinirSorteoCantidadPremiosNegativos() {
        
        int cantidadPremios = -3;
        String mensaje = "MensajePrueba";
        int expResult = -1;
        
        Sistema instance = new Sistema();
        
        Respuesta result = instance.definirSorteo(cantidadPremios, mensaje);
        assertEquals(expResult, result.getCod());
        
    }

    /**
     * Test of enviarMail method, of class Sistema.
     */
    @Test
    public void testEnviarMail() {
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "Fede_12990@hotmail.com";
       
        Cliente cliente= new Cliente(nombre, documento, contacto, email);
        Participante participante = new Participante(cliente);
        
        Sistema instance = new Sistema();
        int expResult=0;
        
        Respuesta result=instance.enviarMail(participante);
        
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sortear method, of class Sistema.
     */
    @Test
    public void testSortearCorrectamente() {
         String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "Fede_12990@hotmail.com";
        int estrellas = 3;
        String comentarios = "ComentarioPrueba";
        int cantidadPremios = 1;
        String mensaje = "MensajePrueba";
        Sistema instance = new Sistema();
        int expResult = 0;
        Cliente cliente= new Cliente(nombre, documento, contacto, email);
        instance.definirSorteo(cantidadPremios, mensaje);
        instance.agregarCliente(nombre, documento, contacto, email);
        instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        Respuesta result = instance.sortear();
        assertEquals(expResult, result.getCod());
        
    }
    

    
    @Test
    public void testSortearSeSorteaCorrectamenteYVerificoGanador() {
         
        int cantidadPremios = 5;
        String mensaje = "MensajePrueba";
        Sistema instance = new Sistema();
        for(int i=1;i<6;i++){
        Cliente cliente= new Cliente("Nombre"+i, "Documento"+i, "Contacto"+i, "Fede_12990@hotmail.com"+i);
        instance.agregarCliente("Nombre"+i, "Documento"+i, "Contacto"+i, "Fede_12990@hotmail.com"+i);
        instance.agregarEvaluacionIdentificada(cliente, i, "Comentario"+i);
        }
        instance.definirSorteo(cantidadPremios, mensaje);
        instance.sortear();
        ArrayList<Participante> participantes= instance.getParticipantes();
        
        ArrayList<Participante> ganadores= instance.getGanadores();
       
        assert(participantes.contains(ganadores.get(0)));
        
    }
    
        @Test
    public void testSortearSeSorteanMasPremiosQueParticipantes() {
         
        int cantidadPremios = 10;
        String mensaje = "MensajePrueba";
        Sistema instance = new Sistema();
        for(int i=1;i<6;i++){
        Cliente cliente= new Cliente("Nombre"+i, "Documento"+i, "Contacto"+i, "Fede_12990@hotmail.com"+i);
        instance.agregarCliente("Nombre"+i, "Documento"+i, "Contacto"+i, "Fede_12990@hotmail.com"+i);
        instance.agregarEvaluacionIdentificada(cliente, i, "Comentario"+i);
        }
        instance.definirSorteo(cantidadPremios, mensaje);
        Respuesta result=instance.sortear();
        int expResult = 0;
        
       
        assertEquals(expResult,result.getCod());
        
    }
    
}
