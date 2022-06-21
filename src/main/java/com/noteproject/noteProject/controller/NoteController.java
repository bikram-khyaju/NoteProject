package com.noteproject.noteProject.controller;

import com.noteproject.noteProject.entity.Notes;
import com.noteproject.noteProject.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/notes/{id}")
    public Notes getNotesById(@PathVariable("id") Long id){
        return notesService.getNotesById(id);
    }

    @GetMapping("/notesByUserName/{userName}")
        public List<Notes> getByUserName(@PathVariable("userName") String userName){
        return notesService.getByUserName(userName);
        }

    @DeleteMapping("/delete/{id}")
    public String deleteNoteById(@PathVariable("id") Long notesId){
        notesService.deleteNoteById(notesId);
        return "Delete Successfully!!!";

    }

    @PutMapping("notes/{id}")
    public Notes updateNotesById(@PathVariable("id") Long id, @RequestBody Notes notes){
       return notesService.updateNotesById(id,notes);
    }

}
