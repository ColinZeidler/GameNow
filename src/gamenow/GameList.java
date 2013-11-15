/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import java.util.ArrayList;

/**
 * a wrapper for the List of Games, enabling custom functions if needed
 * @author Colin
 */
public class GameList extends ArrayList<Game>{
    
    /*
     will not have to change this unless I want custom control
     but this will make it easy to do so.
     */
    public Game getRandom() {
        Game game = null;
        if (size() > 0) {
            int rPos = (int)(Math.random() * size());
            game = get(rPos);
        }
        return game;
    }

}
