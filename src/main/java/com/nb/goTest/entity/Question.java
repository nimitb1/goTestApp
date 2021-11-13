package com.nb.goTest.entity;

import com.nb.goTest.utils.Difficulty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO: Add the random text field which should contain the marks, unit#, difficulty[EASY, MEDIUM, HARD].
 * TODO: This filed will be used to create a new question paper.
 */
@Data
@Document(collection = "question_db")
public class Question {

    //Sequence Identifier
    @Transient
    public static final String SEQUENCE_NAME = "question_sequence";

    @Id
    private String id;
    private String question;
    private String[] options = new String[4];
    private String correctOption;
    private Difficulty difficulty;
    private String subject;
    private String instructorId;
    private String marks;
    private String unitNo;
    private String freeText;
}
