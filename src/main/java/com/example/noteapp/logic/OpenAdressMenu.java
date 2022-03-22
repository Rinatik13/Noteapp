package com.example.noteapp.logic;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;

public class OpenAdressMenu {
    public String openAdressMenu(){
        FileChooser fileChooser = new FileChooser();
        Window window = new Stage();
        File file = new File(fileChooser.showSaveDialog(window).getAbsoluteFile().toURI());
        return file.toString();
    }
}
