package com.devbaktiyarov.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.devbaktiyarov.rest.domain.Student;

// http://localhost:8081/students

@RestController
@RequestMapping("/students")
public class StudentController {

    ArrayList<Student> students = new ArrayList<>(); // БД - студентов

    @PostMapping("/add")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
        students.add(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> listStudent() {
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

    @GetMapping("/bad")
    public ResponseEntity getMethodName() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    

    @DeleteMapping("/del")
    public void deleteStudents() {
        students.clear();
    }



    @GetMapping("/ok")
    public ResponseEntity<Student> getOk() {
        Student student = new Student("Name", 1);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }


    
    

}
