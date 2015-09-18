/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.bank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mogria
 */
public class SparKontoTest {
    
    public SparKontoTest() {
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
     * Test of getMaxOut method, of class SparKonto.
     */
    @Test
    public void testGetMaxOut() {
        System.out.println("getMaxOut");
        SparKonto instance = null;
        double expResult = 0.0;
        double result = instance.getMaxOut();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payIn method, of class SparKonto.
     */
    @Test
    public void testPayIn() {
        System.out.println("payIn");
        double in = 0.0;
        SparKonto instance = null;
        instance.payIn(in);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payOut method, of class SparKonto.
     */
    @Test
    public void testPayOut() {
        System.out.println("payOut");
        double out = 0.0;
        SparKonto instance = null;
        instance.payOut(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SparKonto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SparKonto instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
