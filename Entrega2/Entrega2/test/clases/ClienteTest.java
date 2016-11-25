/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import gonzalezabreu.dominio.Cliente;
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


    @Test
    public void testGetNombre() {
        
        Cliente instance = new Cliente();
        String expResult = "NombrePrueba";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

       @Test
    public void testSetNombre() {
        
        Cliente instance = new Cliente();
        String expResult = "NombrePrueba";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
      
    }

    @Test
    public void testGetDocumento() {
       
        Cliente instance = new Cliente();
        String expResult = "PruebaDocumento";
        instance.setDocumento(expResult);
        String result = instance.getDocumento();
        assertEquals(expResult, result);
     
      
    }
    
     @Test
    public void testSetDocumento() {
       
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
        String expResult = nombre + " - " + documento + " - " + contacto + " - " + email;;
        
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
    
       @Test
    public void testSetContacto() {
        
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
    @Test
    public void testSetEmail() {
        
        Cliente instance = new Cliente();
        String expResult = "PruebaMail";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);  
    }

   @Test
    public void testEqualsClientesIguales() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=true;
        Object obj = new Cliente(nombre, documento, contacto, email);
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }   
    
       @Test
    public void testEqualsClientesDistintoNombre() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=false;
        Object obj = new Cliente(nombre+"1", documento, contacto, email);
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
           @Test
    public void testEqualsClientesDistintoDocumento() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=false;
        Object obj = new Cliente(nombre, documento+"1", contacto, email);
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
           @Test
    public void testEqualsClientesDistintoContacto() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=false;
        Object obj = new Cliente(nombre, documento, contacto+"1", email);
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
           @Test
    public void testEqualsClientesDistintoEmail() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=false;
        Object obj = new Cliente(nombre, documento, contacto, email+"1");
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
           @Test
    public void testEqualsClientesDistintoObjeto() {
        String nombre ="Nombre";
        String documento="Documento";
        String contacto="Contacto";
        String email= "email";
        boolean expResult=false;
        Object obj = "ObjetoDistinto";
        Cliente cliente =new Cliente(nombre, documento, contacto, email);
        
        boolean result= cliente.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
