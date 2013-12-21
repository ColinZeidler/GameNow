/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class GameListTest {
    
    public GameListTest() {
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
     * Test of getRandom method, of class GameList.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        
        //create the list of games
        GameList instance = new GameList();
        Game result = instance.getRandom();
        
        System.out.println("testing empty list to return NULL");
        assertNull(result);
        
        //add the games
        instance.add(new Game("Game 1", "cat1"));
        instance.add(new Game("Game 2", "cat1"));
        instance.add(new Game("Game 3", "cat2"));
        instance.add(new Game("Game 4", "cat3"));
        instance.add(new Game("Game 5", "cat5"));
        
        System.out.println("Testing non empty list does not return NULL");
        result = instance.getRandom();
        assertNotNull(result);
        System.out.println("Get Random passed");
        System.out.println("");
        
    }

    /**
     * Test of RecentFill method, of class GameList.
     */
    @Test
    public void testRecentFill() {
        System.out.println("RecentFill");
        GameList instance = new GameList();
        //add the games
        instance.add(new Game("Game 1", "cat1"));
        instance.add(new Game("Game 2", "cat1"));
        instance.add(new Game("Game 3", "cat2"));
        instance.add(new Game("Game 4", "cat3"));
        instance.add(new Game("Game 5", "cat5"));
        
        //make all games played
        instance.get(0).play();
        instance.get(1).play();
        instance.get(2).play();
        instance.get(3).play();
        instance.get(4).play();
        
        instance.RecentFill();
        assertArrayEquals(new Game[]{instance.get(0), instance.get(1), instance.get(2), 
        instance.get(3), instance.get(4), null, null, null, null, null}, instance.recentGames);
        
        System.out.println("RecentFill Passed");
        System.out.println("");
    }

    /**
     * Test of justPlayed method, of class GameList.
     */
    @Test
    public void testJustPlayed() {
        System.out.println("justPlayed");
        Game game = null;
        GameList instance = new GameList();
        instance.justPlayed(game);
        
        System.out.println("justPlayed passed");
        System.out.println("");
    }
    
}
