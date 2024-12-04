package com.example.TestPortal.model;

import lombok.Data;

@Data
public class Answer {
    private int answerId;
    private int submissionId;
    private int questionId;
    private String selectedOption;
    private boolean correct;
} 