package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import com.example.demo.Studententity.Student;

public interface Studentservice{
    Student insertStudent(Student st);

    List<Student> getAllStudents();

    Optional<Student> getOneStudent(Local id);

    void deleteStudent(Long id);
}