package com.noteproject.noteProject.entity;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Notes")
public class Notes {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NOTE_ID")
    private Long noteId;
    public String description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "USER_ID", unique = false)
    private User user;

}