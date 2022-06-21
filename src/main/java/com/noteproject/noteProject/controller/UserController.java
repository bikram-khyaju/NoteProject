package com.noteproject.noteProject.controller;


import com.noteproject.noteProject.entity.User;
import com.noteproject.noteProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody  User user){

        return userService.addUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserbyId(@PathVariable("id") Long userId){
        userService.deleteUserById(userId);
        return "User deleted successuflly!!!";
    }
}
