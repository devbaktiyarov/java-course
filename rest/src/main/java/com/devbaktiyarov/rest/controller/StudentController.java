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
import com.devbaktiyarov.rest.service.StudentService;

// http://localhost:8081/students

@RestController
@RequestMapping("/students")
public class StudentController {

    
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
        service.save(student);
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(student);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> listStudent() {
        return ResponseEntity.status(HttpStatus.OK)
            .body(service.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteStudents(@PathVariable int id) {
        service.deleteById(id);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(service.findById(id));
    }


    
    

}
