/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class RadioCarroTest {
    
    public RadioCarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selectEmisora method, of class RadioCarro.
     */
    @Test
    public void testSelectEmisora() {
        System.out.println("selectEmisora");
        int btn = 0;
        RadioCarro instance = new RadioCarro();
        double expResult = 0.0;
        double result = instance.selectEmisora(btn);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncendido method, of class RadioCarro.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean state = false;
        RadioCarro instance = new RadioCarro();
        instance.setEncendido(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class RadioCarro.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean frecuency = false;
        RadioCarro instance = new RadioCarro();
        instance.setFrecuencia(frecuency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmisora method, of class RadioCarro.
     */
    @Test
    public void testSetEmisora() {
        System.out.println("setEmisora");
        double nuevaEmisora = 0.0;
        RadioCarro instance = new RadioCarro();
        instance.setEmisora(nuevaEmisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmisora method, of class RadioCarro.
     */
    @Test
    public void testSaveEmisora() {
        System.out.println("saveEmisora");
        int btn = 0;
        double emisora = 0.0;
        RadioCarro instance = new RadioCarro();
        instance.saveEmisora(btn, emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class RadioCarro.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        RadioCarro instance = new RadioCarro();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class RadioCarro.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        RadioCarro instance = new RadioCarro();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmisora method, of class RadioCarro.
     */
    @Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        RadioCarro instance = new RadioCarro();
        double expResult = 0.0;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
