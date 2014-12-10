
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PortasTest {
    
    public PortasTest() {
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

    
    @Test
    public void testGetIdSwitch() {
        System.out.println("getIdSwitch");
        Portas instance = new Portas();
        int expResult = 0;
        int result = instance.getIdSwitch();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdSwitch() {
        System.out.println("setIdSwitch");
        int idSwitch = 0;
        Portas instance = new Portas();
        instance.setIdSwitch(idSwitch);
        
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetIdPorta() {
        System.out.println("getIdPorta");
        Portas instance = new Portas();
        int expResult = 0;
        int result = instance.getIdPorta();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetNumPorta() {
        System.out.println("getNumPorta");
        Portas instance = new Portas();
        int expResult = 0;
        int result = instance.getNumPorta();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetNumPorta() {
        System.out.println("setNumPorta");
        int numPorta = 0;
        Portas instance = new Portas();
        instance.setNumPorta(numPorta);
       
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetIdPorta() {
        System.out.println("setIdPorta");
        int idPorta = 0;
        Portas instance = new Portas();
        instance.setIdPorta(idPorta);
        
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetVlan() {
        System.out.println("getVlan");
        Portas instance = new Portas();
        int expResult = 0;
        int result = instance.getVlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVlan method, of class Portas.
     */
    @Test
    public void testSetVlan() {
        System.out.println("setVlan");
        int vlan = 0;
        Portas instance = new Portas();
        instance.setVlan(vlan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Portas.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Portas instance = new Portas();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Portas.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Portas instance = new Portas();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
