/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow;

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
    private CustomFileHandler filehandler;
    private String userID;
    
    public Model() {
        list = new GameList();
        filehandler = new CustomFileHandler("gameList.dat");
        
        list = filehandler.readGameList(list);
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
}
