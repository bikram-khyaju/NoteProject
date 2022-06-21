package com.noteproject.noteProject.repository;

import com.noteproject.noteProject.entity.Notes;
import com.noteproject.noteProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {

    Notes getById(Long id);
    List<Notes> findByUser(User user);

//    List<Notes> findNotesById(String user_id);

}
