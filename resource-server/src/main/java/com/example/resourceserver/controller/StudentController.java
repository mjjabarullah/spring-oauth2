package com.example.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        IntStream.range(1, 10).forEach(number -> {
            students.add(new Student("name" + number, "email" + number + "@gmail.com"));
        });
        return students;
    }

    record Student(String name, String email) {
    }
}
