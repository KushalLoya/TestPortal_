package com.example.TestPortal.model;

import lombok.Data;

@Data
public class QuestionStatistics {
    private int totalAttempts;
    private int correctAnswers;
    private double successRate;
} 