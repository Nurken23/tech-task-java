package com.example.techassignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RiskResponse {
    private double bmi;
    private String riskLevel;
    private String recommendation;
}