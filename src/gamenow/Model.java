/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

import javafx.scene.image.Image;

/**
 * Contains all of the information that is used in the app. allowing access
 *  from a single location
 * @author Colin
 */
public class Model {
    private final static Model instance = new Model();
    
    public static Model getinstance() {
        return instance;
    }
    
    private GameList list;
    final private CustomFileHandler filehandler;
    private String userID;
    private String lastScreen;
    final private Image gameImage;
    final private String APIkey;
    
    public Model() {
        APIkey = "testkey";
        list = new GameList();
        filehandler = new CustomFileHandler("gameList.dat");
        
        list = filehandler.readGameList(list);
        gameImage = new Image("gamenow/res/no-image.png"); //image does not load...
    }
    
    
    public GameList getList() {
        return list;
    }
    
    public CustomFileHandler getFilehandler() {
        return filehandler;
    }
    
    public String getUserID() {
        return userID;
    }
    
    public String getLastScreen() {
        return lastScreen;
    }
    
    public void setLastScreen(String screen) {
        lastScreen = screen;
    }
    
    public void setUserID(String user) {
        userID = user;
    }
    
    public Image getImage() {
        return gameImage;
    }
    
    public String getKey() {
        return APIkey;
    }
}
