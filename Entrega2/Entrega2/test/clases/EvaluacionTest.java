/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class EvaluacionTest {
    
    public EvaluacionTest() {
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
     * Test of getEstrellas method, of class Evaluacion.
     */
    @Test
    public void testGetEstrellas() {
       
        Evaluacion instance = new Evaluacion();
        int expResult = 4;
        instance.setEstrellas(expResult);
        int result = instance.getEstrellas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
       
    @Test
    public void testSetEstrellas() {
       
        Evaluacion instance = new Evaluacion();
        int expResult = 4;
        instance.setEstrellas(expResult);
        int result = instance.getEstrellas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of getComentario method, of class Evaluacion.
     */
    @Test
    public void testGetComentario() {
        
        Evaluacion instance = new Evaluacion();
        String expResult = "Comentario";
        instance.setComentario(expResult);
        String result = instance.getComentario();
        assertEquals(expResult, result);
       
    }
        @Test
    public void testSetComentario() {
        
        Evaluacion instance = new Evaluacion();
        String expResult = "Comentario";
        instance.setComentario(expResult);
        String result = instance.getComentario();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setComentario method, of class Evaluacion.
     */
 

    /**
     * Test of equals method, of class Evaluacion.
     */
    @Test
    public void testEqualsIguales() {
        int estrellas=3;
        String comentario ="ComentarioPrueba";
        Object obj = new Evaluacion(estrellas, comentario);;
        Evaluacion instance = new Evaluacion(estrellas, comentario);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
        @Test
    public void testEqualsDistintoNombre() {
        int estrellas=3;
        String comentario ="ComentarioPrueba";
        Object obj = new Evaluacion(estrellas, comentario);;
        Evaluacion instance = new Evaluacion(estrellas, comentario+1);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
            @Test
    public void testEqualsDistintasEstrellas() {
        int estrellas=3;
        String comentario ="ComentarioPrueba";
        Object obj = new Evaluacion(estrellas, comentario);;
        Evaluacion instance = new Evaluacion(estrellas+1, comentario);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
                @Test
    public void testEqualsObjetoDistinto() {
        int estrellas=3;
        String comentario ="ComentarioPrueba";
        Object obj = " ";
        Evaluacion instance = new Evaluacion(estrellas+1, comentario);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
