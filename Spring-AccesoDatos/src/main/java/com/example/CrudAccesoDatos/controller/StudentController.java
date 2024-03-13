package com.example.CrudAccesoDatos.controller;

import com.example.CrudAccesoDatos.entity.Student;
import com.example.CrudAccesoDatos.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {



    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId")Long studentId){
        return studentService.getStudents(studentId);
    }
}


