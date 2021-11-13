package com.nb.goTest.repository;

import com.nb.goTest.entity.Quiz;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuizRepository extends ReactiveMongoRepository<Quiz, Integer> {
}
