package com.devbaktiyarov.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devbaktiyarov.rest.domain.Student;
import com.devbaktiyarov.rest.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    
    public void save(Student student) {
        repository.save(student);
    }

    public Student findById(int id) {
        Optional<Student> student = repository.findById(id);
        if(student.isPresent()) {
            return student.get();
        }
        return null;
    }
 
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
    
    
}
