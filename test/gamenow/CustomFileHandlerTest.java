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

/**
 *
 * @author Colin
 */
public class CustomFileHandlerTest {
    
    public CustomFileHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of writeGameList method, of class CustomFileHandler.
     */
    @Test
    public void testWriteGameList() {
        System.out.println("writeGameList");
        GameList list = new GameList();
        list.add(new Game("test"));
        list.add(new Game("test 2"));
        list.add(new Game("test 3"));

        CustomFileHandler instance;
        instance = new CustomFileHandler("test.dat");
        boolean result = instance.writeGameList(list);
        assertTrue(result);
    }

    /**
     * Test of readGameList method, of class CustomFileHandler.
     */
    @Test
    public void testReadGameList() {
        System.out.println("readGameList");
        GameList list = new GameList();
        list.add(new Game("test"));
        list.add(new Game("test 2"));
        list.add(new Game("test 3"));
        
        CustomFileHandler instance = new CustomFileHandler("test.dat");
        instance.writeGameList(list);
        
        GameList result = new GameList();
        result = instance.readGameList(result);
//        
//        for (Game g : list) {
//            System.out.println(g);
//        }
//        System.out.println("");
//        for (Game g : result) {
//            System.out.println(g);
//        }
        for (int i = 0; i < result.size(); i++) {
           assertEquals(list.get(i).toString(), result.get(i).toString());
        }
    }
    
}
