package com.example.noteapp.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.noteapp.logic.OpenAdressMenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class NewNoteFileController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addnewnote;

    @FXML
    private Label adressnewnote;

    @FXML
    private Button buttonadresswennote;

    @FXML
    private Button closenewnote;

    @FXML
    private ChoiceBox<?> formatnewnote;

    @FXML
    private TextField newnotefilename;

    @FXML
    void initialize() {
        buttonadresswennote.setOnAction(event -> {
            OpenAdressMenu openAdressMenu = new OpenAdressMenu();
            String adress = openAdressMenu.openAdressMenu();
            adressnewnote.setText(adress);
        });

    }

}
