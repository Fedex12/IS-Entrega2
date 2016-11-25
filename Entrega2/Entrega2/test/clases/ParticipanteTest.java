/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import gonzalezabreu.dominio.Cliente;
import gonzalezabreu.dominio.Evaluacion;
import gonzalezabreu.dominio.Participante;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Federico
 */
public class ParticipanteTest {
    
    public ParticipanteTest() {
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
     * Test of getEvaluaciones method, of class Participante.
     */
    @Test
    public void testGetEvaluaciones() {
        ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();
        Evaluacion evaluacion= new Evaluacion(1, "Prueba");
        Cliente cliente = new Cliente();
        Participante instance = new Participante(cliente);
        instance.setEvaluaciones(evaluaciones);
        ArrayList<Evaluacion> respuesta=instance.getEvaluaciones();
        assertEquals(evaluaciones, respuesta);
    }

    /**
     * Test of setEvaluaciones method, of class Participante.
     */
    @Test
    public void testSetEvaluaciones() {
        
        ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();
        Evaluacion evaluacion= new Evaluacion(1, "Prueba");
        Cliente cliente = new Cliente();
        Participante instance = new Participante(cliente);
        instance.setEvaluaciones(evaluaciones);
        ArrayList<Evaluacion> respuesta=instance.getEvaluaciones();
        assertEquals(evaluaciones, respuesta);
    }


    @Test
    public void testAgregarEvaluacion() {
        ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();
        Evaluacion evaluacion= new Evaluacion(1, "Prueba");
        Cliente cliente = new Cliente();
        Participante instance = new Participante(cliente);
        instance.setEvaluaciones(evaluaciones);
        instance.agregarEvaluacion(evaluacion);
        evaluaciones.add(evaluacion);
        ArrayList<Evaluacion> respuesta=instance.getEvaluaciones();
        assertEquals(evaluaciones, respuesta);
        
    }

    /**
     * Test of getCliente method, of class Participante.
     */
    @Test
    public void testGetCliente() {
        Cliente cliente = new Cliente();
        
        Participante instance = new Participante(cliente);
        instance.setCliente(cliente);
        Cliente result = instance.getCliente();
        assertEquals(cliente, result);
        
    }

    /**
     * Test of setCliente method, of class Participante.
     */
    @Test
    public void testSetCliente() {
        Cliente cliente = new Cliente();
        Participante instance = new Participante(cliente);
        instance.setCliente(cliente);
        Cliente result = instance.getCliente();
        assertEquals(cliente, result);
    }

    /**
     * Test of equals method, of class Participante.
     */
    @Test
    public void testEqualsCorrecto() {
        Cliente cliente = new Cliente();
        Object obj = new Participante(cliente);
        Participante instance = new Participante(cliente);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
        @Test
    public void testEqualsDistintos() {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("NombreDistinto");
        Object obj = new Participante(cliente1);
        Participante instance = new Participante(cliente2);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
            @Test
    public void testEqualsObjetoDistinto() {
        Cliente cliente = new Cliente();
        
        Object obj = "";
        Participante instance = new Participante(cliente);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
}
