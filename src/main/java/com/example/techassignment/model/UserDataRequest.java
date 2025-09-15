package com.example.techassignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDataRequest {
    private double height;
    private double weight;
    private double waistCircumference;
    private String gender;
}
