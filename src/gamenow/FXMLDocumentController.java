/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Colin
 */
public class FXMLDocumentController {

    @FXML
    private Text gameNameText;

    @FXML
    protected void handleRandomButton(ActionEvent e) {
        gameNameText.setText("Random Game!");
    }
    
    @FXML
    protected void handleMenuButton(ActionEvent e) {
        gameNameText.setText("");
    }
}
