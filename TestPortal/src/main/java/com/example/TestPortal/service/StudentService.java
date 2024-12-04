package com.example.TestPortal.service;

import com.example.TestPortal.model.Student;
import com.example.TestPortal.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
} 