package com.example.noteapp.logic;

import java.io.IOException;

public class NewNoteFile {
    public String newNoteFile(GetAdressAndNameAndFormat getAdressAndNameAndFormat) {
        FileReaderNote fileReaderNote = new FileReaderNote();
        String text = "";
        try {
            text = fileReaderNote.fileReaderNote(getAdressAndNameAndFormat.getNoteFileAdress());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
