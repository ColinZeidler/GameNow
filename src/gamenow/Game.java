/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import java.io.Serializable;
import java.util.Date;

/**
 * Holds the variables that make up a Game object, as well as the functions that
 * are used to manipulate the variables
 *
 * @author Colin
 */
public class Game  implements Serializable{

    final private String name;
    private String category;
    private long lastPlayed;

    public Game(String n) {
        name = n;
        category = "None";
        lastPlayed = -1;
    }
    
    public Game(String n, String c) {
        name = n;
        category = c;
        lastPlayed = -1;
    }
    

    //getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Date getLastPlay() {
        return new Date(lastPlayed);
    }

    //setters
    public void setCategory(String cat) {
        category = cat;
    }

    public void play() {
        lastPlayed = new Date().getTime();    //sets the last played time to right now
    }
    
    @Override
    public String toString() {
        return "Game: Name: " + name + ", Category: " + category;
    }
}
