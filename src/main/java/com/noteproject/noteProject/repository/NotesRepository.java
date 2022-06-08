package com.noteproject.noteProject.repository;

import com.noteproject.noteProject.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {

}
