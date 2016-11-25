/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import gonzalezabreu.dominio.Ficha;
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
public class FichaTest {
    
    public FichaTest() {
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
     * Test of getNombre method, of class Ficha.
     */
    @Test
    public void testGetNombre() {
        String nombre="NombrePrueba";
        Ficha instance = new Ficha();
        instance.setNombre(nombre);
        String expResult = nombre;
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

     @Test
    public void testSetNombre() {
        String nombre="NombrePrueba";
        Ficha instance = new Ficha();
        instance.setNombre(nombre);
        String expResult = nombre;
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }


    /**
     * Test of getDireccion method, of class Ficha.
     */
    @Test
    public void testGetDireccion() {
        String direccion="PruebaDireccion";
        Ficha instance = new Ficha();
        String expResult = direccion;
        instance.setDireccion(direccion);
        String result = instance.getDireccion();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetDireccion() {
        String direccion="PruebaDireccion";
        Ficha instance = new Ficha();
        String expResult = direccion;
        instance.setDireccion(direccion);
        String result = instance.getDireccion();
        assertEquals(expResult, result);

    }

  
    @Test
    public void testSetHorario() {
        String horario="PruebaHorario";
        Ficha instance = new Ficha();
        String expResult = horario;
        instance.setHorario(horario);
        String result = instance.getHorario();
        assertEquals(expResult, result);
       
    }
    
        @Test
    public void testGetHorario() {
        String horario="PruebaHorario";
        Ficha instance = new Ficha();
        String expResult = horario;
        instance.setHorario(horario);
        String result = instance.getHorario();
        assertEquals(expResult, result);
       
    }


    /**
     * Test of getTipoComida method, of class Ficha.
     */
    @Test
    public void testGetTipoComida() {
        String tipoComida="PruebaTipoComida";
        Ficha instance = new Ficha();
        instance.setTipoComida(tipoComida);
        String expResult = tipoComida;
        String result = instance.getTipoComida();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSetYSetTipoComida() {
        String tipoComida="PruebaTipoComida";
        Ficha instance = new Ficha();
        instance.setTipoComida(tipoComida);
        String expResult = tipoComida;
        String result = instance.getTipoComida();
        assertEquals(expResult, result);
        
    }



    /**
     * Test of equals method, of class Ficha.
     */
    @Test
    public void testEqualsClienteIgual() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = new Ficha(nombre, direccion, horario, tipoComida);
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);
        
        boolean expResult = true;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    
        @Test
    public void testEqualsClienteDistintoNombre() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = new Ficha(nombre+"1", direccion, horario, tipoComida);
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);
        
        boolean expResult = false;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
            @Test
    public void testEqualsClienteDistintaDireccion() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = new Ficha(nombre, direccion+"1", horario, tipoComida);
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);
        
        boolean expResult = false;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
            @Test
    public void testEqualsClienteDistintoHorario() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = new Ficha(nombre, direccion,horario+"1", tipoComida);
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);
        
        boolean expResult = false;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
            @Test
    public void testEqualsClienteDistintoTipoComida() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = new Ficha(nombre, direccion, horario, tipoComida+"1");
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);
        
        boolean expResult = false;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        
        
    
        @Test
    public void testEqualsObjetoDistinto() {
        String nombre = "PruebaNOmbre";
        String direccion  = "PruebaDireccion";
        String horario = "PruebaHorario";
        String tipoComida = "PruebaTipoComida";
        Object obj = "prueba";
        Ficha ficha = new Ficha(nombre, direccion, horario, tipoComida);

        boolean expResult = false;
        boolean result = ficha.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
