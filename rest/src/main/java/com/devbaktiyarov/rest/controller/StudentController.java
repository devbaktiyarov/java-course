package com.devbaktiyarov.rest.controller;

import java.util.ArrayList;
import java.util.List;

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

@RestController
@RequestMapping("/api")
public class StudentController {

    ArrayList<Student> students = new ArrayList<>();


    @GetMapping
    public Student getStudent() {
        return new Student("Razak", 1);
    }

    @GetMapping("/malika")
    public Student getMalika() {
        return new Student("Malika", 2);
    }

    @PostMapping("/addStudent")
    public boolean addNewStudent(@RequestBody Student student) {
        students.add(student);
        return true;
    }

    @GetMapping("/list")
    public List<Student> listStudent() {
        return students;
    }

}
