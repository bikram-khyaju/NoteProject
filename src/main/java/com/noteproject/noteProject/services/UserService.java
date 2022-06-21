package com.noteproject.noteProject.services;

import com.noteproject.noteProject.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    List<User> getAllUser();

    void deleteUserById(Long userId);
}
