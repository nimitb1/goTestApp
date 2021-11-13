package com.nb.goTest.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * This class represents the question paper. This could be either set up by an examiner or randomly.
 */
@Data
@Document(collection = "quiz_db")
public class Quiz {

    //Sequence Identifier
    @Transient
    public static final String SEQUENCE_NAME = "quiz_sequence";

    @Id
    private Integer id;
    private String questionCount;
    private List<String> questions;
    private double maxMarks;
    private double passingMarks;
    private boolean displayPassStatus;
    private boolean displayMarks;
}
