/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamenow.ui;

import gamenow.CustomFileHandler;
import gamenow.Game;
import gamenow.GameList;
import gamenow.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * Page that displays all games in a grid
 * @author Colin
 */
public class FXMLGameListController implements Initializable {
    private Model model;
    private GameList list;
    private String userID;
    private CustomFileHandler gameFile;
    private int w,h;
    
    @FXML
    private GridPane gameGrid;
    
    /*
    button handlers
    */
    @FXML
    protected void newGame(ActionEvent event) {
        //change screens to an add game screen
        model.setLastScreen("FXMLGameList.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource("FXMLAddGame.fxml"))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    protected void backToHome(ActionEvent event) {
        //change screens to an add game screen
        model.setLastScreen("FXMLGameList.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = Model.getinstance();
        
        gameFile = model.getFilehandler();
        list = model.getList();
        userID = model.getUserID();
        
        placeGames();
    }    
    
    private void placeGames() {
        //look at height of window, and set grid height based on this.
            //assuming h=720, w=1280
        w=1280;
        h=720;
        //loop through all of the games
        int vMax = (720-100) / 200;
        int count = 0;
        for (Game g: list) {
            Button button = new Button(g.getName());
            ImageView image = new ImageView(model.getImage());
            button.setGraphic(image);
            gameGrid.add(button, count/vMax, count % vMax);
            
            count++;
        }
        
    }
    
}
