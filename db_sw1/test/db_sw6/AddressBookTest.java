/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw6;

import java.util.Comparator;
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
public class AddressBookTest {
    final AddressBook book = new AddressBook();
    
    public AddressBookTest() {
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
     * Test of addEntry method, of class AddressBook.
     */
    @Test
    public void testAddEntry() {
        System.out.println("Test 1: addEntry & getAt");
        String firstName = "Diego";
        String lastName = "Bienz";
        int zip = 6038;
        String eMail = "diego.bienz@gmail.com";
        book.addEntry(firstName, lastName, zip, eMail);
        assertEquals(book.getAt(0).getFistName(), "Diego");
        assertEquals(book.getAt(0).getLastName(), "Bienz");
        assertEquals(book.getAt(0).getZip(), 6038);
        assertEquals(book.getAt(0).getEMail(), "diego.bienz@gmail.com");
        System.out.println("");
        
        
        System.out.println("Test 2: addEntry & getAt");
        firstName = "D1ego333";
        book.addEntry(firstName, lastName, zip, eMail);
        System.out.println("");
        
        System.out.println("Test 3: addEntry & getAt");
        firstName = "Diego";
        eMail = "diego.bienzgmail.com";
        book.addEntry(firstName, lastName, zip, eMail);
        System.out.println("");
    }
    
}
