/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class RingbufferTest {
    
    public RingbufferTest() {
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
     * Test of enqueue method, of class Ringbuffer.
     */
    @Test
    public void testQueue() {
        System.out.println("enqueue");
        int[] queue = new int[50];
        int x = 1;
        Ringbuffer instance = new Ringbuffer<int>(queue);
        instance.enqueue(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
