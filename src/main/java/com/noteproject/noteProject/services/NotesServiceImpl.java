package com.noteproject.noteProject.services;
import com.noteproject.noteProject.entity.Notes;
import com.noteproject.noteProject.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService{

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes addNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public List<Notes> getNotes() {
        return notesRepository.findAll();
    }

    @Override
    public void deleteNoteById(Long notesId) {
        notesRepository.deleteById(notesId);
    }
}
