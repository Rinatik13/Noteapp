package com.example.noteapp.logic;

import java.io.IOException;
// реализуем функцию сохранения файла при создании и при простом сохранении файла
public class NewNoteFile {

    public String newNoteFile(GetAdressAndNameAndFormat getAdressAndNameAndFormat) {
        FileWriterNote fileWriterNote = new FileWriterNote();
        String text = "";
        text = fileWriterNote.fileWriterNote(getAdressAndNameAndFormat.getNoteFileAdress(),"");
        return text;
    }

    public void saveNoteFile(GetAdressAndNameAndFormat getAdressAndNameAndFormat, String text){
        FileWriterNote fileWriterNote = new FileWriterNote();
        text = fileWriterNote.fileWriterNote(getAdressAndNameAndFormat.getNoteFileAdress(),text);
    }
}
