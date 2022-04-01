package com.example.noteapp.controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.noteapp.NoteAppApplication;
import com.example.noteapp.logic.GetAdressAndNameAndFormat;
import com.example.noteapp.logic.NewNoteFile;
import com.example.noteapp.logic.OpenAdressMenu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private ChoiceBox<String> formatnewnote;

    @FXML
    private TextField newnotefilename;


    ObservableList<String> observableList = FXCollections
            .observableArrayList(".txt");

    // реализуем события при нажатии кнопок
    @FXML
    void initialize() {

        // выводит при нажатии окно где выбираем папку где будет хранится новый файл
        buttonadresswennote.setOnAction(event -> {
            OpenAdressMenu openAdressMenu = new OpenAdressMenu();
            String adress = openAdressMenu.openAdressMenu();
            adressnewnote.setText(adress);
            System.out.println(adress);
        });

        // должен выходить список доступных форматов документа.
        formatnewnote.setItems(observableList);


        // финальная кнопка
        // при нажатии собирает необходимую информацию.
        // адрес, название и выбранный формат файла (по умолчанию txt)
        // выходит ошибка при закрытии окна выбора директории. разбиратся или нет?))
        // на работу вроде кретически не влияет
        addnewnote.setOnAction(event -> {
            addnewnote.getScene().getWindow().hide();
           NewNoteFile newNoteFile = new NewNoteFile();
           String format = ".txt";
           if (formatnewnote.getValue()!=null){
               format = formatnewnote.getValue();
           }
           GetAdressAndNameAndFormat getAdressAndNameAndFormat =
                   new GetAdressAndNameAndFormat(
                            adressnewnote.getText(),
                            newnotefilename.getText(),
                            format);
           newNoteFile.newNoteFile(getAdressAndNameAndFormat);
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(NoteAppApplication.class.getResource("Noteapp.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 600, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setTitle(newnotefilename.getText());
            stage.setScene(scene);
            stage.show();
            System.out.println("Add new note file.");
        });


        // кнопка выхода с текушего окна и возврат к предыдушему
        closenewnote.setOnAction(event ->{
            closenewnote.getScene().getWindow().hide();
            System.out.println("Close add new note.");
        });

    }

}
