package com.example.TestPortal.model;

import lombok.Data;

@Data
public class Question {
    private int questionId;
    private int examId;
    private String content;
    private String type; // 'MCQ' or 'ShortAnswer'
    private String options; // JSON-encoded options for MCQs
    private String correctAnswer;
} 