package com.example.techassignment.controller;

import com.example.techassignment.model.RiskResponse;
import com.example.techassignment.model.UserDataRequest;
import com.example.techassignment.service.RiskCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RiskController {

    @Autowired
    private RiskCalculationService riskCalculationService;

    @PostMapping("/calculate-risk")
    public RiskResponse calculateRisk(@RequestBody UserDataRequest request) {
        return riskCalculationService.calculate(request);
    }
}