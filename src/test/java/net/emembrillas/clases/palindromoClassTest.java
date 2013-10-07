/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.emembrillas.clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edu
 */
public class palindromoClassTest {
    
    public palindromoClassTest() {
    System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }
    
    @Test
    public void testGetPalindromo() {
        System.out.println("test: getPalindromo()");
        palindromoClass oPalindromo = new palindromoClass();   
        assertNotNull("objeto palindromo creado", oPalindromo);
        assertEquals("getNombre: Debe devolver una cadena", oPalindromo.getPalindromo("Pepito"), "Pepito");
        assertTrue("getPalindromo: Deve devolver un String", "".equals(oPalindromo.getPalindromo("")));
        if (!oPalindromo.getPalindromo("Pepe").equals("Pepe")) {
            fail("getPalindromo: Palíndromo distinto");
        }
        assertSame("prueba getReference", oPalindromo, oPalindromo.getReference());
        palindromoClass oPalindromo2 = new palindromoClass();
        assertNotSame("no son el mismo objeto", oPalindromo, oPalindromo2);
    }
}