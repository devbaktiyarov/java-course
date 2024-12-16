package com.devbaktiyarov.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.devbaktiyarov.rest.domain.Student;
import com.devbaktiyarov.rest.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// /wp/post

@RestController
@RequestMapping("/wp")
public class RestControllerWP {
    
    @GetMapping
    public String getGroup() {
        return "WP9/10";
    }

    @PostMapping("/post")
    public User postMethodName(@RequestBody User user) {
        return user;
    }

    @PostMapping("/form")
    public String postMethodName(@RequestParam String name) {
        Student s = new Student(name, 9);
        return s.toString();
    }
    


    
    

}
