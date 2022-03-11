package com.example.noteapp.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Метод класса получает адрес файла в виде текстового сообщения и возвращает стринговое значение
// текста который находится в файле.

public class FileReaderNote {

    public String fileReaderNote(String adress) throws IOException {
        String result = "";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(adress);
            char charText;
            int fileText;

            while ((fileText=fileReader.read())!=-1){
                result = result + Character.toString(fileText);
            }
            return result;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fileReader.close();
        }
        return result;
    }
}
