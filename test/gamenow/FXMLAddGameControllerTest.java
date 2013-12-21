/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Colin
 */
public class FXMLAddGameControllerTest {
    
    public FXMLAddGameControllerTest() {
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
     * Test of handleConfirmButton method, of class FXMLAddGameController.
     */
    @Ignore
    @Test
    public void testHandleConfirmButton() {
        System.out.println("handleConfirmButton");
        ActionEvent event = null;
        FXMLAddGameController instance = new FXMLAddGameController();
        instance.handleConfirmButton(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelAddGame method, of class FXMLAddGameController.
     */
    @Ignore
    @Test
    public void testCancelAddGame() {
        System.out.println("cancelAddGame");
        ActionEvent event = null;
        FXMLAddGameController instance = new FXMLAddGameController();
        instance.cancelAddGame(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLAddGameController.
     */
    @Ignore
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLAddGameController instance = new FXMLAddGameController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
