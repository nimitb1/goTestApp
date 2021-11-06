package com.nb.goTest.service;

import com.nb.goTest.entity.Question;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * This interface outlines teh methods required for teh question service.
 * This service will help the users to add, update and remove the questions.
 */
public interface IQuestion {

    public Mono<Question> add(Question question);

    public Flux<Question> fetchByDifficulty(String difficulty);

    public Flux<Question> fetchByType(String type);

    public Flux<Question> fetchByInstructor(String instructorId);

}
