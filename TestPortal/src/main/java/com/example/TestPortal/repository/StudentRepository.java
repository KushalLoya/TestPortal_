package com.example.TestPortal.repository;

import com.example.TestPortal.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail());
    }

    public void deleteStudent(Long id) {
        String sql = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getStudentId());
    }

    public Student getStudentById(Long id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, studentRowMapper(), id);
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, studentRowMapper());
    }

    private RowMapper<Student> studentRowMapper() {
        return (rs, _) -> {
            Student student = new Student();
            student.setStudentId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            return student;
        };
    }
}
