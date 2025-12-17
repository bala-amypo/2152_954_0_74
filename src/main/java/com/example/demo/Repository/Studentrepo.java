package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.repository;
import com.example.demo.Studententity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
