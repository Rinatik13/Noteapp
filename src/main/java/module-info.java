module com.example.noteapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;

    opens com.example.noteapp to javafx.fxml;
    exports com.example.noteapp;
    exports com.example.noteapp.controllers;
    opens com.example.noteapp.controllers to javafx.fxml;
}