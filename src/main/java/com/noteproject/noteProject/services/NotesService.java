package com.noteproject.noteProject.services;

import com.noteproject.noteProject.entity.Notes;

import java.util.List;

public interface NotesService {
    Notes addNotes(Notes notes);

    List<Notes> getNotes();

    void deleteNoteById(Long notesId);
}
