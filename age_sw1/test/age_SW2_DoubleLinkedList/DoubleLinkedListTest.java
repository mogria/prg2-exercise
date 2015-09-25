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
public class DoubleLinkedListTest {
    
    public DoubleLinkedListTest() {
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
     * Test of findPrev method, of class DoubleLinkedList.
     */
    @Test
    public void testFindPrev() {
        System.out.println("findPrev");
        Object data = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        ListNode expResult = null;
        ListNode result = instance.findPrev(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTail method, of class DoubleLinkedList.
     */
    @Test
    public void testFindTail() {
        System.out.println("findTail");
        Object data = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        ListNode expResult = null;
        ListNode result = instance.findTail(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class DoubleLinkedList.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object data = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        ListNode expResult = null;
        ListNode result = instance.find(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.add(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DoubleLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object element = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DoubleLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class DoubleLinkedList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        DoubleLinkedList instance = new DoubleLinkedList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DoubleLinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DoubleLinkedList instance = new DoubleLinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
