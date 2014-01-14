/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow.steamapi;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Colin Connects to the steam api and downloads that game data
 * associated with the set user ID
 */
public class WebGet {
    private URL url;
    private gamenow.Model model;

    public WebGet() {
        model = gamenow.Model.getinstance();
    }

    public void connect() {
        try {
            url = new URL("http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key="
                    + model.getKey() + "&steamid=" + model.getUserID() + "&format=json");
        } catch (MalformedURLException ex) {
//            Logger.getLogger(WebGet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    InputStream is = url.openConnection().getInputStream();
//
//    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//
//    String line = null;
//    while ((line  = reader.readLine()) != null) {
//            System.out.println(line);
//    }
//
//    reader.close ();

}
