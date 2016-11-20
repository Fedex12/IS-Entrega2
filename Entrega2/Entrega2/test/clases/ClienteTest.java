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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        
        Cliente instance = new Cliente();
        String expResult = "NombrePrueba";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setNombre method, of class Cliente.
     */

    @Test
    public void testGetDocumento() {
       
        Cliente instance = new Cliente();
        String expResult = "PruebaDocumento";
        instance.setDocumento(expResult);
        String result = instance.getDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    @Test
    public void testConstructor() {
       String nombre="Prueba nombre";
       String contacto="Prueba contacto";
       String documento= "Prueba documento";
       String email="Prueba email";
        Cliente instance = new Cliente(nombre, documento, contacto, email);
        String expResult = nombre + "," + documento + "," + contacto + "," + email;
        instance.setDocumento(expResult);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    



    /**
     * Test of getContacto method, of class Cliente.
     */
    @Test
    public void testGetContacto() {
        
        Cliente instance = new Cliente();
        String expResult = "PruebaContacto";
        instance.setContacto(expResult);
        String result = instance.getContacto();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setContacto method, of class Cliente.
     */


    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        
        Cliente instance = new Cliente();
        String expResult = "PruebaMail";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setEmail method, of class Cliente.
     */

    
}
