/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Colin
 */
public class ModelTest {
    
    public ModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getinstance method, of class Model.
     */
    @Test
    public void testGetinstance() {
        System.out.println("getinstance");
        Model expResult = null;
        Model result = Model.getinstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class Model.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        Model instance = new Model();
        GameList expResult = null;
        GameList result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilehandler method, of class Model.
     */
    @Test
    public void testGetFilehandler() {
        System.out.println("getFilehandler");
        Model instance = new Model();
        CustomFileHandler expResult = null;
        CustomFileHandler result = instance.getFilehandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserID method, of class Model.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastScreen method, of class Model.
     */
    @Test
    public void testGetLastScreen() {
        System.out.println("getLastScreen");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getLastScreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastScreen method, of class Model.
     */
    @Test
    public void testSetLastScreen() {
        System.out.println("setLastScreen");
        String screen = "";
        Model instance = new Model();
        instance.setLastScreen(screen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class Model.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String user = "";
        Model instance = new Model();
        instance.setUserID(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
