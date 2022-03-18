package com.example.noteapp.controllers;

import com.example.noteapp.logic.FileReaderNote;
import com.example.noteapp.logic.FileWriterNote;
import com.example.noteapp.logic.GetAdressAndNameAndFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;
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
        System.out.println("Open new Note file");
    });

    opennote.setOnAction(event -> {
        System.out.println("Open Note file");
        GetAdressAndNameAndFormat getAdressAndNameAndFormat = new GetAdressAndNameAndFormat();

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