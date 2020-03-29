package com.practice.service;

import org.springframework.stereotype.Service;

@Service
public class Result {
    public String getResult(int marks) {
        if (marks > 50)
            return "Pass";
        else return
                "failed";
    }
}
