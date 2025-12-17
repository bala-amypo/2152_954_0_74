package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import com.example.demo.Entity.Studententity;
@Repository
public interface Studentrepo extends JpaRepository<Studententity,Long>{
}
