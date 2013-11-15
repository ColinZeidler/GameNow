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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Colin
 */
public class FXMLDocumentController implements Initializable{
    GameList list;
    String userID;
    CustomFileHandler gameFile;

    @FXML
    private Text gameNameText;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Model model = Model.getinstance();
        
        gameFile = model.getFilehandler();
        list = model.getList();
        userID = model.getUserID();
        
        for(Game g : list)
            System.out.println(g);
    }
}
