package com.example.TestPortal.service;

import com.example.TestPortal.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void createExam(int courseId, String title, String description, String date) {
        teacherRepository.createExam(courseId, title, description, date);
    }

    public void updateExam(int examId, String newTitle, String newDescription, String newDate) {
        teacherRepository.updateExam(examId, newTitle, newDescription, newDate);
    }

    public void deleteExam(int examId) {
        teacherRepository.deleteExam(examId);
    }

    // Add other business logic methods as needed
} 