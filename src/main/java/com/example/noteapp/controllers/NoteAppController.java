package com.example.noteapp.controllers;

import com.example.noteapp.NoteAppApplication;
import com.example.noteapp.noteobject.Notefile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteAppController {

    Notefile notefile = new Notefile();

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

        // открываем окно выбора директории для нового файла, ввода названия файла
        // и выбора формата файла (по умолчанию txt)
        // не реализовано закрытие начального окна после создания нового файла
        // приходится закрывать вручную
    newnote.setOnAction(event -> {
        Stage stage = new Stage();
        System.out.println("Open new Note file");
        FXMLLoader fxmlLoader = new FXMLLoader(NoteAppApplication.class.getResource("newNoteFile.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 317, 228);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Note");
        stage.setScene(scene);
        stage.show();

    });

    // реализуем функцию открытия файла
    // открываем новое окно где выбираем файл
    // далее сохранённый адрес файла используется для чтения файл
    // и необходимой информации о нём
    opennote.setOnAction(event -> {
        System.out.println("Open Note file");

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(NoteAppApplication.class.getResource("OpenNoteFile.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 317, 228);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Open note file");
        stage.setScene(scene);
        stage.show();
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
    if (notefile.getText()!=null)
        System.out.println("Прошло проверку что текст есть");
    textnote.setText(notefile.getText());
    }

}