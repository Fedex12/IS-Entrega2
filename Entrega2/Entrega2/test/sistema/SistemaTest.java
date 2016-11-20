/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import clases.Cliente;
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
    public void testAgregarClienteOK() {
        
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String mail = "EmailCliente";
        Sistema instance = new Sistema();
        Respuesta resp = instance.agregarCliente(nombre, documento, contacto, mail);
        assertEquals(0, resp.getCod());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getClientes method, of class Sistema.
     */
    @Test
    public void testAgregarCliente() {
        
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente";
        String expResult = nombre + "," + documento + "," + contacto + "," + email;
        instance.agregarCliente(nombre, documento, contacto, email);
        ArrayList<Cliente> result = instance.getClientes();
        assertEquals(expResult, result.get(0));
        // TODO review the generated test code and remove the default call to fail.

    }
    
      @Test
    public void testAgregarClienteExistente() {
        
        Sistema instance = new Sistema();
        String nombre = "NombreCliente";
        String documento = "DocumentoCliente";
        String contacto = "ContactoCliente";
        String email = "EmailCliente";
        int expResult = -1;
        instance.agregarCliente(nombre, documento, contacto, email);
        Respuesta result= instance.agregarCliente(nombre, documento, contacto, email);
        assertEquals(expResult, result.getCod());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of agregarEvaluacionIdentificada method, of class Sistema.
     */
    @Test
    public void testAgregarEvaluacionIdentificada() {
        System.out.println("agregarEvaluacionIdentificada");
        Cliente cliente = null;
        int estrellas = 0;
        String comentarios = "";
        Sistema instance = new Sistema();
        Respuesta expResult = null;
        Respuesta result = instance.agregarEvaluacionIdentificada(cliente, estrellas, comentarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFicha method, of class Sistema.
     */
    @Test
    public void testModificarFicha() {
        System.out.println("modificarFicha");
        String nombre = "";
        String direccion = "";
        String horario = "";
        String tipoComida = "";
        Sistema instance = new Sistema();
        Respuesta expResult = null;
        Respuesta result = instance.modificarFicha(nombre, direccion, horario, tipoComida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difinirSorteo method, of class Sistema.
     */
    @Test
    public void testDifinirSorteo() {
        System.out.println("difinirSorteo");
        int cantidadPremios = 0;
        String mensaje = "";
        Sistema instance = new Sistema();
        Respuesta expResult = null;
        Respuesta result = instance.difinirSorteo(cantidadPremios, mensaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enviarMail method, of class Sistema.
     */
    @Test
    public void testEnviarMail() {
        System.out.println("enviarMail");
        Participante participante = null;
        Sistema instance = new Sistema();
        instance.enviarMail(participante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortear method, of class Sistema.
     */
    @Test
    public void testSortear() {
        System.out.println("sortear");
        Sistema instance = new Sistema();
        Respuesta expResult = null;
        Respuesta result = instance.sortear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
