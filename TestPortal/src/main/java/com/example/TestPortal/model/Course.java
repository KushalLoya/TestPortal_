package com.example.TestPortal.model;

import lombok.Data;

@Data
public class Course {
    private int courseId;
    private String courseName;
    private String description;
    private int teacherId;
} 