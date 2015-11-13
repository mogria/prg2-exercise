/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.bank;

import junit.framework.Assert;
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
public class KontoTest {
    
    public KontoTest() {
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
     * Test of payIn method, of class Konto.
     */
    @Test
    public void testPayIn() {
        System.out.println("payIn");
        double in = 1.0;
        Konto instance = new Konto(1.0, 0.01);
        instance.payIn(in);
        //Assert.assertEquals("correct salo after payIn()", instance.getSaldo(), expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payOut method, of class Konto.
     */
    @Test
    public void testPayOut() {
        System.out.println("payOut");
        double out = 0.0;
        Konto instance = new Konto();
        instance.payOut(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Konto.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Konto instance = new Konto();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNo method, of class Konto.
     */
    @Test
    public void testGetNo() {
        System.out.println("getNo");
        Konto instance = new Konto();
        int expResult = 0;
        int result = instance.getNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRate method, of class Konto.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        Konto instance = new Konto();
        double expResult = 0.0;
        double result = instance.getRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Konto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Konto instance = new Konto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
