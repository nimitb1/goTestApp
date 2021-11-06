package com.nb.goTest.repo;

import com.nb.goTest.entity.Question;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuestionRepository extends ReactiveMongoRepository<Question, Integer> {
}
