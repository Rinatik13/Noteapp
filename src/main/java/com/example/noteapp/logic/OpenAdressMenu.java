package com.example.noteapp.logic;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class OpenAdressMenu {
    public String openAdressMenu(){
        FileChooser fileChooser = new FileChooser();
        Stage window = new Stage();
//        File file = new File(fileChooser.showSaveDialog(window).getAbsoluteFile().toURI());
//        return file.toString();
        fileChooser.setTitle("Папка для сохранения");
        File file = new File(fileChooser.showOpenDialog(window).getPath());
        return file.getAbsolutePath();
    }
}
