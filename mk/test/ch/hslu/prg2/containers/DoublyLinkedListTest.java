/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.containers;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.insert(0, 1); // [1]
        instance.insert(0, 5); // [5 1]
        instance.insert(1, 3); // [5 3 1]
        instance.insert(1, 4); // [5 4 3 1]
        instance.insert(2, 0); // [5 4 0 3 1]
        
        Assert.assertEquals(5, instance.get(0).intValue());
        Assert.assertEquals(3, instance.get(1).intValue());
        Assert.assertEquals(1, instance.get(2).intValue());
    }

    /**
     * Test of append method, of class DoublyLinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.append(1);
        instance.append(5);
        instance.append(3);
        
        Assert.assertEquals(1, instance.get(0).intValue());
        Assert.assertEquals(5, instance.get(1).intValue());
        Assert.assertEquals(3, instance.get(2).intValue());
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

    /**
     * Test of prepend method, of class DoublyLinkedList.
     */
    @Test
    public void testPrepend() {
        System.out.println("prepend");
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.prepend(1);
        instance.prepend(5);
        instance.prepend(3);
        
        Assert.assertEquals(3, instance.get(0).intValue());
        Assert.assertEquals(5, instance.get(1).intValue());
        Assert.assertEquals(1, instance.get(2).intValue());
    }
    
}
