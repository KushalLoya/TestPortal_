package com.example.TestPortal.controller;

import com.example.TestPortal.service.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/createExam")
    public void createExam(@RequestParam int courseId, @RequestParam String title, @RequestParam String description, @RequestParam String date) {
        teacherService.createExam(courseId, title, description, date);
    }

    @PutMapping("/updateExam/{examId}")
    public void updateExam(@PathVariable int examId, @RequestParam String newTitle, @RequestParam String newDescription, @RequestParam String newDate) {
        teacherService.updateExam(examId, newTitle, newDescription, newDate);
    }

    @DeleteMapping("/deleteExam/{examId}")
    public void deleteExam(@PathVariable int examId) {
        teacherService.deleteExam(examId);
    }

    // Add other endpoints as needed
} 