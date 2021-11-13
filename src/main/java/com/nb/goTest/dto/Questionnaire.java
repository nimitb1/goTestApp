package com.nb.goTest.dto;

import lombok.Data;

import java.util.List;

/**
 * This DTO class will contain the detail of the question to be displayed to the students.
 */
@Data
public class Questionnaire {
    private Integer id;
    private List<QuestionDTO> questions;
    private double maxPoints;
    private double passingPoints;
}
