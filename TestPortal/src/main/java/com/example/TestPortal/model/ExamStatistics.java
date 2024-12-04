package com.example.TestPortal.model;

import lombok.Data;

@Data
public class ExamStatistics {
    private double averageScore;
    private double highestScore;
    private double lowestScore;
    private int totalSubmissions;
} 