/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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

    /**
     * Test of getinstance method, of class Model.
     */
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    
}
