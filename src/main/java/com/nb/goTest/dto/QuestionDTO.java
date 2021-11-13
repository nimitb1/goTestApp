package com.nb.goTest.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class QuestionDTO {

    private String question;
    private List<String> options;
    private double points;
}
