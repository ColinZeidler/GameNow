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
public class FXMLGameListControllerTest {
    
    public FXMLGameListControllerTest() {
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
     * Test of newGame method, of class FXMLGameListController.
     */
    @Ignore
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        ActionEvent event = null;
        FXMLGameListController instance = new FXMLGameListController();
        instance.newGame(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of backToHome method, of class FXMLGameListController.
     */
    @Ignore
    @Test
    public void testBackToHome() {
        System.out.println("backToHome");
        ActionEvent event = null;
        FXMLGameListController instance = new FXMLGameListController();
        instance.backToHome(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLGameListController.
     */
    @Ignore
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLGameListController instance = new FXMLGameListController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
