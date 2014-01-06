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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Colin
 */
public class FXMLAddGameController implements Initializable{
    GameList list;
    String userID;
    CustomFileHandler gameFile;
    String prevScreen;

    @FXML
    private TextField gName, gCat;

    /**
     * handle confirm button
     *
     * @param event
     */
    @FXML
    protected void handleConfirmButton(ActionEvent event) {
        //add game to the game list
        System.out.println(gName.getText() + " Category = " + gCat.getText());
        if (!"".equals(gCat.getText()))
            list.add(new Game(gName.getText(), gCat.getText()));
        else 
            list.add(new Game(gName.getText()));
        
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource(prevScreen))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    protected void cancelAddGame(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource(prevScreen))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Model model = Model.getinstance();
        
        gameFile = model.getFilehandler();
        list = model.getList();
        userID = model.getUserID();
        prevScreen = model.getLastScreen();
    }

}
