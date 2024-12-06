package com.example.TestPortal.model;

import lombok.Data;
import java.util.Date;

@Data
public class Submission {
    private int submissionId;
    private int studentId;
    private int examId;
    private double totalScore;
    private Date submissionDate;
} 