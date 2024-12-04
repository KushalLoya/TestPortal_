package com.example.TestPortal.service;

import com.example.TestPortal.repository.SystemRepository;
import org.springframework.stereotype.Service;

@Service
public class SystemService {
    private final SystemRepository systemRepository;

    public SystemService(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    public void calculateTotalScoreForSubmission(int submissionId) {
        systemRepository.calculateTotalScoreForSubmission(submissionId);
    }

    // Add other business logic methods as needed
} 