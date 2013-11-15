/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Colin Zeidler
 */
public class GameNow extends Application {

    GameList list;
    String userID;
    CustomFileHandler gameFile;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Model model = Model.getinstance();
        
        gameFile = model.getFilehandler();
        list = model.getList();
        userID = model.getUserID();
        
        //Start of file IO test code
        /*
        for (Game g: list) {
            System.out.println(g);
        }
        
        Game g1 = new Game("Game 1");
        Game g2 = new Game("Game 2");
        Game g3 = new Game("Game 3");
        Game g4 = new Game("Game 4");
        
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        
        gameFile.writeGameList(list);
        
        for (Game g: list) {
            System.out.println(g);
        }
        */
        //end of File IO test code

        Scene scene = new Scene(root);

        stage.setTitle("Game Now");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
