package com.example.techassignment.service;

import com.example.techassignment.model.RiskResponse;
import com.example.techassignment.model.UserDataRequest;
import org.springframework.stereotype.Service;

@Service
public class RiskCalculationService {

    public RiskResponse calculate(UserDataRequest data) {
        double heightInMeters = data.getHeight() / 100.0;
        double bmi = data.getWeight() / (heightInMeters * heightInMeters);

        String riskLevel;
        String recommendation;

        boolean isWaistNormal;
        if ("male".equalsIgnoreCase(data.getGender())) {
            isWaistNormal = data.getWaistCircumference() <= 94;
        } else { // female
            isWaistNormal = data.getWaistCircumference() <= 80;
        }

        boolean isWaistHigh;
        if ("male".equalsIgnoreCase(data.getGender())) {
            isWaistHigh = data.getWaistCircumference() > 102;
        } else { // female
            isWaistHigh = data.getWaistCircumference() > 88;
        }

        if (bmi >= 30 || isWaistHigh) {
            riskLevel = "Высокий риск ИР";
            recommendation = "Срочно обратитесь к терапевту или эндокринологу.";
        } else if ((bmi >= 25 && bmi < 30) || !isWaistNormal) {
            riskLevel = "Средний риск ИР";
            recommendation = "Рекомендуем как можно скорее обратиться к терапевту или эндокринологу.";
        } else { // bmi < 25 && isWaistNormal
            riskLevel = "Низкий риск ИР";
            recommendation = "У вас низкий риск ИР, но мы рекомендуем обратиться к терапевту для профилактики.";
        }

        return new RiskResponse(bmi, riskLevel, recommendation);
    }
}