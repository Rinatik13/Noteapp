package com.example.noteapp.logic;


// принимаем три строковых значения адрес до файла, имя файла и формат файла
public class GetAdressAndNameAndFormat {
    String adress;
    String name;
    String format;

    public GetAdressAndNameAndFormat() {
    }

    public GetAdressAndNameAndFormat(String adress, String name, String format) {
        this.adress = adress;
        this.name = name;
        this.format = format;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
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

    public String getNoteFileAdress(){
        String result = "";
        result=adress+name+format;
        return result;
    }
}
