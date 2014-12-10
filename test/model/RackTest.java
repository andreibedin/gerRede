/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila
 */
public class RackTest {
    
    public RackTest() {
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
     * Test of setNome method, of class Rack.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Rack@";
        Rack instance = new Rack();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Rack.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Rack instance = new Rack();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Rack.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Rack instance = new Rack();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Rack.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Rack instance = new Rack();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetor method, of class Rack.
     */
    @Test
    public void testGetSetor() {
        System.out.println("getSetor");
        Rack instance = new Rack();
        String expResult = "";
        String result = instance.getSetor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSetor method, of class Rack.
     */
    @Test
    public void testSetSetor() {
        System.out.println("setSetor");
        String setor = "";
        Rack instance = new Rack();
        instance.setSetor(setor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnidade method, of class Rack.
     */
    @Test
    public void testGetUnidade() {
        System.out.println("getUnidade");
        Rack instance = new Rack();
        String expResult = "";
        String result = instance.getUnidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnidade method, of class Rack.
     */
    @Test
    public void testSetUnidade() {
        System.out.println("setUnidade");
        String unidade = "";
        Rack instance = new Rack();
        instance.setUnidade(unidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
