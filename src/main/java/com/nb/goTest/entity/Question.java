package com.nb.goTest.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String difficulty;
    private String subject;
    private String instructorId;
}
