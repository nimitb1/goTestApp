package com.nb.goTest.service;

import com.nb.goTest.dto.Questionnaire;
import com.nb.goTest.entity.Quiz;

/**
 * Service class to set-up the quiz and to serve the quiz to the students.
 * TODO: For future- automate the question paper generation based ont eh difficulty, unit and marks.
 */
public interface IQuizService {

    public Quiz save(Quiz quiz);

    public Questionnaire getData(String studentEmail, String studentId);
}
