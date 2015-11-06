/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.solidworks;

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
public class CubeTest {
    
    public CubeTest() {
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
     * Test of getVolume method, of class Cube.
     */
    @Test
    public void testGetVolume() {
        Cube instance = new Cube(1, 4, 2, 8);
        int expResult = 4 * 2 * 8;
        int result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurface method, of class Cube.
     */
    @Test
    public void testGetSurface() {
        Cube instance = new Cube(2, 2, 3, 4);
        int expResult = 2 * (2 * 3 + 3 * 4 + 4 * 2);
        int result = instance.getSurface();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxDimension method, of class Cube.
     */
    @Test
    public void testGetMaxDimension() {
        Cube instance = new Cube(3, 4, 8, 9);
        int expResult = 9;
        int result = instance.getMaxDimension();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Cube.
     */
    @Test
    public void testEquals() {
        Cube other = new Cube(5, 3, 2, 1);
        Cube instance = new Cube(4, 2, 3, 1);
        boolean expResult = true;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Cube.
     */
    @Test
    public void testEqualsFalse() {
        Cube other = new Cube(5, 3, 2, 1);
        Cube instance = new Cube(4, 3, 3, 1);
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Cube.
     */
    @Test
    public void testCompareTo() {
        Cube other = new Cube(1, 3, 5, 2);
        Cube instance = new Cube(1, 3, 5, 1);
        int expResult = -1;
        int result = instance.compareTo(other);
        assertTrue(result < 0);
    }
    
}
