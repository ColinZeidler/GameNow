/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Colin
 */
public class FXMLDocumentController implements Initializable{
    private Model model;
    private GameList list;
    private String userID;
    private CustomFileHandler gameFile;

    @FXML
    private Text gameNameText;
    @FXML
    private ListView<Game> recentList;
    @FXML
    private GridPane recentGameGrid;

    @FXML
    protected void handleRandomButton(ActionEvent e) {
        Game rand = list.getRandom();
        if (rand != null)
            gameNameText.setText(rand.getName());
        else
            gameNameText.setText("Add a game before you try to pick one");
    }
    
    @FXML
    protected void handleAddGame(ActionEvent event) {
        //change screens to an add game screen
        model.setLastScreen("FXMLDocument.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource("FXMLAddGame.fxml"))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    protected void handleSaveList(ActionEvent event) {
        gameFile.writeGameList(list);
    }
    
    @FXML
    protected void handleAllGamesButton(ActionEvent event) {
        //change screens to an add game screen
        model.setLastScreen("FXMLDocument.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource("FXMLGameList.fxml"))));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAddGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = Model.getinstance();
        
        gameFile = model.getFilehandler();
        list = model.getList();
        userID = model.getUserID();
        
        ObservableList<Game> recent = FXCollections.observableArrayList(list);
        recentList.setItems(recent);
        
        for (int i = 0; i < 10; i++) {
            Button button = new Button("Button " + i);
            recentGameGrid.add(button, i%5, (i)/5);
        }
    }
}
