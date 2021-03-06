/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import java.util.Date;
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
public class GameTest {
    Game testG1, testG2;
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testG1 = new Game("Test Game #1", "RPG");
        testG2 = new Game("Test Game #2");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult1 = "Test Game #1";
        String result1 = testG1.getName();
        
        System.out.println("Asserting get name returns the correct name");
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getCategory method, of class Game.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        String expResult = "RPG";
        String result = testG1.getCategory();
        
        System.out.println("Asserting category is retrieved");
        assertEquals(expResult, result);
        
        expResult = "None";
        result = testG2.getCategory();
        
        System.out.println("Asserting non entered category is retrieved");
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastPlay method, of class Game.
     */
    @Test
    public void testGetLastPlay() {
        System.out.println("getLastPlay");
        Game instance = testG1;
        Date expResult = new Date(-1);
        Date result = instance.getLastPlay();
        
        System.out.println("Asserting that default date  = -1");
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategory method, of class Game.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String cat = "Test Cat";
        Game instance = new Game("Test");
        instance.setCategory(cat);
        assertEquals(instance.getCategory(), cat);
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = testG2;
        Date expected = new Date();
        instance.play();
        
        assertEquals(expected, instance.getLastPlay());
    }

    /**
     * Test of toString method, of class Game.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Game instance = new Game("Test Game", "Test Cat");
        String expResult = "Game: Name: Test Game, Category: Test Cat";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
