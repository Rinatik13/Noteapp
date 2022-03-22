package com.example.noteapp.logic;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class OpenAdressMenu {
    public String openAdressMenu(){
        FileChooser fileChooser = new FileChooser();
        Window window = new Stage();
        fileChooser.showOpenDialog(window);
        return fileChooser.getInitialFileName().toString();
    }
}
