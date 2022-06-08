package com.noteproject.noteProject.controller;

import com.noteproject.noteProject.entity.Notes;
import com.noteproject.noteProject.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NotesService notesService;

    @PostMapping("/notes")
    public Notes addNotes(@RequestBody Notes notes){
       return notesService.addNotes(notes);
    }

    @GetMapping("/notes")
    public List<Notes> getNotes(){
        return notesService.getNotes();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteNoteById(@PathVariable("id") Long notesId){
        notesService.deleteNoteById(notesId);
        return "Delete Successfully!!!";

    }

}
