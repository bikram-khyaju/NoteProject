package com.noteproject.noteProject.services;
import com.noteproject.noteProject.entity.Notes;
import com.noteproject.noteProject.entity.User;
import com.noteproject.noteProject.repository.NotesRepository;
import com.noteproject.noteProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService{

    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Notes addNotes(Notes notes) {
        // get user by user name

        User user = userRepository.findByUserName(notes.getUser().getUserName());

        notes.setUser(user);

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

    @Override
    public Notes getNotesById(Long id) {
        return notesRepository.findById(id).get();
    }

    @Override
    public List<Notes> getByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        return notesRepository.findByUser(user);
    }

    @Override
    public Notes updateNotesById(Long id, Notes notes) {
        User user = userRepository.findById(notes.getUser().getUserId()).get();
        user.setUserName(notes.getUser().getUserName());
        user.setPassword(notes.getUser().getPassword());
        notes.setUser(user);

        return notesRepository.save(notes);
    }
}
