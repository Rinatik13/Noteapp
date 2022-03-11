package com.example.noteapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteAppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem exit;

    @FXML
    private MenuItem newnote;

    @FXML
    private MenuItem opennote;

    @FXML
    private MenuItem saveasnote;

    @FXML
    private MenuItem savenote;

    @FXML
    private TextArea textnote;

    @FXML
    void initialize() {
    newnote.setOnAction(event -> {
//    newnote.getScene()
//            .getWindow()
//            .hide();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("com/example/noteapp/newNoteFile.fxml"));
    });

    opennote.setOnAction(event -> {
        System.out.println("Open Note file");
    });
    savenote.setOnAction(event -> {
        System.out.println("Save Note file");
    });
    saveasnote.setOnAction(event -> {
        System.out.println("Save Ass Note file");
    });
    exit.setOnAction(event -> {
        System.out.println("Close Note App");
    });


    }
}