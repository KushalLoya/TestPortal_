package com.example.TestPortal.model;

import lombok.Data;
import java.util.Date;

@Data
public class Exam {
    private int examId;
    private String title;
    private String description;
    private Date date;
    private int courseId;
} 