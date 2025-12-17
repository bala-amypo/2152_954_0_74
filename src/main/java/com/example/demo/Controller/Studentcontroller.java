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

    @
}