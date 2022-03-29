package com.example.noteapp.logic;

import java.io.IOException;

public class NewNoteFile {
    public String newNoteFile(GetAdressAndNameAndFormat getAdressAndNameAndFormat) {
        FileWriterNote fileWriterNote = new FileWriterNote();
        String text = "";
        text = fileWriterNote.fileWriterNote(getAdressAndNameAndFormat.getNoteFileAdress(),"");
        return text;
    }
}
