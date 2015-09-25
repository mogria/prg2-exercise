/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_DoubleLinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class ListNodeTest {
    
    public ListNodeTest() {
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
     * Test of toString method, of class ListNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListNode instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortOrder method, of class ListNode.
     */
    @Test
    public void testGetSortOrder() {
        System.out.println("getSortOrder");
        ListNode instance = null;
        int expResult = 0;
        int result = instance.getSortOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class ListNode.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        ListNode instance = null;
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class ListNode.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        ListNode instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class ListNode.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        ListNode instance = null;
        ListNode expResult = null;
        ListNode result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class ListNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ListNode next = null;
        ListNode instance = null;
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrev method, of class ListNode.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        ListNode instance = null;
        ListNode expResult = null;
        ListNode result = instance.getPrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrev method, of class ListNode.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev");
        ListNode prev = null;
        ListNode instance = null;
        instance.setPrev(prev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
