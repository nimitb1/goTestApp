package com.nb.goTest.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "answers_db")
public class AnswerAttempted {

    //Sequence Identifier
    @Transient
    public static final String SEQUENCE_NAME = "answer_sequence";

    @Id
    private String id;
    private String answer;
    private String userName;
    private String questionId;
}
