package com.noteproject.noteProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long noteId;

    public  String description;

    public Notes(long noteId, String description) {
        this.noteId = noteId;
        this.description = description;
    }

    public Notes(){

    }

    public long getNoteId() {
        return noteId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
