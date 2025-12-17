package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.wed.bind.annotation.DeleteMapping;
import org.springframework.wed.bind.annotation.GetMapping;
import org.springframework.wed.bind.annotation.PathVariable;
import org.springframework.wed.bind.annotation.PostMapping;
import org.springframework.wed.bind.annotation.PutMapping;
import org.springframework.wed.bind.annotation.RequestBody;
import org.springframework.wed.bind.annotation.RestController;

import com.example.demo.Entity.Studententity;
import com.example.demo.Server.Studentservice;

@RestController
public class Studentcontroller{

    @Autowired
    Studentservice studentService;

    @PostMapping("/PostStudent")
    public Student postStd(@RequestBody Student st){
        return studentService.getAllStudents();
    }
    @GetMapping("/getAll")
    public List<Student> get(@PathVariable Long id){
        return studentService.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Optional<Student> get(@PathVariable Long id){
        return studentService.getOneStudent(id);
    }
    @PutMapping("/update{id}")
    public String ipdateStudent(@PathVariable Long is,@RequestBody Student st){
        Optional<Student> student=studentService.getOneStudent(id);
        if(student.isPresent()){
            Student newStudent=student.get();
            newStudent.setId(id);
            studentService.insertStudent(newStudent);
            return "Updated Success";
        }
        return "Student Not Found";
    }
    
}