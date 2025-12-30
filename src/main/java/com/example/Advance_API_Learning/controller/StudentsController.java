package com.example.Advance_API_Learning.controller;

import com.example.Advance_API_Learning.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping ("/student")

}
