package com.example.noteapp.logic;


// принимаем три строковых значения адрес до файла, имя файла и формат файла
public class GetAdressAndNameAndFormat {
    public String adress(String adress, String name, String format){
        String result = "";
        result=adress+name+format;
        return result;
    }
}
