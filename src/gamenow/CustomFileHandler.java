/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenow;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Colin
 */
public class CustomFileHandler {

    String fileName;
    ObjectInput filereader;
    ObjectOutput filewriter;

    public CustomFileHandler(String fName) {
        fileName = fName;
    }

    public boolean writeGameList(GameList list) {
        boolean status = true;
        try {
            filewriter = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream(fileName)));
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found");
            status = false;
//            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("IO error (file probably could not be created)");
            status = false;
//            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println("writing to file: " + filewriter.toString());
        for (Game game : list) {
            try {
                filewriter.writeObject(game);
            } catch (IOException ex) {
                System.out.println("Unable to write game");
                status = false;
//                Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            filewriter.flush();
            filewriter.close();
        } catch (IOException ex) {
            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            status = false;
        }

        return status;
    }

    public GameList readGameList(GameList list) {
//        System.out.println("up here");
        try {
            filereader = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream(fileName)));
        } catch (EOFException e) {
            System.out.println("End of File exception");
            return list;

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
            return list;

        } catch (IOException e) {
            System.out.println("IOEXception");
            return list;
        }
//        System.out.println("down here");
        try {
//            System.out.println("about to read");
            Game temp;
            while ((temp = (Game) filereader.readObject()) != null) {
//                System.out.println("Reading");
                list.add(temp);
            }
        } catch (EOFException e) {
//            System.out.println("No more items to read");
        } catch (IOException ex) {
            System.out.println("Unable to read game");
//            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Unexpected class type");
//            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            filereader.close();
        } catch (IOException ex) {
            System.out.println("Unable to close Filereader");
//            Logger.getLogger(CustomFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
