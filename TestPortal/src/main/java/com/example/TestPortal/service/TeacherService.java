package com.example.TestPortal.service;

import com.example.TestPortal.model.Course;
import com.example.TestPortal.model.Exam;
import com.example.TestPortal.model.Question;
import com.example.TestPortal.model.Student;
import com.example.TestPortal.model.ExamStatistics;
import com.example.TestPortal.model.QuestionStatistics;
import com.example.TestPortal.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public int createExam(Exam exam) {
        return teacherRepository.createExam(
            exam.getTitle(),
            exam.getDescription(),
            exam.getDate(),
            exam.getCourseId()
        );
    }

    public void addQuestion(Question question) {
        teacherRepository.addQuestion(question);
    }

    public void deleteQuestion(int questionId) {
        teacherRepository.deleteQuestion(questionId);
    }

    public List<Exam> getTeacherExams(int teacherId) {
        return teacherRepository.getTeacherExams(teacherId);
    }

    public void updateExam(int examId, Exam exam) {
        teacherRepository.updateExam(examId, exam.getTitle(), 
            exam.getDescription(), exam.getDate());
    }

    public List<Question> getExamQuestions(int examId) {
        return teacherRepository.getExamQuestions(examId);
    }

    public List<Student> getEnrolledStudents(int teacherId, int courseId) {
        return teacherRepository.getEnrolledStudents(teacherId, courseId);
    }

    public List<Course> getTeacherCourses(int teacherId) {
        return teacherRepository.getTeacherCourses(teacherId);
    }

    public void updateQuestion(Question question) {
        teacherRepository.updateQuestion(question);
    }

    public ExamStatistics getExamStatistics(int examId) {
        return teacherRepository.getExamStatistics(examId);
    }

    public QuestionStatistics getQuestionStatistics(int questionId) {
        return teacherRepository.getQuestionStatistics(questionId);
    }
} 