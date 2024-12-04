package com.example.TestPortal.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository {
    private final JdbcTemplate jdbcTemplate;

    public TeacherRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createExam(int courseId, String title, String description, String date) {
        String sql = "CALL CreateExam(?, ?, ?, ?)";
        jdbcTemplate.update(sql, courseId, title, description, date);
    }

    public void updateExam(int examId, String newTitle, String newDescription, String newDate) {
        String sql = "CALL UpdateExam(?, ?, ?, ?)";
        jdbcTemplate.update(sql, examId, newTitle, newDescription, newDate);
    }

    public void deleteExam(int examId) {
        String sql = "CALL DeleteExam(?)";
        jdbcTemplate.update(sql, examId);
    }

    // Add other teacher-related methods as needed
} 