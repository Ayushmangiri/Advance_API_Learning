package com.example.Advance_API_Learning.controller;

import com.example.Advance_API_Learning.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")

public class StudentsController {
    @GetMapping("/login")
    public String login() {
        return "Hey Ayushman you have sucessfully LogedIn";
    }

    @GetMapping("/student/details")
    public Student getStudents(){
    Student s1 = new Student();
    s1.setName("AYUSHMAN");
    s1.setCourse("MCA");
        return s1;
    }
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student)
    {
        return Student;
    }
    @PutMapping

}
