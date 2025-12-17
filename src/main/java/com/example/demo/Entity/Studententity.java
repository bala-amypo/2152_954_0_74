package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;

@Entity

public class Studententity{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Float cgpa;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public S
}