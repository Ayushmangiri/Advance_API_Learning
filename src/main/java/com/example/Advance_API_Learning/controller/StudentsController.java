package com.example.Advance_API_Learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/students")

public class StudentsController {
    @GetMapping ("/Login")
    public String login(){
        return  "Hey Ayushman you have sucessfully LogedIn";
    }
}
