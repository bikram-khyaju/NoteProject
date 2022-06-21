package com.noteproject.noteProject.services;

import com.noteproject.noteProject.entity.Notes;

import java.util.List;

public interface NotesService {
    Notes addNotes(Notes notes);

    List<Notes> getNotes();

    void deleteNoteById(Long notesId);

    Notes getNotesById(Long id);

    List<Notes> getByUserName(String userName);

    Notes updateNotesById(Long id, Notes notes);

//    List<Notes> getNotesByUserId(String user_id);
}
