package com.example.noteapp.controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class appInfoController {
    String ver = "1.0 demo";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label appverinfo;

    @FXML
    void initialize() {

        appverinfo.setText(ver);

    }

}