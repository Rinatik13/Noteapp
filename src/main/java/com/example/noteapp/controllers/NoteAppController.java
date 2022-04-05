package com.example.noteapp.controllers;

import com.example.noteapp.NoteAppApplication;
import com.example.noteapp.logic.FileWriterNote;
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

public class NoteAppController{

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
    private MenuItem appInfo;

    @FXML
    void initialize() {

        // проверяем если есть текст в принятом новом файле то этот текст передаём в переменную для отображения
        // данной информации в прилложении

        if (notefile.getText() != null){
            textnote.setText(notefile.getText());
        }

        // открываем окно выбора директории для нового файла, ввода названия файла
        // и выбора формата файла (по умолчанию txt)
        // не реализовано закрытие начального окна после создания нового файла
        // приходится закрывать вручную
        // как это исправить я незнаю
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
            scene = new Scene(fxmlLoader.load(), 317, 155);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Open note file");
        stage.setScene(scene);
        stage.show();
    });


    // реализуем механизам сохранения файлов
    // сначала проверяем есть ли какая либо информация по адресу файла куда сохранять.
        // если адреса нету (он null) то выходит окно о выборе адреса для файла, имени и формата
    savenote.setOnAction(event -> {
        System.out.println("Save Note file");
        if (notefile.getAdress()==null){
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader((NoteAppApplication.class.getResource("savenotefile.fxml")));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(),317, 228);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            stage.setTitle("Save as");
            stage.setScene(scene);
            stage.show();
        }

        // реализуем функцию сохранения дайла по уже имеюшемеся адресу.
        // перезаписывает новые данные в файл

        else {
            FileWriterNote fileWriterNote = new FileWriterNote();
            fileWriterNote.fileWriterNote(notefile.getAdress()
                    +notefile.getName()
                    +notefile.getFormat(),
                    textnote.getText());
        }

    });
            // открываем окно где можем сохранить файл по новому адресу, имени и формату.
    saveasnote.setOnAction(event -> {
        System.out.println("Save Ass Note file");
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader((NoteAppApplication.class.getResource("savenotefile.fxml")));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(),317, 228);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        stage.setTitle("Save as");
        stage.setScene(scene);
        stage.show();
    });

    // открываем окно где уточняем у пользователя!
    // точно ли он хочет закрыть сеё творение?)
    exit.setOnAction(event -> {
        System.out.println("Close Note App");

    });

    appInfo.setOnAction(event->{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader((NoteAppApplication.class.getResource("appInfo.fxml")));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(),317, 228);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        stage.setTitle("Info");
        stage.setScene(scene);
        stage.show();
    });

    }

    public void myFunction(String text){
        textnote.setText(text);
    }

    // реализуем передачу данных о файле в главное окно
    public NoteAppController(Notefile notefile){
        this.notefile = notefile;
    }

    public NoteAppController() {
    }
}