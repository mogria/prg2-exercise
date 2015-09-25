/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.containers;

import java.util.Iterator;
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
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
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
     * Test of get method, of class DoublyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class DoublyLinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int index = 0;
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.insert(index, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of append method, of class DoublyLinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.append(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DoublyLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.remove(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class DoublyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class DoublyLinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        DoublyLinkedList instance = new DoublyLinkedList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
