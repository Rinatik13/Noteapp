package com.example.noteapp.noteobject;

// Основной класс который хранит информацию по тексту.
// Хранится имя, формат, адрес и текст.

public class Notefile {
    String name;
    String format;
    String adress;
    String text;

    public Notefile() {
    }

    public Notefile(String name, String format, String adress, String text) {
        this.name = name;
        this.format = format;
        this.adress = adress;
        this.text = text;
    }

    public Notefile(String name, String format, String adress) {
        this.name = name;
        this.format = format;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
