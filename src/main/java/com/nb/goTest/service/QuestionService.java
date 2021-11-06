package com.nb.goTest.service;

import com.nb.goTest.entity.Question;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class QuestionService implements IQuestion{
    @Override
    public Mono<Question> add(Question question) {
        return null;
    }

    @Override
    public Flux<Question> fetchByDifficulty(String difficulty) {
        return null;
    }

    @Override
    public Flux<Question> fetchByType(String type) {
        return null;
    }

    @Override
    public Flux<Question> fetchByInstructor(String instructorId) {
        return null;
    }
}
