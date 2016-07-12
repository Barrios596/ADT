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
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setEncendido method, of class Radio.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        Radio instance = new RadioImpl();
        instance.setEncendido();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class Radio.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        Radio instance = new RadioImpl();
        instance.setFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmisora method, of class Radio.
     */
    @Test
    public void testSetEmisora() {
        System.out.println("setEmisora");
        double nuevaEmisora = 0.0;
        Radio instance = new RadioImpl();
        instance.setEmisora(nuevaEmisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmisora method, of class Radio.
     */
    @Test
    public void testSaveEmisora() {
        System.out.println("saveEmisora");
        int btn = 0;
        double emisora = 0.0;
        Radio instance = new RadioImpl();
        instance.saveEmisora(btn, emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectEmisora method, of class Radio.
     */
    @Test
    public void testSelectEmisora() {
        System.out.println("selectEmisora");
        int btn = 0;
        Radio instance = new RadioImpl();
        double expResult = 0.0;
        double result = instance.selectEmisora(btn);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class Radio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmisora method, of class Radio.
     */
    @Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        Radio instance = new RadioImpl();
        double expResult = 0.0;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RadioImpl implements Radio {

        public void setEncendido() {
        }

        public void setFrecuencia() {
        }

        public void setEmisora(double nuevaEmisora) {
        }

        public void saveEmisora(int btn, double emisora) {
        }

        public double selectEmisora(int btn) {
            return 0.0;
        }

        public boolean getEncendido() {
            return false;
        }

        public boolean getFrecuencia() {
            return false;
        }

        public double getEmisora() {
            return 0.0;
        }
    }
    
}
