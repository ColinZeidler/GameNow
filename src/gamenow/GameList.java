/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import static java.lang.Math.min;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * a wrapper for the List of Games, enabling custom functions if needed
 * @author Colin
 */
public class GameList extends ArrayList<Game>{
    /*
     will not have to change this unless I want custom control
     but this will make it easy to do so.
     */
    public Game[] recentGames;
    public GameList(){
        super();
        recentGames = new Game[10];
    }
    
    /**
     * Chooses a random game from the list by using Math.random() to generate a 
     * number corresponding tot eh position of the game to return
     * @return The game that has been randomly selected
     */
    public Game getRandom() {
        Game game = null;
        if (size() > 0) {
            int rPos = (int)(Math.random() * size());
            game = get(rPos);
        }
        return game;
    }
    
    /**
     * sorts the list of Games by their lastPlayed param, and places the first
     * 10 into the recentGames array
     */
    public void RecentFill() {
        Comparator<Game> lastPlayed;
        lastPlayed = new Comparator<Game>() {
            @Override
            public int compare(Game g1, Game g2) {
                int i;
                i = (g1.getLastPlay().compareTo(g2.getLastPlay())) * -1;
                return i;
            }
        };
        Collections.sort(this, lastPlayed);
        
        //assuming that the games have been sorted by most recent to oldest
        //if not, we will start at (int i = size(); i > size()-10; i--)
        for (int i=0; i < min(this.size(), 10); i++) {
            recentGames[i] = this.get(i);
        }
    }
    
    /**
     * Places the given game at the front of the recentGames list, and shuffles
     * the list around, bumps the last played time of the game passed in.
     * 
     * @param game the most recent game played
     */
    public void justPlayed(Game game) {
        game.play();
        Game temp = game, temp2;
        for (int i=0; i < recentGames.length; i++) {
            if (recentGames[i] == null || recentGames[i].equals(game)) {
                recentGames[i] = temp;
                break;
            }
            temp2 = recentGames[i];
            recentGames[i] = temp;
            temp = temp2;
        }
    }
    
    /**
     * 
     * @param title title of the game to find
     * @return game with the given title if exists, otherwise NULL
     */
    public Game get(String title) {
        for (Game g: this) {
            if (g.getName().equals(title))
                return g;
        }
        
        //did not find a game matching this title
        return null;
    }

}
