package com.example.noteapp.controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.noteapp.NoteAppApplication;
import com.example.noteapp.logic.GetAdressAndNameAndFormat;
import com.example.noteapp.logic.NewNoteFile;
import com.example.noteapp.logic.OpenAdressMenu;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



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
            System.out.println(adress);
        });

        addnewnote.setOnAction(event -> {
            addnewnote.getScene().getWindow().hide();
           NewNoteFile newNoteFile = new NewNoteFile();
           GetAdressAndNameAndFormat getAdressAndNameAndFormat =
                   new GetAdressAndNameAndFormat(
                            adressnewnote.getText(),
                            newnotefilename.getText(),
                            ".txt");
           newNoteFile.newNoteFile(getAdressAndNameAndFormat);
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(NoteAppApplication.class.getResource("Noteapp.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 600, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setTitle("Note");
            stage.setScene(scene);
            stage.show();
        });
        addnewnote.cancelButtonProperty();

    }

}
