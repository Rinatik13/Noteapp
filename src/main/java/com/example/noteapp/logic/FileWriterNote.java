package com.example.noteapp.logic;

import java.io.FileWriter;
import java.io.IOException;

// Получем два значения, Адрес файла с именем и форматом, и сам текст.
// В данном классе создаётся файл по указанному адресу и заполняется текстом.
public class FileWriterNote {
    public void fileWriterNote(String adress, String text){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(adress);
            fileWriter.write(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
