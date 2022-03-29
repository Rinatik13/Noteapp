package com.example.noteapp.logic;

import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class OpenAdressMenu {
    public String openAdressMenu(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        Stage window = new Stage();
//        File file = new File(fileChooser.showSaveDialog(window).getAbsoluteFile().toURI());
//        return file.toString();
        directoryChooser.setTitle("Папка для сохранения");
        File file = new File(directoryChooser.showDialog(window).getPath());
        return file.getAbsolutePath();
    }
}
