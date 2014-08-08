/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cal3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konoha
 */
public class SingletonTest {
    
    public SingletonTest() {
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
     * Test of setCalc method, of class Singleton.
     */
    @Test
    public void testSetCalc() {
        System.out.println("setCalc");
        Singleton instance = new Singleton();
        instance.setCalc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SingletonCalc method, of class Singleton.
     */
    @Test
    public void testSingletonCalc() {
        System.out.println("SingletonCalc");
        Singleton instance = new Singleton();
        boolean expResult = false;
        boolean result = instance.SingletonCalc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
