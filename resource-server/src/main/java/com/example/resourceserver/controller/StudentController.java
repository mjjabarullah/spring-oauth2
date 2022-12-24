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
        return IntStream
                .range(0, 10)
                .mapToObj(number -> new Student("name" + number, "email" + number + "@gmail.com"))
                .toList();
    }

    record Student(String name, String email) {
    }
}
