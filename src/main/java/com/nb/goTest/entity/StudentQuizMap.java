package com.nb.goTest.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

/**
 * This entity represents the data which maps the quiz to a list of students.
 * TODO: Verify the impact of storing the students in the list and gettig
 */
@Data
public class StudentQuizMap {

    //Sequence Identifier
    @Transient
    public static final String SEQUENCE_NAME = "sq_map_sequence";

    @Id
    private String id;
    private String studentId;
    private String studentEmailId;
    private String quizId;
    private boolean active;
}
