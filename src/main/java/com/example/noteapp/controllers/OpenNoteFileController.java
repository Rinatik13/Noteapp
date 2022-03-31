package com.example.noteapp.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.noteapp.NoteAppApplication;
import com.example.noteapp.logic.FileReaderNote;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class OpenNoteFileController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Label adressopennotefile;

        @FXML
        private Button buttonadressopennotefile;

        @FXML
        private Button closeopennotefile;

        @FXML
        private Button opennotefile;

        @FXML
        void initialize() {

            // реализуем поиск файла который необходимо открыть в программе

            buttonadressopennotefile.setOnAction(event ->{
                System.out.println("Open button add open file adress");
                FileChooser fileChooser = new FileChooser();
                Stage stage = new Stage();
                fileChooser.setTitle("Open note file");
                File file = new File(fileChooser.showOpenDialog(stage).getAbsolutePath());
                adressopennotefile.setText(file.getAbsolutePath());
            });

            // реализуем открытие файла и загрузку данных в
            // программу
            opennotefile.setOnAction(event->{
                opennotefile.getScene().getWindow().hide();
                FileReaderNote fileReaderNote = new FileReaderNote();
                try {
                    fileReaderNote.fileReaderNote(adressopennotefile.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(NoteAppApplication.class.getResource("Noteapp.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(fxmlLoader.load(), 600, 400);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.setTitle("test");
                stage.setScene(scene);
                stage.show();
                System.out.println("Open note file");

                // как передать информацию с выбранного файла в новое окно программы???

            });

            // реализуем закрытие текушего окна
            // и возврат в придыдушее окно
            closeopennotefile.setOnAction(event ->{
                closeopennotefile.getScene().getWindow().hide();
            });
        }

    }

